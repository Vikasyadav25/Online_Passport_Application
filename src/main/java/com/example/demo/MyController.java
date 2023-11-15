package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpSession;


@Controller
public class MyController {
	@Autowired(required = true) UserService service;
    @Autowired loginRepository loginRepo;
    @Autowired UserCredentialService credService;
    @Autowired ApplicationRepository appRepo;
    @Autowired ApplicationRegService appService;
    @Autowired AdminCredentialsRepository loginaRepoa;
    @Autowired AdminCredentialService credaService;
    @Autowired ApplicationRepository regis;
    @Autowired AdminAppointmentRepository adminapp;
    @Autowired AdminAppointmentService adminservice;
    @Autowired AdminOfficeService adminserviceoffice;
    
    @RequestMapping("/")
	public String loadIndex() {
		return "Index";
	}
    
    @RequestMapping("/AboutUs")
   	public String loadAboutUs() {
   		return "AboutUs";
   	}
    @RequestMapping("/ContactUs")
   	public String loadContactUs() {
   		return "ContactUs";
   	}
    
	@RequestMapping("/AdminLogin")
	public String loadAdminLogin() {
		return "AdminLogin";
	}
	@RequestMapping("/AdminHome")
	public String loadAdminHome() {
		return "AdminHome";
	}
	
	@RequestMapping(value="/adminlog", method=RequestMethod.POST)
    public ModelAndView login(@ModelAttribute AdminCredentials admin1)
    {
    	ModelAndView mv = new ModelAndView();
    	int id = admin1.getUserid();
    	String pass = admin1.getPassword();
    	AdminCredentials admin2 = credaService.getAdmin(id);
    	int id1 = admin2.getUserid();
    	String pass1 = admin2.getPassword();
    	if(id==id1 && pass.equals(pass1))
    	{
    		mv.setViewName("AdminHome");
    	}
    	else
    	{
    		mv.setViewName("redirect:/AdminLogin");
    	}
    	return mv;
    }
	
	@RequestMapping("/AdminOfficeDetails")
	public String loadAdminOfficeDetails() {
		return "AdminOfficeDetails";
	}
	@RequestMapping(value="/regoffice" , method = RequestMethod.POST)
	public ModelAndView adminappointmentslot(@ModelAttribute AdminOfficeRegister app1) {
		ModelAndView model= new ModelAndView();
		System.out.println("hello");
    	model.setViewName("AdminOfficeDetails");
    	adminserviceoffice.addApplicant(app1);
    	System.out.println(app1);
    	return model;
	}

	
	
	
	@RequestMapping("/AdminAppointmentslot")
	public String loadAdminAppointmentslot() {
		return "AdminAppointmentslot";
	}
	
	
	
	@RequestMapping(value="/regappoint" , method = RequestMethod.POST)
	public ModelAndView adminappointmentslot(@ModelAttribute AdminAppointmentRegister app1) {
		ModelAndView model= new ModelAndView();
		System.out.println("hello");
    	model.setViewName("AdminAppointmentslot");
    	adminservice.addApplicant(app1);
    	System.out.println(app1);
    	return model;
	}
	
	@RequestMapping("/AdminViewEmail")
	public String loadAdminViewEmail() {
		return "AdminViewEmail";
	}
	
	
	@RequestMapping(value="/viewdoc",method=RequestMethod.POST)
	public ModelAndView loadApplicationdetail(@ModelAttribute ApplicationRegister app , Model model) {
	ModelAndView mv= new ModelAndView();
	System.out.println(app.getEmail());
	ApplicationRegister user = appRepo.findByEmail(app.getEmail());
	model.addAttribute("user", user);
	System.out.println(user);
	mv.setViewName("AdminViewDocument");
	return mv;
	}
	
	
	@RequestMapping("/ApplicationStatusEmail")
	public String loadviewStatus() {
		return "ApplicationStatusEmail";
	}
	@RequestMapping("/ApplicationStatus")
	public String loadviewStatusv() {
		return "ApplicationStatus";
	}
	
	
	@RequestMapping("/DownlaodPassportEmail")
	public String loadviewPassportEmail() {
		return "DownlaodPassportEmail";
	}
	
