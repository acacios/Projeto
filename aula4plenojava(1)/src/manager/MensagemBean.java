package manager;

import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import persistence.MensagemDao;

import entity.Mensagem;
import entity.Usuario;

@ManagedBean(name="mBean")
@RequestScoped
public class MensagemBean {

	private Mensagem mensagem;
	
	public MensagemBean() {
		mensagem = new Mensagem();
	}

	public Mensagem getMensagem() {
		return mensagem;
	}

	public void setMensagem(Mensagem mensagem) {
		this.mensagem = mensagem;
	}
	
	public void cadastrarMensagem(){
		FacesContext fc = FacesContext.getCurrentInstance();
		try{
			HttpSession session = ((HttpServletRequest) fc.getExternalContext()
					.getRequest()).getSession();
			Integer id = (Integer) session.getAttribute("id");
			Usuario user = new Usuario();
			user.setIdUsuario(id);
			
			mensagem.setUsuario(user);
			mensagem.setDataMensagem(new Date());
			
			new MensagemDao().cadastrar(mensagem);
			fc.addMessage("form1", new FacesMessage("Mensagem cadastrada com sucesso!"));
		}catch(Exception e){
			fc.addMessage("form1", new FacesMessage(e.getMessage()));
		}
	}
	
	
}
