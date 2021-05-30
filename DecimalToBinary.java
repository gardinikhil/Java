package com.company;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter decimal Number:");
        int num = sc.nextInt();
        int actual_deci=num;
        String bin="";
        while (num>0)
        {
           bin=(num%2)+bin;
           num=num/2;
        }
        System.out.println("Binary of "+actual_deci+": "+bin);
    }
}
