package Spa.com.Project.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import Spa.com.Project.model.Booking;


public interface BookingRepository extends CrudRepository<Booking, Integer> {

	 //List
	List<Booking> findAll();
	
	//find
	Booking findBookingById (int bookingid);
	
	
	//Delete
	void delete(Booking booking);
	
	//Create or update
	<BookTemp extends Booking> BookTemp save(BookTemp booking);
	


}