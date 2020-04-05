package domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Usuario {
	
	@Id
	private Integer codigo;
	
	@Column(length = 50,nullable = false,unique = true)
	private String login;
	
	@Column(nullable = false,unique = true)
	private String email;
	
	@Column(length = 12,nullable = false)
	private String senha;

}
