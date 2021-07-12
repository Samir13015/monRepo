package sopra.formation.repository.jpa;

import java.util.List;

import sopra.formation.model.Client;
import sopra.formation.model.Entreprise;
import sopra.formation.model.Particulier;
import sopra.formation.repository.IClientRepository;

public class IClientRepositoryJpa implements IClientRepository {

	//TODO toutes les méthodes
	
	@Override
	public List<Client> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Client findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Client save(Client obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Client obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Particulier> findAllParticulier() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Entreprise> findAllEntreprise() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Particulier findParticulierById(Long Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Entreprise findEntrepriseById(Long Id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
}
