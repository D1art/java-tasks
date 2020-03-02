package com.company;
import java.util.Scanner;

public class Main {
    /**
     * Генерация N случайных чисел
     *@autor Чернов Дмитрий
     * @version 1.0
     * @param args
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите N: ");
        int N = scanner.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() *2000 ) - 1000);
            int k = array[i];
            try {

                if (k < 0) throw new IllegalArgumentException();
                int q = (int) Math.sqrt(k);

                if (k == q*q)
                    System.out.println("Ответ: " + k);
            } catch (IllegalArgumentException e) {

                }
        }
    }
}
