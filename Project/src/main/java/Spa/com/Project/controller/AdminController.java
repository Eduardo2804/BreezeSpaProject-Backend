package Spa.com.Project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import Spa.com.Project.model.Admin;
import Spa.com.Project.repository.AdminRepository;




@RestController
@RequestMapping("/")
@org.springframework.web.bind.annotation.CrossOrigin(origins = "*")
public class AdminController {
	

	//Actions
	@Autowired
	private AdminRepository actions;
	

	//List admin
	@RequestMapping(value="/admin", method=RequestMethod.GET)
	public @ResponseBody List<Admin> listAdmin() {
		return actions.findAll();
	}
		
	//Create admin
	@RequestMapping(value="/admin", method=RequestMethod.POST)
	public @ResponseBody Admin createStaffs(@RequestBody Admin admin) {
		return actions.save(admin);
	}

}
