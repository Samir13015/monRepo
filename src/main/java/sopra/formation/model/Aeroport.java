package sopra.formation.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity 
@Table(name = "Airports")
public class Aeroport {
	@Id
	@Column(name="code")
	private String code;
	@Column(name="name")
	private String nom;
	
	// 1 Liaison ManyToMany
	@ManyToMany
	@JoinTable(name = "airport_city", joinColumns = @JoinColumn(name = "airport_code"), inverseJoinColumns = @JoinColumn(name = "city_id"), uniqueConstraints = @UniqueConstraint(columnNames = {
			"airport_code", "city_id" }))
	private List<Ville> villes = new ArrayList<Ville>();

	// 2 Constucteur vide
	public Aeroport() {
		super();
	}
	
	// 3 Constructeur tous
	public Aeroport(String code, String nom, List<Ville> villes) {
		this.code = code;
		this.nom = nom;
		this.villes = villes;
	}
	
	// 4 Getters Setters 
	

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Ville> getVilles() {
		return villes;
	}

	public void setVilles(List<Ville> villes) {
		this.villes = villes;
	}

	// 5 to string
	@Override
	public String toString() {
		return "Aeroport [code=" + code + ", nom=" + nom + ", villes=" + villes + "]";
	}
	


	
	
	

	
	
	
	

}
