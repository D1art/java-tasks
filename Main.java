package com.company;

public class Main {

    public static void main(String[] args) throws NullPointerException {
        String str = "Hello world";
        System.out.println(str);

        try {
            throw new NullPointerException("String can not be empty!");
        }
        catch (NullPointerException e) {
            System.out.println("Exception was processed. Program continues");
            throw e;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception was processed");
            throw e;
        }

    }
}
