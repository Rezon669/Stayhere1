package com.stayhere.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Usercontroller {


	@Autowired
	Userrepository userrepository;
	
	/*
	@RequestMapping("/")
	public String details()
	{
			return "createaccount";
		}*/

	
	@RequestMapping("/createaccount")
	public String createaccount(User user)
	{
		userrepository.save(user);
			return "createaccount";
		}/*
	@RequestMapping("/loginvalidation")
	public String loginvalidation(Model model, @Param("name")  String name, @Param("password") String password)
	{
		
			String a ="admin";
		       String uid = userrepository.finduser(name,password);
		   
		    	if(uid!=null && uid.equals(a)) {
		    		
		    			
		    	return "homepage";
		    	
		    	}
		    	if (uid!=null){
		    		
		    		return "homepage";
		    	}
		    	
		    	else {
		    		
		    		return "login";
		    	}
		    
		
		}
	*/
	@RequestMapping("/login")
	public String login()
	{
		//repo1.save(c);
	//	System.out.println(100);
		return "login";
		
		}
	
	
	
	
	@RequestMapping("/create")
	public String createaccount()
	{
		//repo1.save(c);
	//	System.out.println(100);
		return "create";
		
		}
	
	@RequestMapping("/forgotpassword")
	public String forgotpassword()
	{
		//System.out.println(100);
		return "Forgotpass";
		
		}
	
	@RequestMapping("/buyproperty")
	public String buyproperty()
	{
		return "buyproperty";
		
		}
	@RequestMapping("/sellproperty")
	public String sellproperty()
	{
		return "sellproperty";
		
		}
	@RequestMapping("/hireproperty")
	public String hireproperty()
	{
		return "hireproperty";
		
		}
	@RequestMapping("/rentproperty")
	public String rentproperty()
	{
		return "rentproperty";
		
		}
	
/*
	@RequestMapping("/{cid}")
	@ResponseBody
	public String getcustomersbyid(@PathVariable("cid") int cid) {
		return repo1.findById(cid).toString();

	}*/

}

/*
@GetMapping("/getdetails")	
public ModelAndView getdetails(@RequestParam int cid)
{
	ModelAndView mv= new ModelAndView("retrive");
	createaccount customers=repo1.findById(cid).orElse(null);
	mv.addObject(customers);
	return mv;
}
}
/*
@RequestMapping("/customers")
@ResponseBody
public String getcustomers() {
	return repo.findAll().toString();

}
*/


