package com.hexa.crud.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hexa.crud.Dao.*;
import com.hexa.crud.Entity.Student;

@Service
public class StudentService {

    @Autowired
    RepStudent rep;
    public Student saveSt(Student s)
	
	{
		Student s2=rep.save(s);
		return s2;
	}
    
    public List<Student> getStuds() {
        return (List<Student>) rep.findAll();
    }

    public Student removeSd(int rno) {
		
        Student s=	rep.findById(rno).orElse(null);
        if(s==null)
        {
            return null;
        }
            
        else
        {
            
            rep.delete(s);
        }
        
        return s;
            
        }

        public Student updateStud(int rn, String nm) {
            Student stud = rep.findById(rn).orElse(null);
            if (stud != null) {
                stud.setName(nm);
                rep.save(stud);
            }
            return stud;
        }

        public Student getByRoll(int rn) {
            return rep.findById(rn).orElse(null);
        }

}
