/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simplecalculator.exception;

import java.util.Objects;

/**
 *
 * @author Dimon
 */
public class CalculatorException extends Exception{
    private String status;
    private Integer code;
    private String mes; 
    public CalculatorException(String string) {
        super(string);
    }

    public CalculatorException(String status, Integer code, String mes) {
        this.status = status;
        this.code = code;
        this.mes = mes;
    }

    public String getStatus() {
        return status;
    }

    public Integer getCode() {
        return code;
    }

    
    public String getMes() {
        return mes;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.status);
        hash = 47 * hash + Objects.hashCode(this.code);
        hash = 47 * hash + Objects.hashCode(this.mes);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CalculatorException other = (CalculatorException) obj;
        if (!Objects.equals(this.status, other.status)) {
            return false;
        }
        if (!Objects.equals(this.code, other.code)) {
            return false;
        }
        if (!Objects.equals(this.mes, other.mes)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CalculatorException{" + "status=" + status + ", code=" + code + ", mes=" + mes + '}';
    }

    
    
    
}
