package io.github.com.picpaysimples.dtos;

import java.math.BigDecimal;

import io.github.com.picpaysimples.domain.user.UserType;

public record UserDTO(String firstName, String lastName, String document, String email,
        String password, UserType userType, BigDecimal balance) {

}