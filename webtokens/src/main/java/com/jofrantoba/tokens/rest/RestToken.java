/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jofrantoba.tokens.rest;

import com.jofrantoba.tokens.beans.request.ServiceTokenRequest;
import com.jofrantoba.tokens.beans.response.ServiceTokenResponse;
import com.jofrantoba.tokens.service.ServiceToken;
import com.jofrantoba.tokens.shared.UnknownException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author root
 * Test: ejecutar en terminal
 * curl -X POST localhost:8080/tokens -H 'Content-type:application/json' -d '{"pan": "4444333322221111", "exp_year": 2020, "exp_month": 10 }'
 */
@RestController
public class RestToken {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Autowired
    ServiceToken service;
            
    @PostMapping("/tokens")
    public ServiceTokenResponse getToken(@RequestBody ServiceTokenRequest request) throws UnknownException{
        try{
            return service.getToken(request);
        }catch(Exception ex){
            throw new UnknownException(ex,logger);
        }        
    }
    
}
