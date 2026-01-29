package com.siva.dao;

import com.siva.dto.request.PaymentRequest;
import com.siva.dto.response.PaymentResponse;

import java.util.List;

public interface PaymentDAO {
    PaymentResponse addPayment(PaymentRequest request);
    PaymentResponse getPaymentById(int paymentId);
    PaymentResponse getPaymentByBooking(int bookingId);
    List<PaymentResponse> getPaymentsByUser(int userId);
}
