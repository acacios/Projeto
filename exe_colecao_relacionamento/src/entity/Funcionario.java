package entity;

import java.util.Collection;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

/**exemplo de relacionamento de muitos telefones, ele cria uma nova tabela para add os mais de um telefone au automaticamente 
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
	@ElementCollection
	@CollectionTable(name = " Telefones_dos_Funcionarios ", joinColumns = @JoinColumn(name = "func_id"))
	@Column(name = "telefone")
	private Collection<String> telefones;

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

	public Collection<String> getTelefones() {
		return telefones;
	}

	public void setTelefones(Collection<String> telefones) {
		this.telefones = telefones;
	}

	public Funcionario(Long id, String nome, Collection<String> telefones) {
		super();
		this.id = id;
		this.nome = nome;
		this.telefones = telefones;
	}

	public Funcionario() {
		super();
	}

}
