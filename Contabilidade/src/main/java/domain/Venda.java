package domain;

import java.math.BigDecimal;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Venda {

	
	@Id
	private Integer codigo;
	
	@Column
	private LocalTime horario;
	
	@Column(nullable = false, precision = 6,scale = 2)
	private BigDecimal valorTotal;
	
	@Column(nullable = false)
	private Integer quantidadeTotal;
	
}
