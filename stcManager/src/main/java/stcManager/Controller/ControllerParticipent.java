package stcManager.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import stcManager.model.Participent;
import stcManager.repository.ParticipentRepository;
import stcManager.services.ServiceParticipent;


@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/stcParticipent")
public class ControllerParticipent {
	
	
    @Autowired

      ServiceParticipent service;
    
    
	@PostMapping("/save")
	public Participent save(@RequestBody Participent participent  ) {
		
		
		//Ajouter un participant
        service.save(participent);
        return participent;
    }

	
    @GetMapping("/List")
    public List<Participent> list(){
    	
    	//Lister  des participant
        return service.getAll();
    }

    @GetMapping("/List/{id}")
    
    public Participent findById(@PathVariable Long id) {
    	
        return service.getById(id);
    }


    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable (value = "id") Long id) {
    	
        service.delete(id);
        return "Deleted id= " +id;

    }
}