package com.barramentodemo.apiantifraude.controllers;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.barramentodemo.apiantifraude.models.Transaction;
import com.barramentodemo.apiantifraude.services.CreditService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/credit")
@Validated
public class CreditController {
    @Autowired
    private CreditService creditService;

    @PostMapping("/transaction")
    @Validated(Transaction.class)
    public ResponseEntity<Object> transaction(@RequestBody Transaction obj) {
        this.creditService.creditTransaction(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
            .path("/transaction").buildAndExpand(obj.getTransactionId()).toUri();
        return ResponseEntity.created(uri).build();
    }
    
    @PostMapping("/advice")
    @Validated(Transaction.class)
    public ResponseEntity<Object> advice(@RequestBody Transaction obj) {
        this.creditService.creditTransaction(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
            .path("/advice").buildAndExpand(obj.getTransactionId()).toUri();
        return ResponseEntity.created(uri).build();
    }



    
}
