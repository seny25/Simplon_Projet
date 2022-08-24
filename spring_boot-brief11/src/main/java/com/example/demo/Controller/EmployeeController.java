
package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Employee;
import com.example.demo.Service.EmployeeService;
@Controller
/*
 * @RestController
 * 
 * @RequestMapping("/api/employees")
 */
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	// display list of employees
    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("listEmployees", employeeService.getAllEmployees());
        return "index";
    }
	
	 // create model attribute to bind form data
	   @RequestMapping("/showNewEmployeeForm")
	    public String showNewEmployeeForm(Model model) {
	        // create model attribute to bind form data
	        Employee employee = new Employee();
	        model.addAttribute("employee", employee);
	        return "new_employee";
	    }
 //save employee to database
	  @PostMapping("/saveEmployee")
	    public String saveEmployee(@ModelAttribute("employee") Employee employee) {
	        // save employee to database
	        employeeService.saveEmployee(employee);
	        return "redirect:/";		
	}
	  
     
	   
	   @GetMapping("/showFormForUpdate/{id}")
	    public String showFormForUpdate(@PathVariable(value = "id") long id, Model model) {
        //get employee from the service
	        Employee employee = employeeService.getEmployeeById(id);

	        // set employee as a model attribute to pre-populate the form
	        model.addAttribute("employee", employee);
	        return "update_employee";
	    }
	   @GetMapping("/deleteEmployee/{id}")
	    public String deleteEmployee(@PathVariable(value = "id") long id) {

	        // call delete employee method 
	        this.employeeService.deleteEmployeeById(id);
        return "redirect:/";
	   }
}
