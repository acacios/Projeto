package entity;

import java.util.Collection;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**exemplo de relacionamento de um para um onde um estado so tem um governador e um governado so pode gorverna um estado
 * @date 28/04
 *  
 *  
 *  **/
@Entity
public class Estado {
	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	@OneToOne
	private Governador governador;
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
	public Governador getGovernador() {
		return governador;
	}
	public void setGovernador(Governador governador) {
		this.governador = governador;
	}
	
}
