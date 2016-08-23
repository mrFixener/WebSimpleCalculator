/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simplecalculator.service;

import com.simplecalculator.model.Operation;
import java.math.BigDecimal;
import java.math.RoundingMode;
import org.springframework.stereotype.Service;

/**
 *
 * @author Dimon
 */
@Service
public class Calculator {
    public Object calc(final String oper, final String value1, final String value2){
        Operation operation = Operation.valueOf(oper);
        BigDecimal numValue1 = numericValueOf(value1);
        BigDecimal numValue2 = numericValueOf(value2);
        switch(operation){
            case div: return numValue1.divide(numValue2, 2, RoundingMode.HALF_UP);
            case mul: return numValue1.multiply(numValue2);
            case add: return numValue1.add(numValue2);
            case sub: return numValue1.subtract(numValue2);
        }
        throw new AssertionError("Unknown operation: " + oper);
    }
    
    private BigDecimal numericValueOf(final String value){
        return new BigDecimal(value);
    }
    
   
}
