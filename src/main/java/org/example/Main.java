package org.example;

public class Main {
    public static void main(String[] args) {
        final int n = 5;

        long recursionResult = Factorial.recursionExecute(n);
        long cycleResult = Factorial.cycleExecute(n);

        assert recursionResult == cycleResult : "Different values factorial";
        System.out.println("Factorial of " + n + ": " + recursionResult);

        recursionResult = Fibonacci.recursionExecute(n);
        cycleResult = Fibonacci.cycleExecute(n);

        assert recursionResult == cycleResult : "Different values fibonacci";
        System.out.println("Fibonacci of " + n + ": " + cycleResult);

        int sumOfDigitsResult = SumOfDigits.execute(6346);
        System.out.println("SumOfDigits " +  6346 + " = " + sumOfDigitsResult);

        int sumWithoutOperatorResult = SumWithoutOperator.execute(7, 3);
        assert SumWithoutOperator.execute(7, 3) == 7 + 3 : "Different values sum";
        System.out.println(7 + " + "+ 3 + " = " + sumWithoutOperatorResult);

    }
}