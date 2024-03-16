package com.app.pucTis.Repositories;

import com.app.pucTis.Entities.Parents;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParentsRepository extends JpaRepository<Parents, Long> {
}
