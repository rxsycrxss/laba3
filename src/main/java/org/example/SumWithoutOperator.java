package org.example;

public class SumWithoutOperator {
    public static int execute(int a, int b) {
        if (b == 0) {
            return a;
        }
        int sum = a ^ b;
        int carry = (a & b) << 1;
        return execute(sum, carry);
    }
}

