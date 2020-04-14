package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {

	private Integer number;
	private Date checkIn;
	private Date checkOut;
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Reservation(Integer number, Date checkIn, Date checkOut) {
		this.number = number;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Integer getNumber() {
		return number;
	}


	public Date getCheckIn() {
		return checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}

	public void setCheckOut(Date checkOut) {
		this.checkOut = checkOut;
	}
	public long duration() {
		long diff = checkOut.getTime() - checkIn.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	public void updateDates(Date checkIn, Date checkOut) {
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	@Override
	public String toString() {
		return "Room "+
			number +
			", check-in: "+
			sdf.format(checkIn)+
			", check-out: "+
			sdf.format(checkOut)+
			", " +
			duration()+
			" nigths";
	}
	
}