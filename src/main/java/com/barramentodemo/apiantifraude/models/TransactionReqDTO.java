package com.barramentodemo.apiantifraude.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class TransactionReqDTO {    
    
    //NotBlank(message="Campo transactionId obrigatório")
    @JsonProperty("transactionId")
    private String transactionId;

    //NotBlank(message="Campo customerDocument obrigatório")
    @JsonProperty("customerDocument")
    private String customerDocument;

    //NotBlank(message="Campo transactionValue obrigatório")
    @JsonProperty("transactionValue")
    private Integer transactionValue;
    
    //NotBlank(message="Campo createdAt obrigatório")
    @JsonProperty("createdAt")
    private String createdAt;

    //NotBlank(message="Campo brand obrigatório")
    @JsonProperty("brand")
    private String brand;

}
