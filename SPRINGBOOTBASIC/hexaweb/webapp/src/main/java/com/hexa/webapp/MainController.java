package com.hexa.webapp;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
 
 
 
@Controller
public class MainController {
	
	
	
	@GetMapping("/home")
	public String  home()
	{
		return "home";
	}
	
	
 
	@GetMapping("/contact")
	public String  contact()
	{
		return "contact";
	}
 
}
     
     

