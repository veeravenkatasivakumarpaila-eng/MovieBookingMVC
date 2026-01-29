package com.siva.dao;

import com.siva.dto.request.CityRequest;
import com.siva.dto.response.CityResponse;

import java.util.List;

public interface CityDAO {
    CityResponse addCity(CityRequest request);
    CityResponse getCityById(int cityId);
    List<CityResponse> getAllCities();
    boolean updateCity(CityRequest request, int cityId);
    boolean deleteCity(int cityId);
}
