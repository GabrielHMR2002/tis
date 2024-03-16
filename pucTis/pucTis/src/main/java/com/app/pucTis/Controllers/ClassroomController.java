package com.app.pucTis.Controllers;

import com.app.pucTis.Dtos.ClassroomRecord;
import com.app.pucTis.Dtos.ParentsRecord;
import com.app.pucTis.Entities.Classroom;
import com.app.pucTis.Entities.Parents;
import com.app.pucTis.Services.ClassroomService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/classroom")
public class ClassroomController {
    @Autowired
    private ClassroomService  classroomService;
    @PostMapping
    public ResponseEntity<Classroom> registerClassroom(@RequestBody @Valid ClassroomRecord newClassroom){
        Classroom classroomm = classroomService.createClassroom(newClassroom);
        return new ResponseEntity<>(classroomm, HttpStatus.CREATED);
    }
}
