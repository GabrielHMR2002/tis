package com.app.pucTis.Dtos;

import com.app.pucTis.Entities.Enuns.UserType;
import com.app.pucTis.Entities.Classroom;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.List;

public record TeacherRecord(
        Long id,
        @NotBlank
        String name,
        @NotBlank
        @Size(min = 5)
        String password,
        UserType type,
        List<Classroom> schoolClasses
) {
}
