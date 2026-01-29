package com.siva.controller;

import com.siva.dto.request.BankDetailsRequest;
import com.siva.dto.response.BankDetailsResponse;
import com.siva.dto.response.UserResponse;
import com.siva.service.BankDetailsService;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/bank")
public class BankDetailsController {

    private final BankDetailsService bankDetailsService;

    public BankDetailsController(BankDetailsService bankDetailsService) {
        this.bankDetailsService = bankDetailsService;
    }

    @GetMapping("/add")
    public String showAddBankDetailsForm(HttpSession session) {
        UserResponse user = (UserResponse) session.getAttribute("user");
        if (user == null) {
            return "redirect:/user/login";
        }
        return "user/bank_details";
    }

    @PostMapping("/add")
    public ModelAndView addBankDetails(@ModelAttribute BankDetailsRequest request, HttpSession session) {
        ModelAndView mav = new ModelAndView();
        UserResponse user = (UserResponse) session.getAttribute("user");
        if (user == null) {
            mav.setViewName("redirect:/user/login");
        } else {
            request.setUserId(user.getUserId());
            try {
                bankDetailsService.addBankDetails(request);
                mav.setViewName("redirect:/user/profile");
            } catch (Exception e) {
                mav.setViewName("user/bank_details");
                mav.addObject("error", e.getMessage());
            }
        }
        return mav;
    }
}
