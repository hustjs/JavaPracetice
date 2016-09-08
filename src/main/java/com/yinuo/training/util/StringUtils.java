package com.yinuo.training.util;

import java.util.Random;

/**
 * Created by radical on 16-8-12.
 */
public class StringUtils {
    /**
     * reverse String with StringBuilder
     *
     * @param source
     * @return
     */
    public static String reverse(String source) {
        StringBuilder str = new StringBuilder(source);
        return str.reverse().toString();
    }

    /**
     * reverse a sentence
     *
     * @param source
     * @return
     */
    public static String reverse_sentence(String source) {
        String[] word = source.split(" ");
        StringBuilder builder = new StringBuilder();
        for (String str : word) {
            builder.append(reverse(str) + " ");
        }
        return builder.toString();
    }

    /**
     * reverse String without StringBuilder/StringBuffer
     * use a loop to copy write
     *
     * @param source
     * @return
     */
    public static String reverse_loop(String source) {
        if (source == null || source.isEmpty()) {
            return source;
        }
        String reverse = "";
        for (int i = source.length(); i >= 0; i--) {
            reverse += source.charAt(i);
        }
        /*char[] temparray= input.toCharArray();
    int left,right=0;
    right=temparray.length-1;
    for (left=0; left < right ; left++ ,right--)
    {
     // Swap values of left and right
     char temp = temparray[left];
     temparray[left] = temparray[right];
     temparray[right]=temp;
    }*/
        /*StringBuilder strBuilder = new StringBuilder();
        char[] strChars = str.toCharArray();

        for (int i = strChars.length - 1; i >= 0; i--) {
            strBuilder.append(strChars[i]);
        }*/
        return reverse;
    }

    /**
     * reverse Recursively
     *
     * @param str
     * @return
     */
    public static String reverseRecursively(String str) {

        //base case to handle one char string and empty string
        if (str.length() < 2) {
            return str;
        }

        return reverseRecursively(str.substring(1)) + str.charAt(0);

    }

    public static void main(String[] args) {
        //new StringUtils().outMethod();
        System.out.println(randomString(-229985452)+" "+randomString(-147909649));
    }

    private String testLocalInner = "able to access any member";

    public void outMethod() {
        final int beep = 3;
        class Inner {
            String testLocalInner = "test same name variable";

            public void print() {
                System.out.println(beep + testLocalInner);
            }
        }
        Inner in = new Inner();
        in.print();
    }

    public static String randomString(int i) {
        Random ran = new Random(i);
        StringBuilder sb = new StringBuilder();
        for (int n = 0; n<20; n++) {
            int k = ran.nextInt(27);
            if (k == 0) {
                break;
            }

            sb.append((char) ('`' + k));
        }

        return sb.toString();
    }
}
