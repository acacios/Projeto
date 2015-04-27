package entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@SequenceGenerator(name = "seq_venda", sequenceName = "seq_venda")
public class Venda implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(generator = "seq_venda")
	@Column
	private Integer idVenda;
	@Temporal(TemporalType.DATE)
	@Column
	private Date dataVenda;

	   @OneToOne(cascade = CascadeType.ALL)
	   @JoinColumn(name = "id_cliente")
	   private Cliente cliente;

	   @ManyToMany(cascade=CascadeType.ALL)
	   @JoinTable(name="itensvenda",
	    joinColumns=@JoinColumn(name="id_venda"),
	    inverseJoinColumns=@JoinColumn(name="id_produto")
	   )
	   private List <Produto> produtos;
	   
//Cliente _ idCliente, nome
//Produto _ idProduto, produto,preco,quantidade
//Venda   _idVenda, data, (id_cliente)
//itensvenda _ id_venda, id_produto	   
	   
	public Venda() {

	}

	public Venda(Integer idVenda, Date dataVenda, Cliente cliente) {
		super();
		this.idVenda = idVenda;
		this.dataVenda = dataVenda;
		this.cliente = cliente;
	}

	public Integer getIdVenda() {
		return idVenda;
	}

	public void setIdVenda(Integer idVenda) {
		this.idVenda = idVenda;
	}

	public Date getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(Date dataVenda) {
		this.dataVenda = dataVenda;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	

}
