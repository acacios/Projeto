package entity;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 * exemplo de relacionamento de muitos para muitos, onde um livro pode
 * ter muitos  autores.
 * 
 * @date 28/04
 * 
 * 
 * **/
@Entity
public class Livro {
	@Id
	@GeneratedValue
	private Long id;

	private String nome ;
	@ManyToMany
	private Collection <Autor> autores = new ArrayList <Autor >() ;
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
	public Collection<Autor> getAutores() {
		return autores;
	}
	public void setAutores(Collection<Autor> autores) {
		this.autores = autores;
	}
	
}
