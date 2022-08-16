package Spa.com.Project.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import Spa.com.Project.model.Staffs;
import Spa.com.Project.repository.StaffsRepository;

@RestController
@RequestMapping("/")
@org.springframework.web.bind.annotation.CrossOrigin(origins = "*")
public class StaffController {
	
	//Actions
	@Autowired
	private StaffsRepository actions;
	

	//List staffs
	@RequestMapping(value="/staff", method=RequestMethod.GET)
	public @ResponseBody List<Staffs> listStaff() {
		return actions.findAll();
	}
		
	//Create staff
	@RequestMapping(value="/staff", method=RequestMethod.POST)
	public @ResponseBody Staffs createStaffs(@RequestBody Staffs staff) {
		return actions.save(staff);
	}
		
	//Find staff
	@RequestMapping(value="/staff/{staffid}", method=RequestMethod.GET)
	public @ResponseBody Staffs findStaffs (@PathVariable Integer staffid) {
		return actions.findStaffById(staffid);
	}
		
	//Update staff
	@RequestMapping(value="/staff", method=RequestMethod.PUT)
	public @ResponseBody Staffs uptaStaffs(@RequestBody Staffs staff) {
		return actions.save(staff);
	}
		
	//Delete staff
	@RequestMapping(value="/staff/{staffid}", method=RequestMethod.DELETE)
	public @ResponseBody void deleteStaff(@PathVariable Integer staffid) {
		Staffs staff = findStaffs(staffid);
		this.actions.delete(staff);
	}
		





}
