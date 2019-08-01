/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jofrantoba.tokens.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jofrantoba.tokens.beans.request.ServiceTokenRequest;
import com.jofrantoba.tokens.beans.response.ServiceTokenResponse;
import com.jofrantoba.tokens.shared.ServiceUrl;
import com.jofrantoba.tokens.shared.Utilidad;
import java.io.IOException;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author root
 */
@Service
public class ServiceTokenImpl implements ServiceToken{

    @Override
    public ServiceTokenResponse getToken(ServiceTokenRequest request) throws IOException {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.set("Accept-Version", "3");
        HttpEntity<String> entity = new HttpEntity(headers);
        ResponseEntity<String> response = restTemplate.exchange(ServiceUrl.urlBinList(request.getPan()), HttpMethod.POST, entity, String.class);        
        ObjectMapper mapper = new ObjectMapper();
        JsonNode node=mapper.readTree(response.getBody());  
        ServiceTokenResponse beanResponse=new ServiceTokenResponse();
        beanResponse.setToken(request.getToken());
        beanResponse.setBrand(node.get("scheme").toString());        
        beanResponse.setCreationDt(Utilidad.getDate());
        return beanResponse;
    }
    
}
