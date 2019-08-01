/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jofrantoba.tokens.shared;

import java.io.Serializable;
import org.slf4j.Logger;

/**
 *
 * @author root
 */
public class UnknownException extends Exception implements Serializable {

    private static final long serialVersionUID = -3716210112460968735L;

    public UnknownException(Exception ex,Logger logger){
        super(ex.getMessage());
        ExceptionHandler.handleException(ex, logger);
    }        

}
