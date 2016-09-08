package com.rad.training.oj.jd2;

import java.util.Scanner;

/**
 * Created by radical on 16-9-5.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int num = in.nextInt();
            int[] height = new int[num];
            for (int i = 0; i < num; i++) {
                height[i] = in.nextInt();
            }
            int sum = 0;
            int length = height.length;
            for (int i = 0; i < length; i++) {
                for (int j = i+1; j < length; j++) {
                    if (seeyou(height, i, j)) {
                        sum += 1;
                    }
                }
            }
            System.out.println(sum);
        }
    }

    private static boolean seeyou(int[] height, int i, int j) {
        boolean big;
        if (height[i] > height[j]) {
            big = true;
        } else {
            big = false;
        }
        for (int k = i;  k < j;  k++) {
            if (big) {
                if (height[k]>height[i])
                    return false;
            } else {
                if (height[k]>height[j])
                    return false;
            }
        }
        return true;
    }

}
