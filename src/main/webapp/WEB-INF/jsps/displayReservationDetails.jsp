<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Reservation Details</title>
</head>
<body>

	<h3>Flight details</h3>
	<p>Airlines:${reservation.flight.operatingAirlines}</p>
    <p>Flight No:${reservation.flight.flightNumber}</p>
    <p> Departure City:${reservation.flight.departureCity}</p>
    <p>Arrival City:${reservation.flight.arrivalCity}</p>
    <p>Date Of Departure:${reservation.flight.dateOfDeparture}</p>
    
    <h3>Passenger Details</h3>
    <p>First Name:${reservation.passenger.firstName}</p>
    <p>Last Name:${reservation.passenger.lastName}</p>
    <p>Email:${reservation.passenger.email}</p>
    <p>Phone: ${reservation.passenger.phone}</p>
    
    <form action="completeCheckIn" method="post">
    	<p>Enter number of bags you want checkin: <input type="text" name ="numberOfBags"> </p>
    	<p><input type="hidden" value="${reservation.id}" name="reservationId"></p>
    	<p><input type="submit" value="Ckeck In"></p>

    </form>
    
</body>
</html>








