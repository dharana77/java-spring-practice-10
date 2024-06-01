package org.example;

public class Calculator {

    public static int calculate(int operant1, String operator, int operant2){
        if (operator.equals("+")){
            return operant1 + operant2;
        }else if(operator.equals("-")){
            return operant1 - operant2;
        }else if(operator.equals("*")){
            return operant1 * operant2;
        }else if(operator.equals("/")){
            return operant1 / operant2;
        }
        return 0;
    }
}
