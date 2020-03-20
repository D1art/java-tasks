package com.company;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    static final int N = 50;

    public static void main(String[] args) {
        int[] array = getArray(N);
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < N; i++) {
            executorService.submit(new MyThread(array[i], i));
        }
        executorService.shutdown();
    }

    public static int[] getArray(int N) {
        Random random = new Random();
        int[] array = new int[N];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);
        }
        return array;
    }
}
