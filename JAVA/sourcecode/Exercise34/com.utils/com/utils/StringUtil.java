/*
 * Exercise 34 - Creating a Utility Class
 * Objective:
 * Create a utility class with static methods for common string operations.
 */

package com.utils;
public class StringUtil {

    public static String toUpperCase(String input) {
        return input.toUpperCase();
    }

    public static String greet(String name) {
        return "Hello " + name + "!";
    }
}
