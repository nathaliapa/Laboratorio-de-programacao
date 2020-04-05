package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import domain.Produto;
import util.JPAUtil;

public class ProdutoDAO {

	public void salvar(Produto produto) {

		EntityManager sessao = JPAUtil.getEntityManager();
		EntityTransaction transacao = sessao.getTransaction();
		transacao.begin();
		sessao.persist(produto);
		transacao.commit();
		sessao.close();
	}

	public Produto buscar(Integer codigo) {

		EntityManager sessao = JPAUtil.getEntityManager();
		// nao precisa de transacao
		Produto produto = sessao.find(Produto.class, codigo);
		return produto;
	}

}
