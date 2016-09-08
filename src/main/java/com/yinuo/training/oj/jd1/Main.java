package com.yinuo.training.oj.jd1;

import java.util.Scanner;

/**
 * Created by radical on 16-9-5.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int num = in.nextInt();
            int factor = num - 2;
            int sum = findsum(num);
            printformat(sum, factor);
        }
    }

    private static void printformat(int sum, int factor) {
        int a = gcd(sum, factor);
        System.out.println(sum / a + "/" + factor / a);
    }

    private static int findsum(int num) {
        int sum = 0;
        for (int i = 2; i < num; i++) {
            sum += transum(num, i);
        }
        return sum;
    }

    private static int transum(int num, int i) {
        int sum = 0;
        while (num >= i) {
            sum += num % i;
            num /= i;
        }
        sum += num;
        return sum;
    }

    static int gcd(int a, int b)
    {
        if(b == 0)
            return a;
        return gcd(b, a % b);
    }
}
