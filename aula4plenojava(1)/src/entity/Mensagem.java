package entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@SequenceGenerator(name="seqmensagem", sequenceName="seqmensagem")
public class Mensagem {

	@Id
	@GeneratedValue(generator="seqmensagem")
	@Column
	private Integer idMensagem;
	@Column
	private String titulo;
	@Column(columnDefinition="CLOB")
	private String texto;
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataMensagem;
	@ManyToOne
	@JoinColumn(name="id_usuario")
	private Usuario usuario;
	@OneToMany(mappedBy="mensagem")
	private List<Comentario> comentario;
	
	public Mensagem(Integer idMensagem, String titulo, String texto,
			Date dataMensagem, Usuario usuario) {
		super();
		this.idMensagem = idMensagem;
		this.titulo = titulo;
		this.texto = texto;
		this.dataMensagem = dataMensagem;
		this.usuario = usuario;
	}
	public Mensagem() {
		super();
	}
	
	public List<Comentario> getComentario() {
		return comentario;
	}
	public void setComentario(List<Comentario> comentario) {
		this.comentario = comentario;
	}
	public Integer getIdMensagem() {
		return idMensagem;
	}
	public void setIdMensagem(Integer idMensagem) {
		this.idMensagem = idMensagem;
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
	public Date getDataMensagem() {
		return dataMensagem;
	}
	public void setDataMensagem(Date dataMensagem) {
		this.dataMensagem = dataMensagem;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	@Override
	public String toString() {
		return "Mensagem [idMensagem=" + idMensagem + ", titulo=" + titulo
				+ ", texto=" + texto + ", dataMensagem=" + dataMensagem
				+ ", usuario=" + usuario + "]";
	}
	
	
	
}
