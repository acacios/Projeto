package modelo;

import java.io.Serializable;

public class Material implements Serializable{
		
	 private int id;
	 private String  produto;
	 private Integer  valor ;
	 private String  tipo_produto ;
 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public Integer getValor() {
		return valor;
	}
	public void setValor(Integer valor) {
		this.valor = valor;
	}
	public String getTipo_produto() {
		return tipo_produto;
	}
	public void setTipo_produto(String tipo_produto) {
		this.tipo_produto = tipo_produto;
	}

	public Material(int id, String produto, Integer valor, String tipo_produto
			) {
		super();
		this.id = id;
		this.produto = produto;
		this.valor = valor;
		this.tipo_produto = tipo_produto;
	}
		
	public Material(String produto, Integer valor, String tipo_produto) {
		super();
		this.produto = produto;
		this.valor = valor;
		this.tipo_produto = tipo_produto;
	}
	public Material() {
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	 

}