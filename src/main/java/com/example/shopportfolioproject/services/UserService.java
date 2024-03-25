package com.example.shopportfolioproject.services;

import com.example.shopportfolioproject.models.User;
import com.example.shopportfolioproject.models.dtos.UserRequestDto;
import com.example.shopportfolioproject.models.embeddables.UserCredentials;
import com.example.shopportfolioproject.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;


    public boolean registerAccount(UserRequestDto userRequestDto)
    {
        try {
            //If user is not created, then throw an exception because credentials contain the validation logic.
            User user = new User(userRequestDto.getName(),
                    new UserCredentials(userRequestDto.getEmail(), userRequestDto.getPassword()));

            userRepository.save(user);
            return true;
        }
        catch (Exception e)
        {
            System.out.println("przechyw potem do loggera");
            return false;
        }
    }

    public boolean loginAccount(UserRequestDto userRequestDto)
    {

        User user = userRepository.findUserByEmailAndPassword(userRequestDto.getEmail(),userRequestDto.getPassword());


        System.out.println("stop");
        return true;
    }


}
