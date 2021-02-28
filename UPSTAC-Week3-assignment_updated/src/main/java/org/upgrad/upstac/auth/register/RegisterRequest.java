package org.upgrad.upstac.auth.register;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.upgrad.upstac.users.models.Gender;

import javax.persistence.Cacheable;
import javax.persistence.Table;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@Table(name="user")
@Cacheable(false)
public class RegisterRequest {


    private String userName;

    private String password;
    private String firstName;

    private String email="";

    private String phoneNumber="";


    private String lastName;

    private String address;

    private Integer pinCode;


    private String dateOfBirth;


    private Gender gender;



}
