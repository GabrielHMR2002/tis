package com.app.pucTis.Repositories;

import com.app.pucTis.Entities.Administrator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AdiministratorRepository extends JpaRepository<Administrator, Long> {
    Optional<Administrator> findAdiministratorById(Long id);
}
