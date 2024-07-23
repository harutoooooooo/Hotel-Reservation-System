/*
 * Copyright(C) 2007-2013 National Institute of Informatics, All rights reserved.
 */
package app.reservation;

import java.util.Date;

import app.AppException;

/**
 * Form class for Reserve Room
 * 
 */
public class ReserveRoomForm {

	private ReserveRoomControl reserveRoomHandler = new ReserveRoomControl();

	private Date stayingDate;

	private ReserveRoomControl getReserveRoomHandler() {
		return reserveRoomHandler;
	}

	public String submitReservation() throws AppException {
		ReserveRoomControl reserveRoomHandler = getReserveRoomHandler();
		return reserveRoomHandler.makeReservation(stayingDate);
	}

	public String cancelReservation(String ReservationNumber) throws AppException {
		ReserveRoomControl reserveRoomHandler = getReserveRoomHandler();
		return reserveRoomHandler.cancelReservation(ReservationNumber);
	}

	public Date getStayingDate() {
		return stayingDate;
	}

	public void setStayingDate(Date stayingDate) {
		this.stayingDate = stayingDate;
	}

}
