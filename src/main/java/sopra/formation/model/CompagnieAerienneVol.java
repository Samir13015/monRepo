package sopra.formation.model;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name = "AirlineCompagnyFly")
public class CompagnieAerienneVol {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column (name = "FlyNumber")
	private String numeroVol;
	@ManyToOne 
	@JoinColumn(name="Vol")
	private Vol vol;
	@OneToMany (mappedBy = "compagnieAeriennes")
	private List<CompagnieAerienne> compagnieAeriennes = new ArrayList<CompagnieAerienne>();
	

	public CompagnieAerienneVol(Long id, String numeroVol, Vol vol, List<CompagnieAerienne> compagnieAeriennes) {
		super();
		this.id = id;
		this.numeroVol = numeroVol;
		this.vol = vol;
		this.compagnieAeriennes = compagnieAeriennes;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNumeroVol() {
		return numeroVol;
	}


	public void setNumeroVol(String numeroVol) {
		this.numeroVol = numeroVol;
	}


	public Vol getVol() {
		return vol;
	}


	public void setVol(Vol vol) {
		this.vol = vol;
	}


	public List<CompagnieAerienne> getCompagnieAeriennes() {
		return compagnieAeriennes;
	}


	public void setCompagnieAeriennes(List<CompagnieAerienne> compagnieAeriennes) {
		this.compagnieAeriennes = compagnieAeriennes;
	}
	
	
	

}
