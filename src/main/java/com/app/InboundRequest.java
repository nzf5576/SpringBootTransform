/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app;

import java.io.Serializable;

public class InboundRequest implements Serializable {
    private String inbound;

    public InboundRequest() {
        super();
    }
    
    public InboundRequest(String inbound) {
        this.inbound = inbound;
    }

    public String getInbound() {
        return inbound;
    }

    public void setInbound(String inbound) {
        this.inbound = inbound;
    }   
}


