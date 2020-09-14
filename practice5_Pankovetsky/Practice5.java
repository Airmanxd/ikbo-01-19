package com.company;

import java.util.Scanner;

public class Practice5 {
    public static void task2(int n)
    {
        if(n > 1)
        {
            task2(n - 1);
        }
        System.out.println(n);
    }
    public static void task3(int a, int b)
    {
        System.out.println(a);
        if (a<b)
        {
            task3(a+1, b);
        }
        if (a>b)
        {
            task3(a-1, b);
        }
    }
    public static int task4(int k, int s, int lower_boundary)
    {
        int c = 0;
        int sum = 0;
        int temp = k;
        while(temp > 0)
        {
            sum += temp%10;
            temp/=10;
        }
        if (k > lower_boundary)
        {
            c+=task4(k - 1, s, lower_boundary);
        }
        if (sum == s)
        {
            return c + 1;
        }
        else
        {
            return c;
        }
    }
    public static int pow(int k)
    {
        int res = 1;
        for (int n = 0; n < k; n+=1)
        {
            res*=10;
        }
        return res;
    }
    public static void main(String[] args)
    {
        int n, a, b, k, s;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        task2(n);
        a = sc.nextInt();
        b = sc.nextInt();
        task3(a, b);
        k = sc.nextInt();
        s = sc.nextInt();
        int lower_boundary = pow(k-1);
        k = pow(k) - 1;
        System.out.println(task4(k, s, lower_boundary));
    }
}
