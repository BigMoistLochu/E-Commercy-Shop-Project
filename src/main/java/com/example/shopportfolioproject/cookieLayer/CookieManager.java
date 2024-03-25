package com.example.shopportfolioproject.cookieLayer;

import jakarta.servlet.http.Cookie;
import org.apache.commons.codec.digest.DigestUtils;

import java.util.UUID;

public class CookieManager {


    public static Cookie crateCookie(String email,String password)
    {
        Cookie cookie = new Cookie("Session_Cookie",DigestUtils.sha256Hex(email+password));
        cookie.setAttribute("SameSite","None");
        cookie.setSecure(true);
        return cookie;
    }

    public static boolean checkCookie(Cookie cookie){

        //niech przy requescie zawsze bedzie podawa
        return true;
    }






}
