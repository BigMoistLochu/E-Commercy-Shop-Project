package com.example.shopportfolioproject.controllers;

import com.example.shopportfolioproject.cookieLayer.CookieManager;
import com.example.shopportfolioproject.models.dtos.UserRequestDto;
import com.example.shopportfolioproject.services.UserService;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/register")
    public String userRegister(@ModelAttribute UserRequestDto user, Model model)
    {
        boolean isRegistered = userService.registerAccount(user);

        if(isRegistered) model.addAttribute("isRegistered",true);
        else model.addAttribute("isRegistered",false);
        return "index";
    }


    @PostMapping("/login")
    public String userLogInToApplication(@ModelAttribute UserRequestDto userCredentials, HttpServletResponse response)
    {
        userService.loginAccount(userCredentials);
        Cookie cookie = CookieManager.crateCookie(userCredentials.getEmail(),userCredentials.getPassword());
        response.addCookie(cookie);


        return "index";
    }





}
