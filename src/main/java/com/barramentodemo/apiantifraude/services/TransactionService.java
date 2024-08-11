package com.barramentodemo.apiantifraude.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.barramentodemo.apiantifraude.models.Transaction;

@Service
public class TransactionService {
    @Autowired
    private Transaction transaction;

    public Transaction creditTransaction(Transaction obj){
        
        return obj;
    }
    
    public Transaction debitTransaction(Transaction obj){
        return obj;
    }

}
