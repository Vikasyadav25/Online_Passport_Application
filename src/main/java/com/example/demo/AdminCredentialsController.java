package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

public class AdminCredentialsController {
	

    @Autowired AdminCredentialsRepository loginRepo;
    @Autowired AdminCredentialService credaService;
    
    
    @RequestMapping("/AdminLogin")
	public String loadAdminLogin() {
		return "AdminLogin";
	}
    
	@RequestMapping(value="/adminlog", method=RequestMethod.POST)
    public ModelAndView login(@ModelAttribute AdminCredentials admin1)
    {
    	ModelAndView mv = new ModelAndView();
    	int id = admin1.getUserid();
    	System.out.print(id);
    	String pass = admin1.getPassword();
    	System.out.print(pass);
    	AdminCredentials admin2 = credaService.getAdmin(id);
    	int id1 = admin2.getUserid();
    	System.out.print(id);
    	String pass1 = admin2.getPassword();
    	System.out.print(pass1);
    	if(id==id1 && pass.equals(pass1))
    	{
    		mv.setViewName("UserHome");
    	}
    	else
    	{
    		mv.setViewName("redirect:/AdminLogin");
    	}
    	return mv;
    }
	
	
	
	
}
