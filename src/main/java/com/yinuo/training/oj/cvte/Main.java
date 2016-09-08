package com.yinuo.training.oj.cvte;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by radical on 16-9-6.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> l = new ArrayList<>();
        int[] a = {1, 2, 2, 3, 3, 4};
        findSum(a);
        String str = scanner.nextLine();
        String s = str.substring(1, str.length() - 1);
        String[] sl = s.split(",");
        for (int i = 0; i < sl.length; i++) {
            l.add(Integer.parseInt(sl[i]));
        }
        System.out.println(l);
        int sum = scanner.nextInt();
        twoSum(l, sum);
    }

    private static void twoSum(List<Integer> l, int sum) {
        for (int i = 0; i < l.size(); i++) {
            int c = sum - l.get(i);
            if (l.contains(c)) {
                System.out.println("[" + l.get(i) + "," + c+"]");
                return;
            }
        }
    }
    private static void findSum(int[] l) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < l.length; i++) {
            if (!list.contains(l[i])) {
                list.add(l[i]);
            }else {
                list.remove(list.indexOf(l[i]));
            }
        }
        System.out.println("[" + list.get(0) + "," + list.get(1)+"]");
    }
}
