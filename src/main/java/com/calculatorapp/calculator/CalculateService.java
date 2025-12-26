package com.calculatorapp.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculateService {

    public Double add(double a , double b) {
        return a+b;
    }

    public Double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public Double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public Double divide(double num1, double num2) {
         return num1 / num2;
    }
}
