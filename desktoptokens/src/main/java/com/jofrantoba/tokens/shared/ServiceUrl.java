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
public class ServiceUrl {
    public static String urlBinList(String digitCard){
        return EnumEndpoint.BINLIST.getEndpoint()+Integer.parseInt(digitCard.substring(0, 5));
    }
}
