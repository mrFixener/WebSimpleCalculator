/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.simplecalculator.exception.CalculatorException;
import com.simplecalculator.model.Operation;
import com.simplecalculator.service.Calculator;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dimon
 */
public class OperationTest {
    
    public OperationTest() {
    }
      
    @Test
    public void getOperValueTest(){
        assertEquals(Operation.add, Operation.valueOf("add"));
    }
    
    @Test
    public void operDevideByTest() throws CalculatorException{
        assertEquals("0.24", new Calculator().calc("div", "2", "8.5").toString());
        assertEquals("10.5", new Calculator().calc("add", "2", "8.5").toString());
    }
}
