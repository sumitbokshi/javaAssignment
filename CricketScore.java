package com.day2;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class CricketScore {
    static void score(int a,int b,int c,int d,int e) {
        int sum = 0;
        sum += a * 1 + b * 2 + c * 3 + d * 4 + e * 6;
        System.out.println("total run scored:" + sum);
    }

    public static void main(String[] args) {
        score(1,7,4,5,3);
    }
}
