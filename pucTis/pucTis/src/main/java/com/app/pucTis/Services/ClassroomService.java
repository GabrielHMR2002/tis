package com.app.pucTis.Services;

import com.app.pucTis.Dtos.ClassroomRecord;
import com.app.pucTis.Dtos.ParentsRecord;
import com.app.pucTis.Entities.Classroom;
import com.app.pucTis.Entities.Parents;
import com.app.pucTis.Repositories.SchoolClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClassroomService {
    @Autowired
    private SchoolClassRepository classroomRepository;
    private void saveClassroom(Classroom classroom){
        this.classroomRepository.save(classroom);

    }
    public Classroom createClassroom(ClassroomRecord dataClassroom){
        Classroom newClassroom = new Classroom(dataClassroom);
        this.saveClassroom(newClassroom);
        return newClassroom;
    }
}

