package Spa.com.Project.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import Spa.com.Project.model.Booking;
import Spa.com.Project.repository.BookingRepository;



@RestController
@RequestMapping("/")
@org.springframework.web.bind.annotation.CrossOrigin(origins = "*")
public class BookingController {
	
	

     //Actions
	@Autowired
	private BookingRepository actions;
	
         //List Bookings
		@RequestMapping(value="/booking", method=RequestMethod.GET)
		public @ResponseBody List<Booking> listBooking() {
			return actions.findAll();
		}
			
		//Create Booking
		@RequestMapping(value="/booking", method=RequestMethod.POST)
		public @ResponseBody Booking createBooking(@RequestBody Booking booking) {
			return actions.save(booking);
		}
			
		//Find booking
		@RequestMapping(value="/booking/{bookingId}", method=RequestMethod.GET)
		public @ResponseBody Booking findBooking(@PathVariable Integer bookingid) {
			return actions.findBookingById(bookingid);
		}
			
		//Update booking
		@RequestMapping(value="/booking", method=RequestMethod.PUT)
		public @ResponseBody Booking updateBooking(@RequestBody Booking booking) {
			return actions.save(booking);
		}
		
		
	    //Delete booking
		@RequestMapping(value="/booking/{bookingid}", method=RequestMethod.DELETE)
		public @ResponseBody void deleteBooking(@PathVariable Integer bookingid) {
			Booking booking = findBooking(bookingid);
			this.actions.delete(booking);
		}
		
		
}


	


