package com.stayhere.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class Rentpropertycontroller {

	@Autowired
	Rentpropertyrepository rentpropertyrepository;
			
	@PostMapping("/rentpro")
	public String rentpropertyy(Rentproperty rentproperty) {
		
		rentpropertyrepository.save(rentproperty);
			
				return "thankyou";
			}
			
			
		/*	@GetMapping("/buyproperty")
			public String buyproperty() {
				String list = ("SELECT * FROM sellproperty");
				System.out.println(100);
			//	return "srepo.findall()";
				return "buyproperty";
			}*/
			
			@GetMapping("/hireproperty")	
			public ModelAndView hirepropertydata()
			{
				ModelAndView mv= new ModelAndView("hireproperty");
				List<Rentproperty> r=rentpropertyrepository.findAll();
				mv.addObject("rlist",r);
				mv.setViewName("hireproperty");
				return mv;
			}
	
}
