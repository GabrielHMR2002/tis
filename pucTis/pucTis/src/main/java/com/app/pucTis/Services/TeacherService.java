package com.app.pucTis.Services;

import com.app.pucTis.Dtos.StudentRecord;
import com.app.pucTis.Dtos.TeacherRecord;
import com.app.pucTis.Entities.Student;
import com.app.pucTis.Entities.Teacher;
import com.app.pucTis.Repositories.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {
    @Autowired
    private TeacherRepository teacherRepository;

    public void saveTeacher(Teacher teacher){
        this.teacherRepository.save(teacher);
    }
    public Teacher createTeacher(TeacherRecord dataTeacher){
        Teacher newTeacher = new Teacher(dataTeacher);
        this.saveTeacher(newTeacher);
        return newTeacher;
    }
}
