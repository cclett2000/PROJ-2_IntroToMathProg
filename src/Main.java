/*
Charles Lett Jr.
February 8, 2022
Desc: Project 2: Determine if number is prime or composite

Write a program that allows a user to select to check a value is prime or composite
This should be OOP. Use classes, a class for prime numbers, and a class for composite.
Prime will require one value
Composite will require two values.
Display whether the value is prime or composite
 */

public class Main {
    public static void main(String[] args) {
        int number = 101;
        int compCheckNum = 0;

        PrimeNumCheck num_check = new PrimeNumCheck();

        num_check.run(number);
    }
}
