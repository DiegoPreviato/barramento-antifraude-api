package com.barramentodemo.apiantifraude.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.barramentodemo.apiantifraude.services.CreditService;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/credit")
public class CreditController {
    @Autowired
    private CreditService creditService;

    @PostMapping("/transaction")
    @ResponseBody
    public String handleTransaction (){           
        String retorno = this.creditService.creditTransaction("teste");
        return(retorno);
    }
    
    /*
    @PostMapping("/advice")
    @Validated(Transaction.class)
    public ResponseEntity<Object> advice(@RequestBody Transaction obj) {
        this.creditService.creditTransaction(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
            .path("/advice").buildAndExpand(obj.getTransactionId()).toUri();
        return ResponseEntity.created(uri).build();
    }


*/
    
}
