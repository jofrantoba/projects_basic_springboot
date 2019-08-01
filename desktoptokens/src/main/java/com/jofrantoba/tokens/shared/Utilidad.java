/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jofrantoba.tokens.shared;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author root
 */
public class Utilidad {
    public static String getDate(){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String dateString = format.format(new Date());
        return dateString;
    }
}
