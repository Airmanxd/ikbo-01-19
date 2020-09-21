package com.company;

import java.util.Arrays;

public class lab1 {
    public static void main(String[] args)
    {
        int[] a = new int[15];
        System.out.println("Initial array");
        for(int i = 0; i < 15; i++)
        {
            a[i] = (int) (Math.random()*10000);
            System.out.println((i+1)+ ": " + a[i]);
        }
        Arrays.sort(a);
        System.out.println("Sorted array");
        for(int i = 0; i < 15; i++)
        {
            System.out.println((i+1)+ ": " + a[i]);
        }
    }
}
