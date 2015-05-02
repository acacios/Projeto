package manager;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import persistence.UsuarioDao;

import entity.Usuario;

@ManagedBean(name="uBean")
@SessionScoped
public class UsuarioBean {

	private Usuario usuario;
	
	public UsuarioBean() {
		usuario = new Usuario();
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public String logar(){
		try{
			
			UsuarioDao ud = new UsuarioDao();
			Usuario user = ud.logar(usuario);
			if(user != null){
				HttpSession session = ((HttpServletRequest) FacesContext.getCurrentInstance()
						.getExternalContext().getRequest()).getSession();
				session.setAttribute("id", user.getIdUsuario());
				session.setAttribute("login", user.getLogin());
				usuario = user;
				return "admin/index.xhtml";
			}else{
				FacesContext.getCurrentInstance().addMessage("form1", 
						new FacesMessage("USUARIO INVALIDO"));
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
}
