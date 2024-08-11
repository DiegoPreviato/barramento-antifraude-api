package com.barramentodemo.apiantifraude.services;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import com.barramentodemo.apiantifraude.models.Transaction;

@Service
public class DebitService {
    
    public String debitTransaction(){
        return "Sucesso Transaction Debit";
    }

    public String debitAdvice(){
        return "Sucesso Advice debit";
    }
    /*
    public Transaction creditTransaction(Transaction obj){
        
        return obj;
    }
    
    public Transaction creditAdvice(Transaction obj){
        this.transaction = new Transaction();
        transaction.setBrand("visa");
        return obj;
    }
 */
}
