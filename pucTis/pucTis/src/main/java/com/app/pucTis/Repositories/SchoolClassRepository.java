package com.app.pucTis.Repositories;

import com.app.pucTis.Entities.Classroom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolClassRepository extends JpaRepository<Classroom, Long> {
}
