package com.example.shopportfolioproject.cookieLayer;

import jakarta.servlet.http.Cookie;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CookieManagerTest {

    @Test
    void createCookieMethodShouldReturnTheSameValueForTheSameParams() {

        Cookie cookie1 = CookieManager.crateCookie("ape@wp.pl","mati123");
        Cookie cookie2 = CookieManager.crateCookie("ape@wp.pl","mati123");
        assertEquals(cookie1.getValue(),cookie2.getValue());
    }

    @Test
    void createCookieMethodShouldReturnDifferentValueForTheDifferentParams() {

        Cookie cookie1 = CookieManager.crateCookie("ape1@wp.pl","mati123");
        Cookie cookie2 = CookieManager.crateCookie("ape2@wp.pl","mati123");
        assertNotEquals(cookie1.getValue(),cookie2.getValue());
    }
}