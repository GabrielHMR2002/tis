package com.app.pucTis.Dtos;


import com.app.pucTis.Entities.Enuns.UserType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record AdiministratorRecord(

        Long id,
        @NotBlank
        String name,
        @NotBlank
        @Size(min = 5)

        String password,
        UserType type) {
}
