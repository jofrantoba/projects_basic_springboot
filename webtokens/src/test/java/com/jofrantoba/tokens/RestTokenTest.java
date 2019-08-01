/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jofrantoba.tokens;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jofrantoba.tokens.beans.request.ServiceTokenRequest;
import com.jofrantoba.tokens.init.Application;
import static junit.framework.TestCase.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

/**
 *
 * @author root
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes=Application.class)
@WebMvcTest
public class RestTokenTest {   
    
    @Autowired
    private MockMvc mockMvc;    
    
    @Test
    public  void getToken() throws Exception{  
        ServiceTokenRequest request=new ServiceTokenRequest();
        request.setPan("444333322221111");
        request.setExpYear(2020);
        request.setExpMonth(10);
        ObjectMapper mapper = new ObjectMapper();         
        String requestJson=mapper.writeValueAsString(request);
        RequestBuilder requestBuilder = MockMvcRequestBuilders
            .post("/tokens")                      
            .accept(MediaType.APPLICATION_JSON)
            .content(requestJson)
            .contentType(MediaType.APPLICATION_JSON);
        MvcResult result = mockMvc.perform(requestBuilder)
                .andExpect(jsonPath("brand").value("\"visa\""))
                .andDo(print())
                .andReturn();
        MockHttpServletResponse response = result.getResponse();        
        assertEquals(HttpStatus.OK.value(), response.getStatus());        
    }
}
