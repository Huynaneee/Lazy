package com.example.Task311.DTO;

import com.example.Task311.model.User;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoleDTO {
    Long id;
    String role;
    @JsonProperty("user")
    List<User> users;
}
