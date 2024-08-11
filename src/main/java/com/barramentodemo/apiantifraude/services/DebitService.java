package com.barramentodemo.apiantifraude.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.barramentodemo.apiantifraude.models.Transaction;

@Service
public class DebitService {
    @Autowired
    private Transaction transaction;

    public Transaction debitTransaction(Transaction obj){
        
        return obj;
    }
    
    public Transaction debitAdvice(Transaction obj){
        return obj;
    }

}
