package com.barramentodemo.apiantifraude.services;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import com.barramentodemo.apiantifraude.models.Transaction;

@Service
public class CreditService {
    
    public String creditTransaction(String entrada){
        if (entrada == "Entrada") {
            return("Sucesso, bateu");
        }else{
            return("Erro, não bateu");

        } 
    }

    public String creditAdvice(){
        return "Sucesso Advice";
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

    public class creditTransaction {
    }
}
