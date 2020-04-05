package domain;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity

/*
 * @Getter
 * 
 * @Setter
 * 
 * @NoArgsConstructor // construtor sem atributos
 * 
 * @AllArgsConstructor //construtor com todos os atributos
 * 
 * @ToString
 * 
 * @EqualsAndHashCode
 */

@Data // tudo a cima
@NoArgsConstructor 
@AllArgsConstructor
public class Produto {

	// length define a quantidade de caracteres;
	// nullable define se vai ser obrigadorio ou nao;
	// unique se vai ou nao houver repedicao de valor
	// precision numero de casas(digitos) e scale numeors apos a virgula

	@Id
	/*
	 * @Column(nullable = false,unique = true)
	 */
	private Integer codigo;

	@Column(length = 50, nullable = false, unique = true)
	private String nomeProduto;

	@Column(nullable = false)
	private Integer quantidade;

	@Column(nullable = false, precision = 5, scale = 2)
	private BigDecimal preco;

	@Column
	private LocalDate dtvalidade;

}
