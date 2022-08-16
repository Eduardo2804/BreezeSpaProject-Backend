package Spa.com.Project.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


import Spa.com.Project.model.Treatments;

public interface TreatmentsRepository extends CrudRepository<Treatments, Integer>{
	

	 //List
	List<Treatments> findAll();
	
	//find
	Treatments findTreatmentById (int treatmentid);
	
	
	//Delete
	void delete(Treatments treatment);
	
	//Create or update
	<TreatTemp extends Treatments> TreatTemp save(TreatTemp treatment);

}
