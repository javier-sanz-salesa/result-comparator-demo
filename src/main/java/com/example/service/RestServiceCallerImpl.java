package com.example.service;

import org.springframework.http.HttpMethod;
import org.springframework.web.client.AsyncRestTemplate;

import java.util.Map;
import java.util.concurrent.Future;

public class RestServiceCallerImpl implements RestServiceCaller {
    @Override
    public Future<String> callService(String url, Map<String, String> headers, Map<String, Object> parameters, HttpMethod method) {
        AsyncRestTemplate asyncRestTemplate = new AsyncRestTemplate();
        asyncRestTemplate.exchange()
    }
}