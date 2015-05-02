package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * exemplo de relacionamento de muitos telefones, ele cria uma nova tabela para
 * add os mais de um telefone au automaticamente
 * 
 * @date 28/04
 * 
 * 
 * **/
@Entity
public class Governador {
	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	@OneToOne(mappedBy="governador")
	private Estado estado;

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
