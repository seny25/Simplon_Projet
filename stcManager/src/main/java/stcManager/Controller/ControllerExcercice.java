package stcManager.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import stcManager.model.Excercice;
import stcManager.services.ServiceExcercice;
@RestController
@EnableAutoConfiguration
@RequestMapping(value="/stcExercice")
public class ControllerExcercice {
	@Autowired
	
 ServiceExcercice serviceExcercice;

@PostMapping("/save")
public Excercice save(@RequestBody Excercice excercice  ) {
	serviceExcercice.save(excercice);
    return excercice;
}



@GetMapping("/List")
public List<Excercice> list(){
   
return serviceExcercice.getAll();
}


@GetMapping("/List/{id}")

public Excercice findById(@PathVariable Long id) {

    return serviceExcercice.getById(id);
}


@DeleteMapping("/delete/{id}")
public String delete(@PathVariable (value = "id") Long id) {
	serviceExcercice.delete(id);
    return "Deleted Succesfully id= " +id;

}
	}
	
	

