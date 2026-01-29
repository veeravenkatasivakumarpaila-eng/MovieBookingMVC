package com.siva.dao;

import com.siva.dto.request.PromotionRequest;
import com.siva.dto.response.PromotionResponse;

import java.util.List;

public interface PromotionDAO {
    PromotionResponse addPromotion(PromotionRequest request);
    PromotionResponse getPromotionById(int promotionId);
    PromotionResponse getPromotionByCode(String code);
    List<PromotionResponse> getAllPromotions();
    boolean updatePromotion(PromotionRequest request, int promotionId);
    boolean deletePromotion(int promotionId);
}
