package com.yinuo.training.helloDate;

import java.io.File;

/**
 * Created by radical on 16-8-8.
 */
public class FileDemo {
    public static void main(String[] args) {

        File f = null;
        File[] paths;

        try {
            // create new file
            f = new File("/home/radical/dotest/filedemo");

            // returns pathnames for files and directory
            paths = f.listFiles();
            System.out.println(paths.length);
            System.out.println("Hashcode"+paths.hashCode());

            if (paths == null) {
                return;
            }
            // for each pathname in pathname array
            for (File path : paths) {
                // prints file and directory paths
                System.out.println(path);
                System.out.println("Name: " + path.getName());
                System.out.println("Path: " + path.getPath());
                System.out.println("Canonical: " + path.getCanonicalPath());
                System.out.println("AbsolutePath: " + path.getAbsolutePath());
                //path.delete();
            }
        } catch (Exception e) {
            // if any error occurs
            e.printStackTrace();
        }
    }
}
