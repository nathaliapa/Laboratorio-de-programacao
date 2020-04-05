package main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import util.JPAUtil;

public class TestConecxao {
	
	public static void main(String[] arg) {
		
	
		EntityManager sessao = JPAUtil.getEntityManager();
		sessao.close();
		
		
		/*	EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("ProjetoPU");
		
		EntityManager sessao = fabrica.createEntityManager();
		//System.out.println(sessao);
		
		sessao.close();
		fabrica.close();
		*/
	}

}
