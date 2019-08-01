/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jofrantoba.tokens.service;

import com.jofrantoba.tokens.beans.request.ServiceTokenRequest;
import com.jofrantoba.tokens.beans.response.ServiceTokenResponse;
import java.io.IOException;

/**
 *
 * @author root
 */
public interface ServiceToken {
    ServiceTokenResponse getToken(ServiceTokenRequest request)throws IOException;
}
