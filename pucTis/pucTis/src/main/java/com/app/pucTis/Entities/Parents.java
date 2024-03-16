package com.app.pucTis.Entities;

import com.app.pucTis.Dtos.AdiministratorRecord;
import com.app.pucTis.Dtos.ParentsRecord;
import com.app.pucTis.Entities.Enuns.UserType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity
@Table(name = "tb_parents")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Parents {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String password;
    private UserType type;
    @OneToMany(mappedBy = "parents")
    private List<Student> students;
    public Parents(ParentsRecord data){
        this.name = data.name();
        this.password = data.password();
        this.type = data.type();
        this.students = data.students();
    }
}