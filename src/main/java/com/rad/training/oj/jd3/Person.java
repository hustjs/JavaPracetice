package com.rad.training.oj.jd3;

/**
 * Created by radical on 16-9-5.
 */
public class Person extends ClassLoader{
    private static Person ourInstance = new Person();

    public static Person getInstance() {
        return ourInstance;
    }

    private Person() {
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        return super.findClass(name);
    }
}
