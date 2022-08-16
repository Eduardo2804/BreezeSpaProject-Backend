package Spa.com.Project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "booking")
public class Booking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="bookingid")
	private int id;
	
	@Column(name="date")
	private String date;
	
	@Column(name="time")
	private String time;
	
	
	@Column(name="customerId")
	private int customerId;
	
	@Column(name="staffId")
	private int staffId;
	
	@Column(name="status")
	private String status;
	
	@Column(name="bookingType")
	private String BookingType;
	
	

	//constructor
	public Booking() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}


	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getStaffId() {
		return staffId;
	}

	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getBookingType() {
		return BookingType;
	}

	public void setBookingType(String bookingType) {
		BookingType = bookingType;
	}

	
	
	
	
	
	
	
	
	
	
	
	

}
