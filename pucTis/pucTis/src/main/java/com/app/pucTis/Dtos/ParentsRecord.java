package com.app.pucTis.Dtos;


import com.app.pucTis.Entities.Student;
import com.app.pucTis.Entities.Enuns.UserType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.List;

public record ParentsRecord(
        Long id,
        @NotBlank
        String name,
        @NotBlank
        @Size(min = 5)

        String password,
        UserType type,
        List<Student> students
) {

}
