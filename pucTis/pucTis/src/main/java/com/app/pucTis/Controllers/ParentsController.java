package com.app.pucTis.Controllers;

import com.app.pucTis.Dtos.ParentsRecord;
import com.app.pucTis.Entities.Parents;
import com.app.pucTis.Services.ParentsService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/parents")
public class ParentsController {
    @Autowired
    private ParentsService parentsService;

    @PostMapping
    public ResponseEntity<Parents> registerParents(@RequestBody @Valid ParentsRecord newParents) {

        Parents parents = parentsService.createParents(newParents);
        return new ResponseEntity<>(parents, HttpStatus.CREATED);
    }



}
