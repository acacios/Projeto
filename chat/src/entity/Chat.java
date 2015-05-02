package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Chat {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private Integer idChat;
	@Column
	private String mensagem;
	@Column
	private String de;
 	@Column
	private Integer codigoDe;
	 	
 	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="id_login")
	private Login login;

	public Chat() {
	 }
 

	public Chat(Integer idChat, String mensagem, String de, Integer codigoDe,
			Login login) {
		super();
		this.idChat = idChat;
		this.mensagem = mensagem;
		this.de = de;
		this.codigoDe = codigoDe;
		this.login = login;
	}


	@Override
	public String toString() {
		return "Chat [idChat=" + idChat + ", mensagem=" + mensagem + ", de="
				+ de + ", codigoDe=" + codigoDe + ", login=" + login + "]";
	}

	public Integer getIdChat() {
		return idChat;
	}
	public void setIdChat(Integer idChat) {
		this.idChat = idChat;
	}
	public Integer getCodigoDe() {
		return codigoDe;
	}
	public void setCodigoDe(Integer codigoDe) {
		this.codigoDe = codigoDe;
	}
	 
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public String getDe() {
		return de;
	}
	public void setDe(String de) {
		this.de = de;
	}
	 
	public Login getLogin() {
		return login;
	}
	public void setLogin(Login login) {
		this.login = login;
	}
	 
	
	 
    
	
	
	
	
	 
	 
	
	
}
