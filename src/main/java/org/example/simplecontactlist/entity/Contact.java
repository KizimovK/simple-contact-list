package org.example.simplecontactlist.entity;

import lombok.Data;

@Data
public class Contact {
    private Long id;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
}
