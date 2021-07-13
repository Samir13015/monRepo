
package sopra.formation.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "AirlineCompagny")
public class CompagnieAerienne {
	@Id
	@Column(name="code")
	private String code;
	@Column(name="name")
	private String nom;
	@ManyToOne 
	@JoinColumn(name="Vol")
	private CompagnieAerienneVol compagnieAeriennes ;
	
	
	public CompagnieAerienne() {
		super();
	}


	public CompagnieAerienne(String code, String nom, CompagnieAerienneVol compagnieAeriennes) {
		super();
		this.code = code;
		this.nom = nom;
		this.compagnieAeriennes = compagnieAeriennes;
	}


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


	public CompagnieAerienneVol getCompagnieAeriennes() {
		return compagnieAeriennes;
	}


	public void setCompagnieAeriennes(CompagnieAerienneVol compagnieAeriennes) {
		this.compagnieAeriennes = compagnieAeriennes;
	}
	
	
	
	
	

	
	
}
