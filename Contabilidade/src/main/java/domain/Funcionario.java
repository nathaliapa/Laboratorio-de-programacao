package domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Funcionario {

	/*
	 * Código
	 * 
	 * Nome
	 * 
	 * CPF
	 */
	
	@Id
	private Integer codigo;
	
	@Column(length = 50, nullable = false, unique = true)
	private String nome;
	
	@Column(length = 50, nullable = false, unique = true)
	private String cpf;
	
}
