package org.example.calculator;


import java.util.Arrays;

public enum ArithmeticOperator {
    ADDITION("+") {
        @Override
        public int arithmeticCalculate(int operand1, int operant2) {
            return operand1 + operant2;
        }
    }, SUBTRACTION("-") {
        @Override
        public int arithmeticCalculate(int operand1, int operant2) {
            return operand1 - operant2;
        }
    }, MULTIPLICATION("*") {
        @Override
        public int arithmeticCalculate(int operand1, int operant2) {
            return operand1 * operant2;
        }
    }, DIVISION("/") {
        @Override
        public int arithmeticCalculate(int operand1, int operant2) {
            return operand1 / operant2;
        }
    };

    private final String operator;

    ArithmeticOperator(String operator) {
        this.operator = operator;
    }

    public abstract int arithmeticCalculate(final int operand1, final int operant2);

    public static int calculate(int operand1, String operator, int operand2) {
        ArithmeticOperator arithmeticOperator = Arrays.stream(values())
                .filter(v -> v.operator.equals(operator))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("올바른 사칙연산이 필요합니다: " + operator));

        return arithmeticOperator.arithmeticCalculate(operand1, operand2);
    }

}
