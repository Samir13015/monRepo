package sopra.formation.repository.jpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import sopra.formation.Application;
import sopra.formation.model.Reservation;
import sopra.formation.repository.IReservationRepository;

public class ReservationRepositoryJpa implements IReservationRepository{

	@Override
	public List<Reservation> findAll() {
		List<Reservation> reservations = new ArrayList<reservation>();

		EntityManager em = null;
		EntityTransaction tx = null;

		try {
			em = Application.getInstance().getEntityManagerFactory().createEntityManager();
			tx = em.getTransaction();
			tx.begin();

			TypedQuery<Reservation> query = em.createQuery("select r from reservation r", Reservation.class);

			reservations = query.getResultList();

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

		return reservations;
	}

	@Override
	public Reservation findById(Integer id) {
		Reservation reservation = null;

		EntityManager em = null;
		EntityTransaction tx = null;

		try {
			em = Application.getInstance().getEntityManagerFactory().createEntityManager();
			tx = em.getTransaction();
			tx.begin();

			reservation = em.find(Reservation.class, id);

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

		return reservation;
	}

	@Override
	public Reservation save(Reservation obj) {
		EntityManager em = null;
		EntityTransaction tx = null;

		try {
			em = Application.getInstance().getEntityManagerFactory().createEntityManager();
			tx = em.getTransaction();
			tx.begin();

			obj = em.merge(obj);

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

		return obj;
	}

	@Override
	public void delete(Reservation obj) {
		EntityManager em = null;
		EntityTransaction tx = null;

		try {
			em = Application.getInstance().getEntityManagerFactory().createEntityManager();
			tx = em.getTransaction();
			tx.begin();

			em.remove(em.merge(obj));

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
	
	
	}

}
