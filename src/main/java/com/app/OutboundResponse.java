/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app;

import java.io.Serializable;

/**
 *
 * @author root
 */
public class OutboundResponse implements Serializable {
    
    private String response;
        
    public OutboundResponse() {
        super();
    }
    
    public OutboundResponse(String s) { 
       this.response = s;
     }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
        
}
