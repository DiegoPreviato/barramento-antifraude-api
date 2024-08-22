package com.barramentodemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableAsync
public class BarramentoApplication {
    public static void main(String[] args) {
        SpringApplication.run(BarramentoApplication.class, args);
    }

    /*
     * @Bean
     * public RestTemplate restTemplate() {
     * return new RestTemplate();
     * }
     */

    @Bean
    public RestTemplate restTemplate() {
        SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
        requestFactory.setConnectTimeout(2000);
        requestFactory.setReadTimeout(2000);

        return new RestTemplate(requestFactory);
    }
}
