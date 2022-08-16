package Spa.com.Project.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import Spa.com.Project.model.User;


@Repository
public interface UserRepository extends CrudRepository<User, Integer>{
	
	    //List
		List<User> findAll();
		
		//Find
		User findByUserid(int userid);
		
		//Delete
		void delete(User user);
		
		//Create or update
		<UserTemp extends User> UserTemp save(UserTemp user);
		
		//Find user by email
		User findByEmail(String email);
		
		//Find by email and password
		User findByEmailAndPassword (String email, String password);
	

}
