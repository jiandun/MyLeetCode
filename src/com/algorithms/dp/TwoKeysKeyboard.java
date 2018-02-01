package com.algorithms.dp;

public class TwoKeysKeyboard {
    public int minSteps(int n) {
        int fac = 2;
        int result = 0;
        while(fac * fac <= n){
            while(n % fac == 0){
                result += fac;
                n = n/fac;
            }
            fac++;
        }
        if(n > 1)
            result += n;
        return result;
    }
}
