/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jofrantoba.tokens.init;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 *
 * @author root
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.jofrantoba.tokens"})
public class Application {
    public static void main(String arg[]){
        SpringApplication.run(Application.class, arg);
    }
}
