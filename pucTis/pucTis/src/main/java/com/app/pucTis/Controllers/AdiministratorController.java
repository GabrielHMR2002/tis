package com.app.pucTis.Controllers;

import com.app.pucTis.Dtos.AdiministratorRecord;
import com.app.pucTis.Entities.Administrator;
import com.app.pucTis.Services.AdiministratorService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/administrator")
public class AdiministratorController {
    @Autowired
    private AdiministratorService adiministratorService;
    @PostMapping
    public ResponseEntity<Administrator> registerAdiministrator(@RequestBody @Valid AdiministratorRecord newAdiministrator){
        Administrator adiministrator = adiministratorService.createAdiministrator(newAdiministrator);
        return new ResponseEntity<>(adiministrator, HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<List<Administrator>> getAllAdiministrator() {
        List<Administrator> adiministratorList = adiministratorService.getAllAdiministrators();
        if (adiministratorList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(adiministratorList, HttpStatus.OK);
        }
    }
}
