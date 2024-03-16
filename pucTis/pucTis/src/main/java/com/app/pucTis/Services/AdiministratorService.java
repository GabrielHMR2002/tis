package com.app.pucTis.Services;

import com.app.pucTis.Dtos.AdiministratorRecord;
import com.app.pucTis.Entities.Administrator;
import com.app.pucTis.Repositories.AdiministratorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdiministratorService {
    @Autowired
    AdiministratorRepository adiministratorRepository;

    private void saveAdiministrator(Administrator adm) {
        this.adiministratorRepository.save((adm));
    }

    public Administrator createAdiministrator(AdiministratorRecord dataAdm) {
        Administrator newAdiministrator = new Administrator(dataAdm);
        this.saveAdiministrator(newAdiministrator);
        return newAdiministrator;
    }

    public List<Administrator> getAllAdiministrators() {
        return this.adiministratorRepository.findAll();
    }

    public Administrator findAdiministratorById(Long id) throws Exception {
        return this.adiministratorRepository.findAdiministratorById(id).orElseThrow(() -> new Exception("User not found"));
    }
}


