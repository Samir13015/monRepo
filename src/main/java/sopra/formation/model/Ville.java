package sopra.formation.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "City")
public class Ville {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "name")
	private String nom;
	
	// 1 Liaison ManyToMany
	@ManyToMany(mappedBy = "villes")
	private List<Aeroport> villes = new ArrayList<Aeroport>();

	
	// 2 Constructeur Vide 

	public Ville() {
		super();
	}
	
	// 3 Constructeur tous 
	
	public Ville(Long id, String nom, List<Aeroport> villes) {
		super();
		this.id = id;
		this.nom = nom;
		this.villes = villes;
	}
	
	// Getters Setters 
	
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

	public List<Aeroport> getVilles() {
		return villes;
	}

	public void setVilles(List<Aeroport> villes) {
		this.villes = villes;
	}
	// To string 

	@Override
	public String toString() {
		return "Ville [id=" + id + ", nom=" + nom + ", villes=" + villes + "]";
	}
	

}
