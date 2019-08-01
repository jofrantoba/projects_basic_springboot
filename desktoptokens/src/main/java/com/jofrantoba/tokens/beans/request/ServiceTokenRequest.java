/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jofrantoba.tokens.beans.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

/**
 *
 * @author root
 */
public class ServiceTokenRequest implements Serializable{
    private String pan;
    private int expYear;
    private int expMonth;
    
    @JsonProperty("pan")
    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }
    
    @JsonProperty("exp_year")
    public int getExpYear() {
        return expYear;
    }

    public void setExpYear(int expYear) {
        this.expYear = expYear;
    }
    
    @JsonProperty("exp_month")
    public int getExpMonth() {
        return expMonth;
    }

    public void setExpMonth(int expMonth) {
        this.expMonth = expMonth;
    }
    
    public String getToken(){
        return "tkn_live_" +getPan() + "-" +getExpYear() + "-" +getExpMonth();
    }           
    
}
