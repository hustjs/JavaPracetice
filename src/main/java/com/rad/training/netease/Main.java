package com.rad.training.netease;

import java.util.*;

/**
 * Created by radical on 16-8-2.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n, k, d;
        long sum = 1;
        Map<Integer, Integer> map = new HashMap<>();
        while (in.hasNext()) {//注意while处理多个case
            n = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
                map.put(a[i], i);
            }
            k = in.nextInt();
            d = in.nextInt();
            Arrays.sort(a);
            int length = a.length;
            if (d >= n-1) {
                for (int i = 1; i <= k; i++) {
                    sum *= a[length - i];
                }
            }else {
                //sum *= a[length - 1];
                int count = 0;
                for (int i = 1; count < k && i < length; i++) {
                    /*System.out.print(i);
                    System.out.print(count);
                    System.out.print(a[length-i]);
                    System.out.print(map.get(a[length-i]));
                    System.out.print(map.get(a[length-i-1]));
                    System.out.println(d >= map.get(a[length - i]) - map.get(a[length - 1 - i])&&(-d <= map.get(a[length - 1 - i]) - map.get(a[length - i])));*/
                    if (d >= map.get(a[length - i]) - map.get(a[length - 1 - i])||-d <= map.get(a[length - 1 - i]) - map.get(a[length - i])) {
                        sum *= a[a.length - i];
                        count++;
                    } else
                        continue;
                }
            }
            System.out.println(sum);
        }

    }
}
/*import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n, k, d;
        long sum = 1;
        Map<Integer, Integer> map = new HashMap<>();
        while (in.hasNext()) {//注意while处理多个case
            n = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
                map.put(a[i], i);
            }
            k = in.nextInt();
            d = in.nextInt();
            Arrays.sort(a);
            int length = a.length;
            if (d >= n-1) {
                for (int i = 1; i <= k; i++) {
                    sum *= a[length - i];
                }
            }else {
                sum *= a[length - 1];
                int count = 0;
                for (int i = 1; count < k-1 && i < length - 1; i++) {
                    if (d >= map.get(a[length - 1 - i]) - map.get(a[length - 2 - i])||d >= map.get(a[length - 2 - i]) - map.get(a[length - 1 - i])) {
                        sum *= a[a.length - i - 1];
                        count++;
                    } else {
                        continue;
                    }
                }
            }
            System.out.println(sum);
        }
    }
}*/