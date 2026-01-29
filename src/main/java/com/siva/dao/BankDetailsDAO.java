package com.siva.dao;

import com.siva.dto.request.BankDetailsRequest;
import com.siva.dto.response.BankDetailsResponse;

import java.util.List;

public interface BankDetailsDAO {
    BankDetailsResponse addBankDetails(BankDetailsRequest request);
    BankDetailsResponse getBankDetailsById(int bankId);
    BankDetailsResponse getBankDetailsByUser(int userId);
    boolean updateBankDetails(BankDetailsRequest request, int bankId);
    boolean deleteBankDetails(int bankId);
}
