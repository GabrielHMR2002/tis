package com.app.pucTis.Dtos;

import com.app.pucTis.Entities.Enuns.UserType;
import com.app.pucTis.Entities.Parents;
import com.app.pucTis.Entities.Classroom;
import jakarta.validation.constraints.NotBlank;


public record StudentRecord(
        Long id,
        @NotBlank String name,
        UserType type,
        Classroom schoolClass,
        Parents parents
) {
}
