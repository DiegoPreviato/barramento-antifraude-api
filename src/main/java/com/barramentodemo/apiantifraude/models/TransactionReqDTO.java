package com.barramentodemo.apiantifraude.models;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class TransactionReqDTO {    
    private String transactionId;
    private String customerDocument;
    private String transactionValue;
    private String createdAt;
    private String brand;
}
