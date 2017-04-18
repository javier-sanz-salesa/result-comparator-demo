package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.*;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.AsyncRestTemplate;

import java.util.concurrent.ExecutionException;

/**
 * Rest controller that provides the application endpoints
 */
@RestController
@RequestMapping("/comparator")
public class ResultComparatorController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(method = RequestMethod.GET)
    public void compare(@RequestParam(name = "personId") String personId,
                        @RequestParam(name = "nif") String nif,
                        @RequestParam(name = "birthDate") String birthDate) {
        AsyncRestTemplate asyncRestTemplate1 = new AsyncRestTemplate();
        String url = "http://www.google.es";
        HttpMethod method = HttpMethod.GET;
        Class<String> responseType = String.class;
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> requestEntity = new HttpEntity<>("params", headers);
        ListenableFuture<ResponseEntity<String>> future = asyncRestTemplate1.exchange(url, method, requestEntity, responseType);

        try {
            ResponseEntity<String> entity = future.get();
            System.out.println("entity.getBody() = " + entity.getBody());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
