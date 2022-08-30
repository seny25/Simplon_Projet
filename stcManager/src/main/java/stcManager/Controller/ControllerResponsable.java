package stcManager.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import stcManager.model.Excercice;
import stcManager.model.Responsable;
import stcManager.services.ServiceResponsable;
@EnableAutoConfiguration
@RestController
@RequestMapping(value="/stcResponsable")
public class ControllerResponsable {
	
	@Autowired
	ServiceResponsable  serviceResponsable;
	

@PostMapping("/save")
public Responsable save(@RequestBody Responsable responsable  ) {
	serviceResponsable.save(responsable);
    return responsable;
}



@GetMapping("/List")
public List<Responsable> list(){
   
return serviceResponsable.getAll();
}


@GetMapping("/List/{id}")

public Responsable findById(@PathVariable Long id) {

    return serviceResponsable.getById(id);
}




@DeleteMapping("/delete/{id}")
public String delete(@PathVariable (value = "id") Long id) {
	serviceResponsable.delete(id);
    return "Deleted Succesfully id= " +id;

}
}
