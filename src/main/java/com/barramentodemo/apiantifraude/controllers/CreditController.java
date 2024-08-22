package com.barramentodemo.apiantifraude.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.ResourceAccessException;

import com.barramentodemo.apiantifraude.models.TransactionReqDTO;
import com.barramentodemo.apiantifraude.models.TransactionResDTO;
import com.barramentodemo.apiantifraude.services.CreditService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping(value = "/credit")
public class CreditController {
    @Autowired
    private CreditService creditService;

    @PostMapping(value = "/transaction", produces = "application/json")
    public ResponseEntity<TransactionResDTO> transacao(@Validated @RequestBody TransactionReqDTO requestDTO) {
        try {
            return ResponseEntity.ok(creditService.executarTransacao(requestDTO));
        } catch (ResourceAccessException e) {
            TransactionResDTO bodyResposta = new TransactionResDTO();
            bodyResposta.setStatus("DENIED");
            return ResponseEntity.ok(bodyResposta);
        } catch (Exception e) {
            TransactionResDTO bodyResposta = new TransactionResDTO();
            bodyResposta.setStatus("DENIED-1");
            return ResponseEntity.ok(bodyResposta);
        }

    }

    @PostMapping(value = "/advice", produces = "application/json")
    /* Retorna um httpcode 202 em caso de sucesso */
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void advice(@Validated @RequestBody TransactionReqDTO requestDTO) throws Exception {

        creditService.executarAdvice(requestDTO);

    }

}
