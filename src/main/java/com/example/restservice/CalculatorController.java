package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

	@RequestMapping("/calculate")
	public int calculate(@RequestParam("expression") String expression) {
		 // parse the expression
        int result = 0;
        String[] tokens = expression.split("\\+");
        for (String token : tokens) {
            System.out.println(token);
            result += Integer.parseInt(token);
        }
        // calculate the result
        // return the result
        return result;
	}


}
