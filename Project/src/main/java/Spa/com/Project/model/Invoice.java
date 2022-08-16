package Spa.com.Project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "invoice")
public class Invoice {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="invoiceId")
	private int id;
	
	@Column(name="treatmentsId")
	private int treatmentsId;
	
	@Column(name="date")
	private String date;
	
	
	@Column(name="time")
	private String time;
	
	@Column(name="amount")
	private int amount;
	
	@Column(name="bookingId")
	private int bookingId;

	public Invoice(int id, int treatmentsId, String date, String time, int amount, int bookingId) {
		super();
		this.id = id;
		this.treatmentsId = treatmentsId;
		this.date = date;
		this.time = time;
		this.amount = amount;
		this.bookingId = bookingId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTreatmentsId() {
		return treatmentsId;
	}

	public void setTreatmentsId(int treatmentsId) {
		this.treatmentsId = treatmentsId;
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

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
}