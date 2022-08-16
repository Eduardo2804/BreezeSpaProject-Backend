package Spa.com.Project.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

import Spa.com.Project.model.Staffs;





public interface StaffsRepository extends CrudRepository<Staffs, Integer> {
	
	
	    //List
		List<Staffs> findAll();
		
		//Find
		Staffs findStaffById (int staffid);
		
		//Delete
		void delete(Staffs staff);
		
		//Create or update
		<StaffTemp extends Staffs> StaffTemp save(StaffTemp staff);
		
		
		
		
	

}
