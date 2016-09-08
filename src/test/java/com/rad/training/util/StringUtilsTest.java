package com.rad.training.util;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by radical on 16-8-13.
 */
public class StringUtilsTest {
    String string;
    String sentence;
    @Before
    public void setUp() throws Exception {
        string = "hello";
        sentence = "hello world! I am a Student!";
    }

    @Test
    public void reverse() throws Exception {
        assertEquals("olleh",StringUtils.reverse(string));
    }

    @Test
    public void reverse_loop() throws Exception {
        assertEquals("olleh",StringUtils.reverse(string));
    }

    @Test
    public void reverseRecursively() throws Exception {
        assertEquals("olleh",StringUtils.reverse(string));
    }

    @Test
    public void reverse_sentence() throws Exception{
        System.out.println(StringUtils.reverse_sentence(sentence));
    }
}