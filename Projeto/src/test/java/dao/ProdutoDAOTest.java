package dao;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.Test;

import domain.Produto;

public class ProdutoDAOTest {
	@Test
	public void salvar() {

		// construtor padrao
		Produto p1 = new Produto();
		p1.setCodigo(1);
		p1.setDtvalidade(LocalDate.of(2021, 12, 10));
		p1.setNomeProduto("coca cola");
		p1.setPreco(BigDecimal.valueOf(10.50));
		p1.setQuantidade(15);

		// construtor com argumentos
		Produto p2 = new Produto(2, "Heineken 600ml", 10, BigDecimal.valueOf(8.00), LocalDate.of(2022, 4, 15));

		ProdutoDAO produtoDAO = new ProdutoDAO();
		produtoDAO.salvar(p1);
		produtoDAO.salvar(p2);

	}

}
