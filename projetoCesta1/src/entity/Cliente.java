package entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name="seq_cliente",sequenceName="seq_cliente")
public class Cliente implements Serializable{
  	private static final long serialVersionUID = 1L;
  	
  	@Id
  	@GeneratedValue(generator="seq_cliente")
  	@Column
  	private Integer idCliente;
  	@Column(length=35)
  	private String nome;
  	
  	     @OneToOne(mappedBy="cliente",cascade=CascadeType.ALL)
	     private Venda venda;
  	 
  	     
  	public Cliente(Integer idCliente, String nome) {
		super();
		this.idCliente = idCliente;
		this.nome = nome;
	}
  	
  	public Cliente() {
	}

  	
	public Cliente(Venda venda) {
		super();
		this.venda = venda;
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Venda getVenda() {
		return venda;
	}

	public void setVenda(Venda venda) {
		this.venda = venda;
	}
  	
  	//construtor vazio, cheio, toString
  	
  	
  	
  	
  	
  	

}