	@RequestMapping(value="/viewstatus",method=RequestMethod.POST)
	public ModelAndView loadStatus(@ModelAttribute ApplicationRegister app , Model model) {
	ModelAndView mv= new ModelAndView();
	System.out.println(app.getEmail());
	ApplicationRegister user = regis.findByEmail(app.getEmail());
	user.setApplication_status(app.getApplication_status());
	user.setPassportno(app.getPassportno());
	appService.applicationrepository.save(user);
	//	model.addAttribute("user", user);
	System.out.println(app.getApplication_status());
	System.out.println(user);
	mv.setViewName("ApplicationStatusEmail");
	return mv;
	}
	
	@RequestMapping(value="/passdown",method=RequestMethod.POST)
	public ModelAndView loaddown(@ModelAttribute ApplicationRegister app , Model model) {
		ModelAndView mv= new ModelAndView();
		System.out.println(app.getEmail());
		ApplicationRegister user = appRepo.findByEmail(app.getEmail());
		model.addAttribute("user", user);
		System.out.println(user);
		mv.setViewName("DownlaodPassport");
		return mv;
		}
		
	
	
    @RequestMapping("/UserLogin")
	public String loadUserLogin() {
		return "UserLogin";
	}
    
    @RequestMapping(value="/reglogin", method=RequestMethod.POST)
    public ModelAndView login(@ModelAttribute Usercredentials user1)
    {
    	ModelAndView mv = new ModelAndView();
    	int id = user1.getUserid();
    	String pass = user1.getPassword();
    	
    	Usercredentials user2 = credService.getUser(id);
    	int id1 = user2.getUserid();
    	String pass1 = user2.getPassword();
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
    
    
    @RequestMapping("/UpdatePassword")
	public String loadUpdatePassword() {
		return "UpdatePassword";
	}
    @RequestMapping(value="/UserRegister")
   	public String loadUserRegister() {
    	  	
   		return "UserRegister";
   	}
    
     
//    @RequestMapping(value="/regUser",method=RequestMethod.POST)
//   	public ModelAndView loadUser_UserIdShow(@ModelAttribute UserRegister reg) {
//    	ModelAndView model= new ModelAndView();
//    	model.setViewName("UserRegisterDone");
//    	service.addUser(reg);
//    	model.addObject("p",reg);
//    	return model;
//   	}
    
    
    
    @RequestMapping(value="/regUser",method=RequestMethod.POST)
   	public ModelAndView loadUser_UserIdShow(@ModelAttribute UserRegister reg) {
    	ModelAndView model= new ModelAndView();
    	model.setViewName("UserRegisterDone");
    	service.addUser(reg);
    	Usercredentials userCred= new Usercredentials();
    	userCred.setUserid(reg.getUserid());
    	userCred.setPassword(reg.getPassword());
    	userCred.setUsertype("");
    	loginRepo.save(userCred);
    	model.addObject("p",reg);
    	return model;
   	}
 
    
    @RequestMapping(value="/upPass",method=RequestMethod.POST)
   	public ModelAndView loadUpdatePassDone(@ModelAttribute UserRegister reg) {
       ModelAndView modelAndView = new ModelAndView();
       UserRegister ur=service.getRegisterById(reg.getUserid());
        ur.setPassword(reg.getPassword());
        service.repository.save(ur);
    	Usercredentials userCred= new Usercredentials();
    	userCred.setUserid(reg.getUserid());
    	userCred.setPassword(reg.getPassword());
    	userCred.setUsertype("");
    	loginRepo.save(userCred);
       modelAndView.setViewName("UpdatePassDone");
	   return modelAndView;
   	}
    
    @RequestMapping(value="/UserHome")
   	public String loadHomePage() {
   		return "UserHome";
   	}
    
    @RequestMapping(value="/ApplicationForm")
   	public String loadApplicationForm() {
   		return "ApplicationForm";
   	}
    @RequestMapping(value="/ApplicationFormDone")
   	public String loadApplicationFormDone() {
   		return "ApplicationFormDone";
   	}
    
  @RequestMapping(value="/appreg",method=RequestMethod.POST)
 	public ModelAndView loadUser_appIdShow(@ModelAttribute ApplicationRegister areg) {
  	ModelAndView model= new ModelAndView();
  	model.setViewName("ApplicationFormDone");
  	appService.addApplicant(areg);
  	model.addObject("p",areg);
  	return model;
 	}
  
  
  @RequestMapping(value="/ApplicationViewEmail")
 	public String loadApplicationViewEmail() {
 		return "ApplicationViewEmail";
 	}
  
  @RequestMapping(value="/viewdetailsapplication",method=RequestMethod.POST)
	public ModelAndView loadApplicationdetails(@ModelAttribute ApplicationRegister app , Model model) {
	ModelAndView mv= new ModelAndView();
//	System.out.println(app.getEmail());
	ApplicationRegister user = appRepo.findByEmail(app.getEmail());
	model.addAttribute("user", user);
//	System.out.println(user);
	mv.setViewName("ApplicationViewPage");
	return mv;
	}
  
  
  
  @RequestMapping("/ApplicationUpload")
  public String fileUpload()
  {
	  return "ApplicationUpload";
  }
 
  @RequestMapping(value="/ApplicationUpload1" , method = RequestMethod.POST)
	public ModelAndView loadApplicationUploadDoc(@ModelAttribute ApplicationRegister app1) {
	  ModelAndView mv=new ModelAndView();
	  ApplicationRegister user = regis.findByEmail(app1.getEmail());
	  user.setAadharcard_pancard(app1.getAadharcard_pancard());
	  user.setPaymentslip(app1.getPaymentslip());
	  user.setSscmarksheet(app1.getSscmarksheet());
	  System.out.println(app1.getAadharcard_pancard());
	  System.out.println(user);
	  appService.applicationrepository.save(user);
	  mv.setViewName("ApplicationUpload");
		return mv;
	}
  
  
  @RequestMapping(value="/ApplicationRequestAppointment")
 	public String loadApplicationRequestAppointment( ) {
	  
 		return "ApplicationRequestAppointment";
 	}
  
  
  
  @RequestMapping(value="/ApplicationAppoint" , method = RequestMethod.POST)
	public ModelAndView loadApplicationAppointment(@ModelAttribute ApplicationRegister app1) {
	  ModelAndView mv=new ModelAndView();
	  ApplicationRegister user = regis.findByEmail(app1.getEmail());
	  user.setAppointment_date(app1.getAppointment_date());
	  appService.applicationrepository.save(user);
	  mv.setViewName("ApplicationRequestAppointment");
		return mv;
	}
  
  
  
  
  @RequestMapping(value="/ApplicationChangeAppointment")
	public String loadApplicationChangeAppointment() {
		return "ApplicationChangeAppointment";
	}
  @RequestMapping(value="/ApplicationAppointchnage" , method = RequestMethod.POST)
	public ModelAndView loadApplicationAppointmentChange(@ModelAttribute ApplicationRegister app1) {
	  ModelAndView mv=new ModelAndView();
	  ApplicationRegister user = regis.findByEmail(app1.getEmail());
	  user.setAppointment_date(app1.getAppointment_date());
	  appService.applicationrepository.save(user);
	  mv.setViewName("ApplicationChangeAppointment");
		return mv;
   }
  
  @RequestMapping(value="/ApplicationStatusEmailUser")
	public String loadApplicationStatusEmailUser() {
		return "ApplicationStatusEmailUser";
	}
  @RequestMapping(value="/ApplicationStatusViewUser")
	public String loadApplicationStatusViewUser() {
		return "ApplicationStatusViewUser";
	}
  @RequestMapping(value="/viewstatususer",method=RequestMethod.POST)
	public ModelAndView loadApplicationStatus(@ModelAttribute ApplicationRegister app , Model model) {
	ModelAndView mv= new ModelAndView();
	System.out.println(app.getEmail());
	ApplicationRegister user = appRepo.findByEmail(app.getEmail());
	model.addAttribute("user", user);
	System.out.println(user);
	mv.setViewName("ApplicationStatusViewUser");
	return mv;
	}
  
  

  
    
}
