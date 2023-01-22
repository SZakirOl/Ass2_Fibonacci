/*
Class: 4802
Assignment: Assignment 2
Student: Sabina Oliveira

 */

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        int n2 = recursive(n);
        System.out.println(n + "   "  + n2 + "  ");

    }

    public static int recursive(int n){
        if (n == 0){
            return 0;
        }

        if (n == 1){
            return 1;
        }

        return recursive(n - 1) + recursive(n - 2);
    }
}
