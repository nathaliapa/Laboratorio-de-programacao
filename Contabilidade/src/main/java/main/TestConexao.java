package main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestConexao {
	
public static void main(String[] arg) {
		
		EntityManagerFactory contabilidade = Persistence.createEntityManagerFactory("ProjetoPU");
		
		EntityManager sessao = contabilidade.createEntityManager();
		//System.out.println(sessao);
		
		sessao.close();
		contabilidade.close();
		
	}

}
