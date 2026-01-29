package com.siva.service;

import com.siva.dto.request.ScreenRequest;
import com.siva.dto.response.ScreenResponse;

import java.util.List;

public interface ScreenService {
    ScreenResponse addScreen(ScreenRequest request);
    ScreenResponse getScreenById(int screenId);
    List<ScreenResponse> getScreensByTheatre(int theatreId);
    boolean updateScreen(ScreenRequest request, int screenId);
    boolean deleteScreen(int screenId);
}
