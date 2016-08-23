/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.simplecalculator.controller;
import com.simplecalculator.service.Calculator;
import static com.simplecalculator.controller.CalcController.OutputKeys.EXEP_KEY;
import static com.simplecalculator.controller.CalcController.OutputKeys.RESULT;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Dimon
 */
@Controller
public class CalcController {
    @Autowired
    private Calculator calc;
    private Map<String, Object> errorViewMap(Throwable ex){
        Map<String, Object> errMap = new HashMap();
        errMap.put(EXEP_KEY, (Object) ex);
        return errMap;
    }
    @RequestMapping(value = "/calculate", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    ResponseEntity<Object> calculate(@RequestParam(value = "value1", required = true) String value1,
                                     @RequestParam(value = "value2", required = true) String value2,
                                     @RequestParam(value = "oper", required = true)   String oper) {
        try {
            Map<String, Object> resp = new HashMap();
            resp.put(RESULT, calc.calc(oper, value1, value2));
            return new ResponseEntity<>((Object) resp, HttpStatus.OK);
        } catch (Throwable ex) {
            return new ResponseEntity<>((Object)errorViewMap(ex), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    public static class OutputKeys{
        public static final String RESULT ="result";
        public static final String EXEP_KEY = "exep";
    }
}
