package com.nt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.dao.PersonRepo;

@Controller
public class PersonController {
	@Autowired
	PersonRepo repo;
             
	       @RequestMapping("/home")
    	  public String homeobj() {
		
	    	   return "input.jsp";
		  
	  }
	       @RequestMapping("/add")
	       public String add(Person p) {
	    	   repo.save(p);
			return "input.jsp";
	
}
}
