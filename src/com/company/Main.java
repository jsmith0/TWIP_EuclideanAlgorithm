package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        System.out.println("I am going to run the Euclidean Algorithm to find the Greatest Common Divisor (GCD) of two numbers.");
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter your First Number.");
        int A = kb.nextInt();
        System.out.println("Enter your Second Number");
        int B = kb.nextInt();

        System.out.println("Now I will calculate your GCD recursively");
        Solve.ans(A,B);

        System.out.println("Now I will calculate your GCD iteratively");
        SolveIter.ansIter(A,B);


    }

}

