package sopra.formation.test;

import java.text.SimpleDateFormat;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;



public class Test {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		EntityManager em = null;
		EntityTransaction tx = null;

		try {
			em = Application.getInstance().getEntityManagerFactory().createEntityManager();

			tx = em.getTransaction();
			tx.begin();

		//Ajouter les datas //TODO

			tx.commit();  
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null && tx.isActive()) {
				tx.rollback();
			}
		} finally {
			if (em != null) {
				em.close();
			}
		}

		Application.getInstance().getEntityManagerFactory().close();

	}


}

