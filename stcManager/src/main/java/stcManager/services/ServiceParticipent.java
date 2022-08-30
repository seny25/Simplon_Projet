package stcManager.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import stcManager.model.Participent;
import stcManager.repository.ParticipentRepository;


@Service
@Transactional
public class ServiceParticipent implements Services<Participent> {

	@Autowired
	ParticipentRepository participentRepository;
	@Override
	public void save(Participent participent) {
		
		participentRepository.save(participent);
	} 

	@Override
	public List getAll() {    
		
		return participentRepository.findAll() ;
	}

	@Override
	public Participent getById(long id) {
		
		return participentRepository.findById(id).get();
	}

	@Override
	public void update(Participent participent, long id) {
		
		participentRepository.save(participent);
	}

	@Override
	public void delete(long id) {
		
		participentRepository.deleteById(id);
	}

}
