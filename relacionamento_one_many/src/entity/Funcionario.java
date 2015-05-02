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

/**exemplo de relacionamento de um para  muitos, onde um funcionario so pode pertencer a um departamento e um departamento pode ter varios funcionarios 
 * @date 28/04
 *  
 *  
 *  **/
@Entity
public class Funcionario {
	@Id
	@GeneratedValue
	private Long id;
	private String nome;
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
