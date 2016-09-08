package com.yinuo.training.youdao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by radical on 16-8-17.
 */
public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int a, b;
        while (cin.hasNextInt()) {
            a = cin.nextInt();
            List<Integer> single = new ArrayList<>();
            List<Integer> doub = new ArrayList<>();
            int l[][] = new int[a][4];
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < 4; j++) {
                    l[i][j] = cin.nextInt();
                    if (j % 2 == 1) {
                        single.add(l[i][j]);
                    } else
                        doub.add(l[i][j]);
                }
            }
            int high = Collections.max(single);
            int low = Collections.min(single);
            int right = Collections.max(doub);
            int left = Collections.min(doub);
            int highx = doub.get(single.indexOf(high));
            int highx1 = doub.get(single.lastIndexOf(high));
            int lowx = doub.get(single.indexOf(low));
            int lowx1 = doub.get(single.lastIndexOf(low));
            int ly = single.get(doub.indexOf(left));
            int ry = single.get(doub.indexOf(right));
            if (isretrangle(high,highx1,low,lowx,high,highx,low,lowx1))
                System.out.println(lowx+" "+low+" "+highx1+" "+high);
        }
    }

    public static int leng(int a, int b, int c, int d) {
        int height = (a - c) * (a - c);
        int weight = (b - d) * (b - d);
        return height + weight;
    }

    public static boolean isretrangle(int a, int b, int c, int d,int e, int f, int g, int h) {
        if (leng(a, b, c, d) == leng(e, f, g, h)) {
            return true;
        }
        return false;
    }

}
