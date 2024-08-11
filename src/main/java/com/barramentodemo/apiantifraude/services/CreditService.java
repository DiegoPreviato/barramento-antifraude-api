package com.barramentodemo.apiantifraude.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.barramentodemo.apiantifraude.models.Transaction;

@Service
public class CreditService {
    @Autowired
    private Transaction transaction;

    public Transaction creditTransaction(Transaction obj){
        this.transaction = new Transaction();
        transaction.setBrand("visa");
        return obj;
    }
    
    public Transaction creditAdvice(Transaction obj){
        this.transaction = new Transaction();
        transaction.setBrand("visa");
        return obj;
    }

}
