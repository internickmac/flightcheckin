package com.galosoft.integration;

import com.galosoft.integration.dto.Reservation;
import com.galosoft.integration.dto.ReservationUpdateRequest;

public interface ReservationRestClient {
	
	public Reservation findReservation(Long id);
	
	public Reservation updateReservation(ReservationUpdateRequest request);

}
