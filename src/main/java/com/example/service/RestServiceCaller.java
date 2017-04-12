package com.example.service;

import org.springframework.http.HttpMethod;

import java.util.Map;
import java.util.concurrent.Future;

/**
 * This service calls an external rest service and returns any json that the service returns
 */
public interface RestServiceCaller {
    Future<String> callService(String url, Map<String, String> headers, Map<String, Object> parameters, HttpMethod method);
}
