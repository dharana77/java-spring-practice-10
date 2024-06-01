package org.example.calculator;

public interface NewArithmeticOperator {
    boolean supports(String operator);
    int calculate(PositiveNumber operant1, PositiveNumber operand2);
}
