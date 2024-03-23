package com.example.shopportfolioproject.services;

import com.example.shopportfolioproject.models.User;
import com.example.shopportfolioproject.models.dtos.UserDto;
import com.example.shopportfolioproject.models.embeddables.UserCredentials;
import com.example.shopportfolioproject.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;


    public boolean registerAccount(UserDto userDto)
    {
        try {
            //if User not created then throw Exception,bcs (Credentials contain the validation logic)
            User user = new User(userDto.getName(),
                    new UserCredentials(userDto.getEmail(), userDto.getPassword()));

            userRepository.save(user);
            return true;
        }
        catch (Exception e)
        {
            System.out.println("przechyw potem do loggera");
            return false;
        }
    }


}
