package com.day2;

public class sumOfNaturalNums {
    static void NaturalSum(int n){
        if(n>0){
            int sum=((n*(n+1))/2);
            System.out.println(sum);
        }
        else{
            System.out.println(n +":not a natural number");
        }
    }

    public static void main(String[] args) {
        NaturalSum(8);
    }
}
