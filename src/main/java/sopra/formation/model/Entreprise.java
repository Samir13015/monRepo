package sopra.formation.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("firm")
public class Entreprise extends Client {
	
	private String siret;
	@Column(name="VAT_number")
	private String numeroTVA;
	@Column(name="legal_status")
	private StatutJuridique statutJuridique;
	
	
	public Entreprise() {
		super();
	}
	
	public Entreprise(String siret, String numeroTVA, StatutJuridique statutJuridique) {
		super();
		this.siret = siret;
		this.numeroTVA = numeroTVA;
		this.statutJuridique = statutJuridique;
	}

	public String getSiret() {
		return siret;
	}

	public void setSiret(String siret) {
		this.siret = siret;
	}

	public String getNumeroTVA() {
		return numeroTVA;
	}

	public void setNumeroTVA(String numeroTVA) {
		this.numeroTVA = numeroTVA;
	}

	public StatutJuridique getStatutJuridique() {
		return statutJuridique;
	}

	public void setStatutJuridique(StatutJuridique statutJuridique) {
		this.statutJuridique = statutJuridique;
	}
	
	
	
	
	
	
	
}
