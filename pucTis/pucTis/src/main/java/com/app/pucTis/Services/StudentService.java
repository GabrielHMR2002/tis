package com.app.pucTis.Services;

import com.app.pucTis.Dtos.StudentRecord;
import com.app.pucTis.Entities.Student;
import com.app.pucTis.Repositories.StudentRepository;
import com.app.pucTis.Repositories.ParentsRepository; // Importe o repositório dos pais
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private ParentsRepository parentsRepository; // Injeção do repositório dos pais

    private void saveStudent(Student student){
        this.studentRepository.save(student);
    }

    public Student createStudent(StudentRecord dataStudent){
        Student newStudent = new Student(dataStudent);
        this.saveStudent(newStudent);
        return newStudent;

    }
}
