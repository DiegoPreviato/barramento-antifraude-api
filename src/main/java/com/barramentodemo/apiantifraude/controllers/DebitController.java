package com.barramentodemo.apiantifraude.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.barramentodemo.apiantifraude.models.TransactionReqDTO;
import com.barramentodemo.apiantifraude.models.TransactionResDTO;
import com.barramentodemo.apiantifraude.services.DebitService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping(value = "/debit")
public class DebitController {
    @Autowired
    private DebitService debitService;

    @PostMapping(value = "/transaction", produces = "application/json")
    public ResponseEntity<TransactionResDTO> transacao(@Validated @RequestBody TransactionReqDTO requestDTO){
        
        return ResponseEntity.ok(debitService.executarTransacao(requestDTO));
    }
        
    @PostMapping(value = "/advice", produces = "application/json")
    /*Retorna um httpcode 202 em caso de sucesso*/
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void advice(@Validated @RequestBody TransactionReqDTO requestDTO){
        
        debitService.executarAdvice(requestDTO);      
        
    }
        
}
