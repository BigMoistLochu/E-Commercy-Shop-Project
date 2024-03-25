package com.example.shopportfolioproject.repositories;

import com.example.shopportfolioproject.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {


    @Query(value = "SELECT u.* FROM uzytkownik AS u" +
            " WHERE email= :email AND password= :password",nativeQuery = true)
    User findUserByEmailAndPassword(@Param("email") String email,@Param("password") String password);


}
