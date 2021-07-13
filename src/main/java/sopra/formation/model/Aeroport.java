package sopra.formation.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Airports")
public class Aeroport {
	@Id
	@Column(name="code")
	private String code;
	@Column(name="name")
	private String nom;
	
	
	public Aeroport() {
		super();
	}

	public Aeroport(String code, String nom) {
		this.code = code;
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Aeroport [code=" + code + ", nom=" + nom + "]";
	}
	
	
	
	
	

}
