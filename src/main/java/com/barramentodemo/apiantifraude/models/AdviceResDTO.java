package com.barramentodemo.apiantifraude.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class AdviceResDTO {    
    
    @JsonProperty("message")
    private String message;
    
}
