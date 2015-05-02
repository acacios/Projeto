package entity;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * *
 * 
 * **/
@Entity
public class Departamento {
	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	// cria um colectio de funcionarios pois um depart pode ter mais de um
	// funcionario.
	// @OneToMany, assim ja vai certo. mais querendo personalisar o nome da
	// tabela do relacionamento e os campos da nova tabela, fazemos assim:
	/*
	 * (@OneToMany
	 *  @JoinTable ( name =" DEP_FUNC ", 
	 *  joinColumns = @JoinColumn ( name=" DEP_ID "), inverseJoinColumns = @JoinColumn ( name =" FUNC_ID "))
	 */
	@OneToMany
	private Collection<Funcionario> funcionarios = new ArrayList<Funcionario>();

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

	public Collection<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(Collection<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}

}
