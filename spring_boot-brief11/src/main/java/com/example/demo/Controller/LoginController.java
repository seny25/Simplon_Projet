package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	
	@RequestMapping(value="/login" , method= RequestMethod.GET)
	public String loginPage() {
		
		
		
		
		return "login";
	}
	@RequestMapping(value="/login" , method= RequestMethod.POST)
	public String Index(ModelMap model ,@RequestParam String userId,@RequestParam String password) {
		if (userId.equals("Admin")&& password.equals("seny")) {
			model.put(userId, password);
			return "Index";
			
		}
		model.put("Erreur" , "Veuillez verifier votre mot de passe afin de se connection " );
		return "login";
	}
}
