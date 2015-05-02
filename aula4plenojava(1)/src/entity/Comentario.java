package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name="seqcomentario", sequenceName="seqcomentario")
public class Comentario {

	@Id
	@GeneratedValue(generator="seqcomentario")
	@Column
	private Integer idComentario;
	@Column
	private String titulo;
	@Column(columnDefinition="CLOB")
	private String texto;
	
	@ManyToOne
	@JoinColumn(name="id_usuario")
	private Usuario usuario;
	@ManyToOne
	@JoinColumn(name="id_mensagem")
	private Mensagem mensagem;
	
	public Comentario(Integer idComentario, String titulo, String texto,
			Usuario usuario, Mensagem mensagem) {
		super();
		this.idComentario = idComentario;
		this.titulo = titulo;
		this.texto = texto;
		this.usuario = usuario;
		this.mensagem = mensagem;
	}
	public Comentario() {
		super();
	}
	public Integer getIdComentario() {
		return idComentario;
	}
	public void setIdComentario(Integer idComentario) {
		this.idComentario = idComentario;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Mensagem getMensagem() {
		return mensagem;
	}
	public void setMensagem(Mensagem mensagem) {
		this.mensagem = mensagem;
	}
	@Override
	public String toString() {
		return "Comentario [idComentario=" + idComentario + ", titulo="
				+ titulo + ", texto=" + texto + ", usuario=" + usuario
				+ ", mensagem=" + mensagem + "]";
	}
	
	
	
}
