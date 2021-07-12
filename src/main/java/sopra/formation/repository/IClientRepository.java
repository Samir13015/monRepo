package sopra.formation.repository;

import java.util.List;

import sopra.formation.model.Client;
import sopra.formation.model.Entreprise;
import sopra.formation.model.Particulier;


public interface IClientRepository extends IRepository<Client, Long>{
	
	List<Particulier> findAllParticulier(); // TODO

	List<Entreprise> findAllEntreprise(); // TODO

	Particulier findParticulierById(Long Id); // TODO

	Entreprise findEntrepriseById(Long Id); // TODO

}
