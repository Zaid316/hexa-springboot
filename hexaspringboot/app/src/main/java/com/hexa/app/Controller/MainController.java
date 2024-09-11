package com.hexa.app.Controller;
/* 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String homejsp(){
        return "home"; // This would return the 'home.jsp' view.
    }

    @GetMapping("/contact")
    public String contact(){
        return "contact"; // This would return the 'contact.jsp' view.
    }

}
*/
import java.util.ArrayList;
import java.util.List;
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
 
 
 
 
@RestController
public class MainController {
	
	List <String> users= new ArrayList();
	
	
	MainController()
	{
		users.add("ajay");
		users.add("kavita");
 
		users.add("deepa");
 
		users.add("pooja");
 
		
	}
	
	@GetMapping("/getData")
	public List<String>  getData()
	{
	    
		return (users);
	}
 

	@PostMapping("/saveData")
	public String saveData(@RequestParam String name )
{
	users.add(name);
	return name;
}

	@DeleteMapping("/removeData")
    public String removeData( @RequestParam String name)
{
	users.remove(name);
	return name;
}

	@PutMapping("/updateName")
public String updateName(@RequestParam int pos ,@RequestParam  String name)
{
	users.set(pos,name);
	return "Updated" + " " + pos + " "+ name;
}
 
	
 
 
}