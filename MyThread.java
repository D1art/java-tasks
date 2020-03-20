package com.company;

import java.math.BigInteger;

public class MyThread implements Runnable {
    int value;
    int nThread;
    public MyThread(int value, int nThread){
        this.value = value;
        this.nThread = nThread;
    }

    @Override
    public void run() {
     System.out.println("Поток: " + nThread + " Число: " + value + " Факториал: " + factorial(value));
    }

    private BigInteger factorial (int numberFact) {
    BigInteger result = BigInteger.valueOf(1);
        for (int i = 1; i <= numberFact; i++) {
            BigInteger factorial = BigInteger.valueOf(i);
            result = result.multiply(factorial);
        }
    return result;
    }
}