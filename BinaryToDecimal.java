package com.company;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary number: ");
        String binary = sc.nextLine();
        long b_num = Long.parseLong(binary);
        long deci=0;
        int rem=0;
        for(int i=0;i<binary.length();i++)
        {
            rem=(int)b_num%10;
            deci=deci+(long)(rem*Math.pow(2,i));
            b_num=b_num/10;
        }
        System.out.println("decimal: "+deci);
    }
}
