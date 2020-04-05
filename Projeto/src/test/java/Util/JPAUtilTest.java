package Util;

import javax.persistence.EntityManager;

import org.junit.Test;

import util.JPAUtil;

public class JPAUtilTest {
	
	@Test
	public void getEntityManeger() {
		
		EntityManager sessao =JPAUtil.getEntityManager();
		sessao.close();
	}

}
