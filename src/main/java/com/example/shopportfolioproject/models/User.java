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

    @Column(nullable = false)
    private String name;

    private UserCredentials userCredentials;

    public User(String name, UserCredentials userCredentials) {
        if(name.isBlank() || name.isEmpty())
            throw new IllegalArgumentException("Name field cant be blank");
        this.name = name;
        this.userCredentials = userCredentials;
    }
}
