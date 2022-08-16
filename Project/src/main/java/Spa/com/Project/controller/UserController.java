package Spa.com.Project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import Spa.com.Project.model.User;
import Spa.com.Project.repository.UserRepository;




@RestController
@RequestMapping("/")
@org.springframework.web.bind.annotation.CrossOrigin(origins = "*")
public class UserController {
	
	
	//Actions
	@Autowired
	private UserRepository actions;
	

	//List user
	@RequestMapping(value="/user", method=RequestMethod.GET)
	public @ResponseBody List<User> listUser() {
		return actions.findAll();
	}
		
	//Create user
	@RequestMapping(value="/user", method=RequestMethod.POST)
	public @ResponseBody User createUser(@RequestBody User user) {
		return actions.save(user);
	}
		
	//Find user
	@RequestMapping(value="/user/{userid}", method=RequestMethod.GET)
	public @ResponseBody User findUser (@PathVariable Integer userid) {
		return actions.findByUserid(userid);
	}
		
	//Update user
	@RequestMapping(value="/user", method=RequestMethod.PUT)
	public @ResponseBody User uptaUser(@RequestBody User user) {
		return actions.save(user);
	}
		
	//Delete user
	@RequestMapping(value="/user/{userid}", method=RequestMethod.DELETE)
	public @ResponseBody void deleteUser(@PathVariable Integer userid) {
		User user = findUser(userid);
		this.actions.delete(user);
	}
	
	//Check if user exists and create new account if not exist in database
	@RequestMapping(value="/newuser", method=RequestMethod.POST)
	public @ResponseBody boolean newUser(@RequestBody User user) {
	if (actions.findByEmail(user.getEmail()) == null) {
		actions.save(user);
		return true;
	} else {
		return false;
	}
	}
	
	//Login - the login should check if the email is already in db and compare the password. Send ID if login ok.
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public @ResponseBody String login(@RequestBody User user) {
		if (actions.findByEmail(user.getEmail()) == null) {
			return "Sorry, Email not registered.";
		} else if (actions.findByEmailAndPassword(user.getEmail(), user.getPassword()) == null) {
			return "Wrong password.";
		} else {
			return Integer.toString(actions.findByEmail(user.getEmail()).getUserid());
		}
	}

}
	
	

