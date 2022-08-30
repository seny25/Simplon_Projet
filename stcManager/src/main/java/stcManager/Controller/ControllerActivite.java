package stcManager.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import stcManager.model.Activite;
import stcManager.model.Excercice;
import stcManager.model.Participent;
import stcManager.services.ServiceActivite;

@EnableAutoConfiguration
@RestController
@RequestMapping( value = "/stcActiv")
public class ControllerActivite {
	
@Autowired
 ServiceActivite service;


@PostMapping("/save")
public Activite save(@RequestBody Activite activite  ) {
    service.save(activite);
    return activite;
}


@GetMapping("/List")
public List<Activite> list(){
	
    //return activite.getAll();
return service.getAll();
}


@GetMapping("/List/{id}")

public Activite findById(@PathVariable Long id) {

    return service.getById(id);
}


@DeleteMapping("/delete/{id}")
public String delete(@PathVariable (value = "id") Long id) {
	
    service.delete(id);
    
    return "Deleted Succesfully id= " +id;

}
}
