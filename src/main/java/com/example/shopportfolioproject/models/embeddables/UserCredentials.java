package com.example.shopportfolioproject.models.embeddables;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Embeddable
@NoArgsConstructor
@Setter
@Getter
public class UserCredentials {

    @Column(unique = true)
    private String email;

    @Column(length = 25)
    private String password;

    public UserCredentials(String email,String password)
    {
        if(email!=null
                && password!=null
                && checkLength(email, password)
                && checkEmail(email)
                && isBlank(email,password)
                && checkCorrectLetters(email,password))
        {
            this.email = email;
            this.password = password;
        }
        else throw new IllegalArgumentException("Wrong email or Password");
    }
    private boolean checkLength(String email,String password)
    {
        return !email.isEmpty()
                && !password.isEmpty()
                && email.length() < 25
                && password.length() < 25;
    }

    private boolean checkEmail(String email)
    {
        return email.contains("@");
    }

    private boolean isBlank(String email,String password)
    {
        return !password.isBlank() && !email.isBlank();
    }

    private boolean checkCorrectLetters(String email, String password)
    {
        return !email.matches(".*[!#$%^&*()_+\\-=].*") && !password.matches(".*[!#$%^&*()_+\\-=].*");
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserCredentials that = (UserCredentials) o;

        if(!email.equals(that.email)) return false;
        return password.equals(that.password);
    }

    @Override
    public int hashCode() {
        int result = email.hashCode();
        result = 31 * result + password.hashCode();
        return result;
    }
}
