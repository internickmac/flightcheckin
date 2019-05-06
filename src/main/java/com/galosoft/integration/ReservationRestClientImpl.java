package com.galosoft.integration;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.galosoft.integration.dto.Reservation;
import com.galosoft.integration.dto.ReservationUpdateRequest;

@Component
public class ReservationRestClientImpl implements ReservationRestClient {
	
	private final String RESERVATION_REST_URL = "http://localhost:9080/flightreservation/reservation/";
	private final String RESERVATION_REST_URL_UNO = "http://localhost:9080/flightreservation/reservations";

	@Override
	public Reservation findReservation(Long id) {
		RestTemplate restTemplate = new RestTemplate();
		Reservation reservation = restTemplate.getForObject(RESERVATION_REST_URL+ id,Reservation.class);
		return reservation;
	}

	@Override
	public Reservation updateReservation(ReservationUpdateRequest request) {
		RestTemplate restTemplate = new RestTemplate();
		Reservation reservation = restTemplate.postForObject(RESERVATION_REST_URL_UNO, request, Reservation.class);
		return reservation;
	}

}
