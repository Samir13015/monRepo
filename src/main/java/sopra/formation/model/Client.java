package sopra.formation.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "client")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type")
public abstract class Client {
	
	//TODO Fetch type ?
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private Long id;
	@Column(name="name")
	private String nom;
	@OneToMany(mappedBy="client")
	private List<Adresse> adresses;
	@OneToMany(mappedBy="client")
	private List<Reservation> reservations;
	
	
	
	
	public Client() {
		super();
	}
	
	public Client(String nom, List<Adresse> adresses, List<Reservation> reservations) {
		super();
		this.nom = nom;
		this.adresses = adresses;
		this.reservations=reservations;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Adresse> getAdresses() {
		return adresses;
	}

	public void setAdresses(List<Adresse> adresses) {
		this.adresses = adresses;
	}
	
	public void addAdresses(Adresse adresses) {
		this.adresses.add(adresses);
	}

	public List<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}
	
	public void addReservations(Reservation reservation) {
		this.reservations.add(reservation);
	}
	
	
}
