/*
 * Copyright(C) 2007-2013 National Institute of Informatics, All rights reserved.
 */
package app.checkout;

import app.AppException;
import java.util.Date;

/**
 * Form class for Check-out Customer
 * 
 */
public class CheckOutRoomForm {

	private CheckOutRoomControl checkOutRoomControl = new CheckOutRoomControl();

	private CheckOutRoomControl getCheckOutRoomControl() {
		return checkOutRoomControl;
	}

	private String roomNumber;
	private Date stayingDate;

	public String checkOut() throws AppException {
		CheckOutRoomControl checkOutRoomControl = getCheckOutRoomControl();
		return checkOutRoomControl.checkOut(stayingDate, roomNumber);
	}

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getStayingDate() {
		return stayingDate;
	}

	public void setStayingDate(Date staingDate) {
		this.stayingDate = staingDate;
	}

}
