package com.app.pucTis.Entities;

import com.app.pucTis.Dtos.StudentRecord;
import com.app.pucTis.Entities.Enuns.UserType;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_student")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int registration;
    private String name;
    private UserType type;
    @ManyToOne
    private Classroom schoolClass; //O estudante esta relacionado a uma unica turma
    @ManyToOne
    private Parents parents;


    public Student(StudentRecord data) {
        this.name = data.name();
        this.type = data.type(); //Tomar cuidado com import do enum la nos record, pode afetar aqui
        this.schoolClass = data.schoolClass();
        this.parents = data.parents(); // Correção aqui
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserType getType() {
        return type;
    }

    public void setType(UserType type) {
        this.type = type;
    }

    public Classroom getSchoolClass() {
        return schoolClass;
    }

    public void setSchoolClass(Classroom schoolClass) {
        this.schoolClass = schoolClass;
    }

    public Parents getParents() {
        return parents;
    }

    public void setParents(Parents parents) {
        this.parents = parents;
    }
}