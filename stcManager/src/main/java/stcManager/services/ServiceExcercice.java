package stcManager.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import stcManager.model.Excercice;
import stcManager.repository.ExcerciceRepository;
@Service
@Transactional
public class ServiceExcercice implements Services<Excercice> {
	//@Autowired
ExcerciceRepository excerciceRepository;


	public ServiceExcercice(ExcerciceRepository excerciceRepository) {
		super();
		this.excerciceRepository = excerciceRepository;
	}

	@Override
	public void save(Excercice excercice) {
	excerciceRepository.save(excercice);
	}

	@Override
	public List<Excercice> getAll() {
		
		return excerciceRepository.findAll();
	}

	@Override
	public Excercice getById(long id) {
		
		return excerciceRepository.findById(id).get();
	}

	@Override
	public void update(Excercice excercice, long id) {
		excerciceRepository.save(excercice);
		
	}

	@Override
	public void delete(long id) {
	
		excerciceRepository.deleteById(id);	
	}

}
