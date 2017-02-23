package com.company;

/**
 * Created by js456 on 2/23/17.
 */
public class Solve {
    public static int ans(int a, int b){

        if (b == 0) {
            System.out.println("Your GCD is: " + a);
        }
        else if (a == 0){
            System.out.println("Your GCD is: " + b);

        }
        else{
            int rem = a % b;
            a = b;
            b = rem;
            ans(a,b);
        }

        return a;
    }
}
