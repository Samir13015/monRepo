package sopra.formation.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "passager")
public class Passager {
	@Id
	@GeneratedValue
	private Long id;
	@Column(name = "name")
	private String nom;
	@Column(name = "firstname")
	private String prenom;
	@Column(name = "numeroId")
	private String numeroIdentite;
	@Enumerated(EnumType.STRING)
	@Column(name = "typeId")
	private TypeIdentite typeIdentite;
	@OneToOne
	@JoinColumn(name="reservation_id")
	private Reservation reservation;
	

	public Passager(Long id, String nom, String prenom, String numeroIdentite, TypeIdentite typeIdentite,
			Reservation reservation) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.numeroIdentite = numeroIdentite;
		this.typeIdentite = typeIdentite;
		this.reservation = reservation;
	}

	public Passager() {
		super();
	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
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

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNumeroIdentite() {
		return numeroIdentite;
	}

	public void setNumeroIdentite(String numeroIdentite) {
		this.numeroIdentite = numeroIdentite;
	}

	public TypeIdentite getTypeIdentite() {
		return typeIdentite;
	}

	public void setTypeIdentite(TypeIdentite typeIdentite) {
		this.typeIdentite = typeIdentite;
	}
	

	
}
