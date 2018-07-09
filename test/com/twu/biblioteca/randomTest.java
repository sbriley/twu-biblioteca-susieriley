package com.twu.biblioteca;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class randomTest {
    @Test
    public void testStreamToString() {
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        try (PrintStream ps = new PrintStream(os,true,"UTF-8")){
            System.out.println("hello");
            ps.println("hey there");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String data = new String(os.toByteArray(), StandardCharsets.UTF_8);
        System.out.println(data);
    }
}
