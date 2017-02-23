package com.company;

/**
 * Created by js456 on 2/23/17.
 */
public class SolveIter {
    public static int ansIter(int a, int b) {
        while (a != 0 || b != 0) {
            if (b == 0) {
                System.out.println("Your GCD is: " + a);
                break;
            }
            else if (a == 0) {
                System.out.println("Your GCD is: " + b);
                break;
            }
            else {
                int rem = a % b;
                a = b;
                b = rem;
            }
        }
        return a;
    }
}
