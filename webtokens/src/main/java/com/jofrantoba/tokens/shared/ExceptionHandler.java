/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jofrantoba.tokens.shared;

import java.io.PrintWriter;
import java.io.StringWriter;
import org.slf4j.Logger;

public class ExceptionHandler {
    public static void handleException(Exception ex, Logger log) {
        StringWriter stack = new StringWriter();
        ex.printStackTrace(new PrintWriter(stack));
        log.error(stack.toString());
    }
}
