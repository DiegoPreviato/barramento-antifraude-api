package com.barramentodemo.apiantifraude.services;

import static org.mockito.Mockito.verify;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import com.barramentodemo.apiantifraude.models.TransactionReqDTO;
import com.barramentodemo.apiantifraude.models.TransactionResDTO;

@DataJpaTest
public class CreditServiceTest {
    @Autowired
    private CreditService creditService;

    Logger logger = LoggerFactory.getLogger(CreditServiceTest.class);

    @Test
    @DisplayName("Teste de execução com documento que sempre retorna approved")
    void testExecutarTransacaoSucesso() {
        TransactionReqDTO transactionReqDTO = new TransactionReqDTO();
        TransactionResDTO transactionResDTO = new TransactionResDTO();

        transactionReqDTO.setTransactionId("1");
        transactionReqDTO.setCustomerDocument("11111111111");
        transactionReqDTO.setTransactionValue(100);
        transactionReqDTO.setCreatedAt("2024-07-30 13:54:50");
        transactionReqDTO.setBrand("VISA");
        transactionResDTO = creditService.executarTransacao(transactionReqDTO);

        if (transactionResDTO.getStatus() == "APPROVED") {
            logger.info("Transação aprovada conforme mock");
        } else {
            logger.info(("Transação não foi aprovada, teste falhou"));
        }

    }

    @Test
    @DisplayName("Teste de execução com documento que sempre retorna negado")
    void testExecutarTransacaoErro() {
        TransactionReqDTO transactionReqDTO = new TransactionReqDTO();
        TransactionResDTO transactionResDTO = new TransactionResDTO();

        transactionReqDTO.setTransactionId("1");
        transactionReqDTO.setCustomerDocument("22222222222");
        transactionReqDTO.setTransactionValue(100);
        transactionReqDTO.setCreatedAt("2024-07-30 13:54:50");
        transactionReqDTO.setBrand("VISA");
        transactionResDTO = creditService.executarTransacao(transactionReqDTO);

        verify(transactionResDTO.getStatus() == "APPROVED");

    }
}
