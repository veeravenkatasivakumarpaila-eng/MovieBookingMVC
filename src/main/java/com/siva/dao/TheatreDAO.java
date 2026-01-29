package com.siva.dao;

import com.siva.dto.request.TheatreRequest;
import com.siva.dto.response.TheatreResponse;

import java.util.List;

public interface TheatreDAO {
    TheatreResponse addTheatre(TheatreRequest request);
    TheatreResponse getTheatreById(int theatreId);
    List<TheatreResponse> getAllTheatres();
    List<TheatreResponse> getTheatresByCity(String city);
    boolean updateTheatre(TheatreRequest request, int theatreId);
    boolean deleteTheatre(int theatreId);
    List<TheatreResponse> getTheatresByAdmin(int adminId);

}
