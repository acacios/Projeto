package entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Login {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	 private Integer idLogin;    
	@Column(length=35, unique=true)
	 private String  login;
	@Column(length=100)
	 private String  senha;
	@OneToMany(mappedBy="login",fetch=FetchType.EAGER)
	 private List<Chat> listachat;  

	
	
	 public Login() {
    }
	 

	 
	public Login(Integer idLogin, String login, String senha) {
		super();
		this.idLogin = idLogin;
		this.login = login;
		this.senha = senha;
	}




	@Override
	public String toString() {
		return "Login [idLogin=" + idLogin + ", login=" + login + "]";
	}




	public Integer getIdLogin() {
		return idLogin;
	}
	public void setIdLogin(Integer idLogin) {
		this.idLogin = idLogin;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	 
	 
	 
}
