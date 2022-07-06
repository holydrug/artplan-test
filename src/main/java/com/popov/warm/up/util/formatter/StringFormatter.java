package com.popov.warm.up.util.formatter;


public class StringFormatter {
    public String reverseString(String line) {
        StringBuilder stringBuilder = new StringBuilder(line);
        return  stringBuilder.reverse().toString();
    }
}
