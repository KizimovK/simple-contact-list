package org.example.simplecontactlist.entitites;

import lombok.Data;
import lombok.experimental.FieldNameConstants;

@Data
public class Contact {
    private Long id;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
}
