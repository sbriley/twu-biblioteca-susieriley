package com.twu.biblioteca;

public class Response {
    public static String validReturn(String mediaType) {
        return "Thank you for returning the " + mediaType + ".";
    }

    public static String invalidReturn(String mediaType) {
        return "That is not a valid "+ mediaType +" to return.";
    }

    public static String validCheckout(String mediaType) {
        return "Thank you! Enjoy the " + mediaType;
    }

    public static String invalidCheckout(String mediaType) {
        return "That "+ mediaType + " is not available.";
    }
}
