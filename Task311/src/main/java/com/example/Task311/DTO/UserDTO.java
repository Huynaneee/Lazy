package com.example.Task311.DTO;

import com.example.Task311.model.Role;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
public class UserDTO {
    private Long id;
    private String name;
    private String lastName;
    private String email;
    private List<Role> roles;


}
