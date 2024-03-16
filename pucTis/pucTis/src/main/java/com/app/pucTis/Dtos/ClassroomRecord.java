package com.app.pucTis.Dtos;

import com.app.pucTis.Entities.Student;
import com.app.pucTis.Entities.Teacher;

import java.util.List;

public record ClassroomRecord(
        Long id,
        List<Student> students,
        List<Teacher> teachers
) {
}