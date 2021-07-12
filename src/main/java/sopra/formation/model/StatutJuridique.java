package sopra.formation.model;

public enum StatutJuridique {

	SA("Société Anonyme"),SAS("Société par Action Simplifiée"), SASU("Société par Action Simplifiée Unipersonnelle"), SARL("Société à Responsabilité Limitée"), EURL("Entreprise Unipersonnelle à Responsabilité limitée"), EI("Entreprise Individuelle"); 
	
	private final String label;

	private StatutJuridique(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

}

