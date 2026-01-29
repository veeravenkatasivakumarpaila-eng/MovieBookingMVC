package com.siva.service;

import com.siva.dto.request.SeatRequest;
import com.siva.dto.response.SeatResponse;

import java.util.List;

public interface SeatService {
    SeatResponse addSeat(SeatRequest request);
    SeatResponse getSeatById(int seatId);
    List<SeatResponse> getSeatsByScreen(int screenId);
    boolean updateSeatStatus(int seatId, boolean isBooked);
    boolean deleteSeat(int seatId);
    
}
