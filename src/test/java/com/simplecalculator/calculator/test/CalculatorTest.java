/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simplecalculator.calculator.test;

import com.simplecalculator.exception.CalculatorException;
import com.simplecalculator.service.Calculator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author Dimon
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/applicationContextTest.xml")
public class CalculatorTest {
    //@Autowired
    private Calculator calc;
    public CalculatorTest() {
    }
    
    @Before
    public void setUp() {
        calc = new Calculator();
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void devideByZiroTest() throws CalculatorException{
        calc.calc("div", "5", "0");
    }
    
}
