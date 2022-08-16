package Spa.com.Project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import Spa.com.Project.model.Treatments;
import Spa.com.Project.repository.TreatmentsRepository;




@RestController
@RequestMapping("/")
@org.springframework.web.bind.annotation.CrossOrigin(origins = "*")
public class TreatmentsController {
	
	    //Actions
		@Autowired
		private TreatmentsRepository actions;
	
	
	     //List treatments
		@RequestMapping(value="/treatments", method=RequestMethod.GET)
		public @ResponseBody List<Treatments> listTreatments() {
			return actions.findAll();
		}
			
		//Create treatments
		@RequestMapping(value="/treatments", method=RequestMethod.POST)
		public @ResponseBody Treatments createTreatment(@RequestBody Treatments treatment) {
			return actions.save(treatment);
		}
			
		//Find treatments
		@RequestMapping(value="/treatments/{treatmentid}", method=RequestMethod.GET)
		public @ResponseBody Treatments findTreatment (@PathVariable Integer treatment) {
			return actions.findTreatmentById(treatment);
		}
			
		//Update treatments
		@RequestMapping(value="/treatment", method=RequestMethod.PUT)
		public @ResponseBody Treatments uptaTreatment(@RequestBody Treatments treatment) {
			return actions.save(treatment);
		}
			
		//Delete treatments
		@RequestMapping(value="/treatments/{treatmentid}", method=RequestMethod.DELETE)
		public @ResponseBody void deleteTreatment(@PathVariable Integer treatmentid) {
			Treatments treatment = findTreatment(treatmentid);
			this.actions.delete(treatment);
		}
		

				}
	
			

	


