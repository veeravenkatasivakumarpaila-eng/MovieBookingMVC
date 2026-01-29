package com.siva.service;

import com.siva.dto.request.ReviewRequest;
import com.siva.dto.response.ReviewResponse;

import java.util.List;

public interface ReviewService {
    ReviewResponse addReview(ReviewRequest request);
    ReviewResponse getReviewById(int reviewId);
    List<ReviewResponse> getReviewsByMovie(int movieId);
    List<ReviewResponse> getReviewsByUser(int userId);
    boolean deleteReview(int reviewId);
}
