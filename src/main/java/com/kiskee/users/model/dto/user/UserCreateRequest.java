package com.kiskee.users.model.dto.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class UserCreateRequest {

    @Email
    @NotNull
    private String email;

    @NotBlank
    private String firstName;

    @NotBlank
    private String lastName;

    @Past
    @NotNull
    private LocalDate birthDate;

    private String address;

    @Pattern(regexp = "^\\+?\\d{10,15}$", message = "Invalid phone number format. Only numbers and '+' are allowed")
    private String phoneNumber;
}
