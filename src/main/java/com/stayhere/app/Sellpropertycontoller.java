package com.stayhere.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Sellpropertycontoller {

	@Autowired
	Sellpropertyrepository sellpropertyrepository;
	
	@PostMapping("/sellproperty")

	public String sellpropertyy(Sellproperty sellproperty) {
		
		sellpropertyrepository.save(sellproperty);
		
		return "thankyou";
	}
	
/*	@GetMapping("/buyproperty")
	public String buyproperty() {
		String list = ("SELECT * FROM sellproperty");
		System.out.println(100);
	//	return "srepo.findall()";
		return "buyproperty";
	}*/
	
	@GetMapping("/buyproperty")	
	public ModelAndView buypropertydata(Sellproperty sellproperty)
	{
		ModelAndView mv= new ModelAndView("buyproperty");
		@SuppressWarnings("unchecked")
		List<Sellproperty> s = sellpropertyrepository.findAll();
		mv.addObject("sellpropertylist",s);
		mv.setViewName("buyproperty");
		return mv;
	}
/*
	@RequestMapping("/filter")

	public String filter() {
		
		return "thankyou";
	}
	
	 @GetMapping("/filtersearch")
	    public String getdatabasedonfilter(Model model, @Param("propertytype"), @Param("city"), @Param("country") String propertytype, String city, String country) {
	        List<sellproperty> list = sellpropertyrepository.search(propertytype, city, country);
	        model.addAttribute("list", list);
	        model.addAttribute("propertytype","city","country", propertytype, city, country);
	         
	        return "buyproperty";
	   }

	
*/

}
