package sopra.formation.model;

import javax.persistence.Column;

import javax.persistence.Table;


@Table(name = "Airports")
public class Aeroport {
	
	@Column(name="code")
	private String code;
	@Column(name="name")
	private String nom;
	
	public Aeroport(String code, String nom) {
		this.code = code;
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Aeroport [code=" + code + ", nom=" + nom + "]";
	}
	
	
	
	
	

}
