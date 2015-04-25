package manager;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;

import persistence.ChatDao;
import persistence.LoginDao;
import entity.Chat;
import entity.Login;

@ManagedBean(name = "mb")
@SessionScoped
// request é na mesma página
public class ManagerBean {

	private Login login;
	private Chat chat;
	private List<SelectItem> listaLogin1; // new (combo)

	private List<Chat> listaChat;

	private List<Chat> listaChatde;

	private Integer cod;
	private String de;
	private String para;
	private String mensagem;

	public ManagerBean() {
		login = new Login();
		chat = new Chat();
	}

	public String cadastrado() {
		login = new Login();

		return "sistema.jsf";

	}

	public String nCadastrado() {
		login = new Login();

		return "ncadastrado.jsf";

	}

	public String cadastrar() {
		FacesContext fc = FacesContext.getCurrentInstance();
		ValidacaoUsuario vu = new ValidacaoUsuario();
		String msg = null;
		try {
			if (!vu.isNome(login)) {
				msg += " Nome Invalido ";
				login = new Login();
				fc.addMessage("form1", new FacesMessage("login nulo"));
				return msg;

			}
			if (vu.isNome(login)) {
				new LoginDao().gravar(login);

				msg = "Dados Gravados";
				fc.addMessage("form1", new FacesMessage("cadastrado"));
				login = new Login();
				return "sistema.jsf";

			}

			new LoginDao().gravar(login);

			msg = "Dados Gravados";
			fc.addMessage("form1", new FacesMessage(" cadastrado"));
			login = new Login();
			return "sistema.jsf";

		} catch (Exception ex) {
			fc.addMessage("form1", new FacesMessage("login ja cadastrado"));
			login = new Login();
			return null;

		}

	}

	public String logar() {
		FacesContext fc = FacesContext.getCurrentInstance();
		try {
			login = new LoginDao().isLogar(login); // achou cheio, não achou
													// vazio (null) ...
			de = login.getLogin();
			cod = login.getIdLogin();
			if (login != null) {
				return "chat.jsf";
			}
			fc.addMessage("form1", new FacesMessage("Dados Invalidos"));
		} catch (Exception ex) {
			fc.addMessage("form1",
					new FacesMessage("Favor preencher os campos"));
			login = new Login();

		}
		return null;
	}

	public Chat getChat() {
		return chat;
	}

	public void setChat(Chat chat) {
		this.chat = chat;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	public List<SelectItem> getListaLogin1() {
		listaLogin1 = new ArrayList<SelectItem>();
		listaLogin1.clear();

		if (new LoginDao().findByAllException(login.getLogin()).size() > 0) {
			for (Login lo : new LoginDao().findByAllException(login.getLogin())) {

				listaLogin1.add(new SelectItem(lo.getLogin()));

			}
		}
		return listaLogin1;
	}

	public void setListaLogin1(List<SelectItem> listaLogin1) {
		this.listaLogin1 = listaLogin1;
	}

	public String getPara() {
		return para;
	}

	public void setPara(String para) {
		this.para = para;
	}

	public String getDe() {
		return de;
	}

	public void setDe(String de) {
		this.de = de;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public List<Chat> getListaChat() {
		listaChat = new ChatDao().findAll();
		return listaChat;
	}

	public void setListaChat(List<Chat> listaChat) {
		this.listaChat = listaChat;
	}

	public void gravaMensagem() {
		FacesContext fc = FacesContext.getCurrentInstance();
		try {
			Login quem = new LoginDao().isDeQuem(login.getIdLogin());

			Chat c1 = new Chat();

			c1.setCodigoDe(quem.getIdLogin());

			c1.setDe(de);
			c1.setMensagem(mensagem);

			Login loginPara = new LoginDao().isBuscaPeloNome(para);

			new ChatDao().create(c1, loginPara);

			mensagem = "";

			fc.addMessage("form2", new FacesMessage("Mensagem Enviada"));
		} catch (Exception ex) {
			fc.addMessage("form2",
					new FacesMessage("Dados Errados :" + ex.getMessage()));
		}

	}

	public List<Chat> getListaChatde() {
		listaChatde = new ArrayList<Chat>();
		try {
			listaChatde = new ChatDao().findAllByLogin(cod);
		} catch (Exception ex) {

		}

		return listaChatde;
	}

	public void setListaChatde(List<Chat> listaChatde) {
		this.listaChatde = listaChatde;
	}

	public Integer getCod() {
		return cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

}
