package com;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class TestJPA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PERSISTENCE");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Employee emp = new Employee();
		emp.setName("Chandra");
		emp.setEmail("chandra@cogentinfo.com");
		em.persist(emp);
		et.commit();
		em.close();
	}

}
