package com.barramentodemo.apiantifraude.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.barramentodemo.apiantifraude.models.AdviceResDTO;
import com.barramentodemo.apiantifraude.models.TransactionReqDTO;
import com.barramentodemo.apiantifraude.models.TransactionResDTO;

@Service
public class CreditService {
    @Autowired
    private RestTemplate restTemplate;
    Logger logger = LoggerFactory.getLogger(CreditService.class);

    public TransactionResDTO executarTransacao(TransactionReqDTO reqDTO) {
        /*
         * URL fixa para o desafio, poderia ser uma classe com notação @Configuration
         * caso esse valor viesse de uma variável de ambiente por exemplo
         */
        String url = "http://localhost:3000/credit/transaction";

        logger.info("Chamando o endpoint: " + url);

        HttpEntity<TransactionReqDTO> requestEntity = new HttpEntity<>(reqDTO);
        
        ResponseEntity<TransactionResDTO> responseEntity = restTemplate.exchange(
                url,
                HttpMethod.POST,
                requestEntity,
                TransactionResDTO.class);

        return responseEntity.getBody();
        
    }

    @Async
    public void executarAdvice(TransactionReqDTO reqDTO) throws Exception {
        /*
         * URL fixa para o desafio, poderia ser uma classe com notação @Configuration
         * caso esse valor viesse de uma variável de ambiente por exemplo
         */
        String url = "http://localhost:3000/credit/advice";

        logger.info("Chamando o endpoint: " + url);
        HttpEntity<TransactionReqDTO> requestEntity = new HttpEntity<>(reqDTO);

        ResponseEntity<AdviceResDTO> responseEntity = restTemplate.exchange(
                url,
                HttpMethod.POST,
                requestEntity,
                AdviceResDTO.class);
        logger.info("Fim da chamada ao endpoint: " + url +
                " http: " + responseEntity.getStatusCode());
    }
}
