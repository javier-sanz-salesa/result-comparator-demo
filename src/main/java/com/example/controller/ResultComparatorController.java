package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
        logger.info("Aquí estamos con info");
        logger.debug("Aquí estamos con debug");
    }
}
