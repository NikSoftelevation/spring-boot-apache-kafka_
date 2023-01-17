package net.javaguides.springboot.payload;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
public class User {
    private int id;
    private String firstName;
    private String lastName;
}