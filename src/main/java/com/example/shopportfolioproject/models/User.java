package com.example.shopportfolioproject.models;

import com.example.shopportfolioproject.models.embeddables.UserCredentials;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "uzytkownik")
@Entity
@Setter
@Getter
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private UserCredentials userCredentials;

    public User(String name, UserCredentials userCredentials) {
        this.name = name;
        this.userCredentials = userCredentials;
    }
}
