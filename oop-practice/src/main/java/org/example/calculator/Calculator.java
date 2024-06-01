package org.example.calculator;

import java.util.List;

public class Calculator {
    private static final List<NewArithmeticOperator> arthimeticOperator =
            List.of(new AdditionOperator(), new SubtractionOperator(), new MultiplicationOperator(), new DivisonOperator());

    public static int calculate(PositiveNumber operand1, String operator, PositiveNumber operand2){
        return arthimeticOperator.stream()
                .filter(arithmeticOperator -> arithmeticOperator.supports(operator))
                .map(arthimeticOperator -> arthimeticOperator.calculate(operand1, operand2))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("올바른 연산이 아닙니다."));
    }
}
