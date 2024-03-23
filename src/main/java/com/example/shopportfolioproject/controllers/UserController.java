package com.example.shopportfolioproject.controllers;

import com.example.shopportfolioproject.models.dtos.UserDto;
import com.example.shopportfolioproject.services.UserService;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
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
    public String userRegister(@ModelAttribute UserDto user, Model model)
    {
        boolean isRegistered = userService.registerAccount(user);

        if(isRegistered) model.addAttribute("isRegistered",true);
        else model.addAttribute("isRegistered",false);
        return "index";
    }


    @PostMapping("/login")
    public String userLogInToApplication(@ModelAttribute UserDto user, HttpServletResponse response)
    {
        System.out.println(user.getEmail());
        System.out.println(user.getPassword());
        Cookie cookie = new Cookie("Sesja","123ape");
        cookie.setAttribute("SameSite","None");
        cookie.setSecure(true);
        response.addCookie(cookie);
        //logika:
        //sprawdz czy email i password sie zgadza w servisie
        //jesli wszystko git to wcisnij ciastko do uzytkownika

        return "index";
    }





}
