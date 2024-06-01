package org.example.calculator;

public interface NewArithmeticOperator {
    boolean supports(String operator);
    int calculate(int operant1, int operand2);
}
