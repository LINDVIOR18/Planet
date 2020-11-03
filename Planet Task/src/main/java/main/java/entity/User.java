package main.java.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class User {
    private String userId;
    private String userFirstName;
    private String userLastName;
    private String birthCity;
    private Date birthDate;
}
