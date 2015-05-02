package entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name="sequsuario", sequenceName="sequsuario")
public class Usuario {

	@Id
	@GeneratedValue(generator="sequsuario")
	@Column
	private Integer idUsuario;
	@Column(unique=true)
	private String login;
	@Column
	private String senha;
	@OneToMany(mappedBy="usuario")
	private List<Mensagem> mensagem;
	
	@OneToMany(mappedBy="usuario")
	private List<Comentario> comentario;
	
	public Usuario(Integer idUsuario, String login, String senha) {
		super();
		this.idUsuario = idUsuario;
		this.login = login;
		this.senha = senha;
	}
	public Usuario() {
		super();
	}
	
	public List<Mensagem> getMensagem() {
		return mensagem;
	}
	public void setMensagem(List<Mensagem> mensagem) {
		this.mensagem = mensagem;
	}
	public List<Comentario> getComentario() {
		return comentario;
	}
	public void setComentario(List<Comentario> comentario) {
		this.comentario = comentario;
	}
	public Integer getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
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
	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", login=" + login
				+ ", senha=" + senha + "]";
	}
	
	
	
}
