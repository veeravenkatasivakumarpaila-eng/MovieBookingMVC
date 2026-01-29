package com.siva.service;

import com.siva.dto.request.BankDetailsRequest;
import com.siva.dto.response.BankDetailsResponse;

public interface BankDetailsService {
    BankDetailsResponse addBankDetails(BankDetailsRequest request);
    BankDetailsResponse getBankDetailsById(int bankId);
    BankDetailsResponse getBankDetailsByUser(int userId);
    boolean updateBankDetails(BankDetailsRequest request, int bankId);
    boolean deleteBankDetails(int bankId);
}
