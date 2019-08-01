/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jofrantoba.tokens.shared;

/**
 *
 * @author root
 */
public enum EnumEndpoint {
    BINLIST("https://lookup.binlist.net/");
    
    private final String endpoint;
    
    private EnumEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }
    
    public String getEndpoint() {
        return endpoint;
    }
        
}
