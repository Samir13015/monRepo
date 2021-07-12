package sopra.formation.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "reservation")
public class Reservation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer numero;
	@Column(name = "dateReserv")
	private Date dtReservation;
	@Enumerated(EnumType.STRING)
	@Column(name = "dateReserv")
	private StatutReservation confirme;
	@OneToMany(mappedBy = "reservation")
	private List<Billet> billet= new ArrayList<Billet>();
	@OneToOne(mappedBy ="reservation")
	private Passager passager;
	
	public Reservation(Integer numero, Date dtReservation, StatutReservation confirme) {
		super();
		this.numero = numero;
		this.dtReservation = dtReservation;
		this.confirme = confirme;
	}


	public Reservation() {
		super();
	}


	public Integer getNumero() {
		return numero;
	}


	public void setNumero(Integer numero) {
		this.numero = numero;
	}


	public Date getDtReservation() {
		return dtReservation;
	}


	public void setDtReservation(Date dtReservation) {
		this.dtReservation = dtReservation;
	}


	public StatutReservation getConfirme() {
		return confirme;
	}


	public void setConfirme(StatutReservation confirme) {
		this.confirme = confirme;
	}
	
	
	
	
	
	
}
