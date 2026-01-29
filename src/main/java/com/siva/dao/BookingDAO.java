package com.siva.dao;

import com.siva.dto.request.BookingRequest;
import com.siva.dto.response.BookingResponse;

import java.util.List;

public interface BookingDAO {
    BookingResponse createBooking(BookingRequest request);
    BookingResponse getBookingById(int bookingId);
    List<BookingResponse> getBookingsByUser(int userId);
    List<BookingResponse> getBookingsByShow(int showId);
    boolean cancelBooking(int bookingId);
    boolean updateTicketPaths(int bookingId, String qrCodePath, String pdfPath);

}
