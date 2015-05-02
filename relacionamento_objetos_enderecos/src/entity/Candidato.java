package entity;

import java.util.Calendar;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * exemplo de relacionamento de um um usuario poder destrinchar o endereço como: nome logradouro, bairro, etc
 * cria uma classe secundaria para isso n persint no banco "entity n põe" no caso da classe endereço como tb n persite com ela
 * 
 * 
 * @date 28/04
 * 
 * 
 * **/
@Entity
public class Candidato {
	@Id
	@GeneratedValue
	private Long id;

	private String nome;

	@Temporal(TemporalType.DATE)
	private Calendar nascimento;

	@Embedded
	private Endereco endereco;

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

	public Calendar getNascimento() {
		return nascimento;
	}

	public void setNascimento(Calendar nascimento) {
		this.nascimento = nascimento;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	

}
