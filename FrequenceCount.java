package com.company;

import java.util.Scanner;

public class FrequenceCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of array:");
        byte size = sc.nextByte();
        char arr[] = new char[size];
        for(int i=0;i<size;i++)
        {
            System.out.print("Enter element:");
            arr[i]=sc.next().charAt(0);
        }
        boolean visited;
        int count;
        for(int i=0;i<arr.length;i++)
        {
            count=1;
            visited=false;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                   count++;
                }
            }
            for(int k=0;k<i;k++)
            {
                if(arr[i]==arr[k])
                {
                    visited=true;
                    break;
                }
            }
            if(!visited)
            {
                System.out.println(arr[i]+" Occurred: "+count);
            }
        }
    }
}
