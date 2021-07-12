package sopra.formation.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "billet")
public class Billet {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "numPlace")
	private String numeroPlace;
	@Column(name = "classe")
	private String classe;
	@Column(name = "price")
	private float prix;
	@ManyToOne
	@JoinColumn(name="reservation_num")
	private Reservation reservation;
	@ManyToOne
	@JoinColumn(name="flight_id")
	private Vol vol;
	
	
	public Billet(Long id, String numeroPlace, String classe, float prix, Reservation reservation, Vol vol) {
		super();
		this.id = id;
		this.numeroPlace = numeroPlace;
		this.classe = classe;
		this.prix = prix;
		this.reservation = reservation;
		this.vol = vol;
	}


	public Billet() {
		super();
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNumeroPlace() {
		return numeroPlace;
	}


	public void setNumeroPlace(String numeroPlace) {
		this.numeroPlace = numeroPlace;
	}


	public String getClasse() {
		return classe;
	}


	public void setClasse(String classe) {
		this.classe = classe;
	}


	public float getPrix() {
		return prix;
	}


	public void setPrix(float prix) {
		this.prix = prix;
	}


	public Reservation getReservation() {
		return reservation;
	}


	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}


	public Vol getVol() {
		return vol;
	}


	public void setVol(Vol vol) {
		this.vol = vol;
	}
	
	
	
}
