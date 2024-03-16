package com.app.pucTis.Controllers;

import com.app.pucTis.Dtos.StudentRecord;
import com.app.pucTis.Dtos.TeacherRecord;
import com.app.pucTis.Entities.Student;
import com.app.pucTis.Entities.Teacher;
import com.app.pucTis.Services.TeacherService;
import jakarta.validation.Valid;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//api
@RestController

@RequestMapping("/teacher")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;
    @PostMapping
    public ResponseEntity<Teacher> registerTeacher(@RequestBody @Valid TeacherRecord newTeacher){
        Teacher teacher =  teacherService.createTeacher(newTeacher);
        return new ResponseEntity<>(teacher, HttpStatus.CREATED);
    }
}
