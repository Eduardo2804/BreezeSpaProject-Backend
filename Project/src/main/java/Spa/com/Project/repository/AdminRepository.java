package Spa.com.Project.repository;

import java.util.List;


import org.springframework.data.repository.CrudRepository;

import Spa.com.Project.model.Admin;


public interface AdminRepository extends CrudRepository<Admin, Integer> {
	
	 //List
	List<Admin> findAll();
	
	
	//Delete
	void delete(Admin admin);
	
	//Create or update
	<AdminTemp extends Admin> AdminTemp save(AdminTemp Admin);
	




}
