package entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name="seq_produto",sequenceName="seq_produto")
public class Produto {
@Id
@GeneratedValue(generator="seq_produto")
@Column
	private Integer idProduto;
@Column(length=35)
	private String  nomeProduto;
@Column
	private Double preco;
@Column
 	private Integer quantidade;
	           @ManyToMany(mappedBy="produtos")
               private List<Venda> vendas;
     
               //Cliente _1p1 Venda
               //Venda_ npM Produto
               // itensVenda_ tabelarelacionak
               
	public Produto() {
	}

	public Produto(Integer idProduto, String nomeProduto, Double preco,
			Integer quantidade) {
		super();
		this.idProduto = idProduto;
		this.nomeProduto = nomeProduto;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public Integer getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Integer idProduto) {
		this.idProduto = idProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public List<Venda> getVendas() {
		return vendas;
	}

	public void setVendas(List<Venda> vendas) {
		this.vendas = vendas;
	}
	
	
	
	
	
}
