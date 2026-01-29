package com.siva.service;

import com.siva.dto.request.BookingRequest;
import com.siva.dto.response.BookingResponse;

import java.util.List;

public interface BookingService {
    BookingResponse createBooking(BookingRequest request);
    BookingResponse getBookingById(int bookingId);
    List<BookingResponse> getBookingsByUser(int userId);
    List<BookingResponse> getBookingsByShow(int showId);
    boolean cancelBooking(int bookingId);
    BookingResponse generateTicket(int bookingId);

}

