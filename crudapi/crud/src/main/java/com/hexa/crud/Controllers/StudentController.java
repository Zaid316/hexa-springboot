package com.hexa.crud.Controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.hexa.crud.Entity.Student;
import com.hexa.crud.Service.*;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;



@RestController
public class StudentController {

    @Autowired
    StudentService ser;

    //store info in backend

    @PostMapping("/saveStudent")
	Student saveStudent(@RequestBody Student s)
	{
		Student s2=ser.saveSt(s);
		return s2;
		
	}

    @GetMapping("/getStudent")
    public List<Student> getStudent(){
        List<Student> users = ser.getStuds();
        return users;

    }


    @DeleteMapping("/removeStudent/{roll}")
    public Student removeStudent(@PathVariable int roll) {
        Student rem = ser.removeSd(roll);
        if (rem != null) {
            return rem;
        } else {
            return null; 
        }
    }

    @PutMapping("updateName/{rn}/{nm}")
    public Student updateName(@PathVariable int rn, @PathVariable String nm){
        Student stud= ser.updateStud(rn, nm);
        if (stud != null) {
            return stud;
        } else {
            return null;
        }
    }

    @GetMapping("/findByRoll/{rn}")
    public Student getMethodName(@PathVariable int rn) {
        return ser.getByRoll(rn);
    }
    
        

    }

	
	
	
	
	
 


    
    

