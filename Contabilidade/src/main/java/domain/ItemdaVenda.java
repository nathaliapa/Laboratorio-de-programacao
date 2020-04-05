package domain;

import java.math.BigDecimal;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ItemdaVenda {

		
	@Id
	private Integer codigo;
	
	@Column(nullable = false)
	private Integer quantidadeParcial;
	
	@Column(nullable = false, precision = 6,scale = 2)
	private BigDecimal valorParcial;
}
