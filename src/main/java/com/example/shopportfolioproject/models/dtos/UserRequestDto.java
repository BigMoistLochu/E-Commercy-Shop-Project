package com.example.shopportfolioproject.models.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserRequestDto {

    private String name;
    private String email;
    private String password;


    public UserRequestDto(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public UserRequestDto(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }
}
