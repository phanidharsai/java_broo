package com.phanidharsai.exceptions;

import java.io.IOException;

public class ExpThrows {
        // Example method that throws IOException
        public static void readFile(String filePath) throws IOException {
            // Code to read a file
            // If an IOException occurs, it will be thrown to the caller
            throw new IOException("File not found");
        }

        // Example method that throws custom exception
        public static void validateAge(int age) throws IllegalArgumentException {
            if (age < 0) {
                throw new IllegalArgumentException("Age cannot be negative");
            }
            // Rest of the code
        }

        // Main method to demonstrate exception handling
        public static void main(String[] args) throws IOException,IllegalArgumentException{
//        try {
            // Calling a method that throws IOException
            readFile("example.txt");
//        } catch (IOException e) {
//            System.err.println("IOException caught: " + e.getMessage());
//        }

//        try {
            // Calling a method that throws IllegalArgumentException
            validateAge(-5);
//        } catch (IllegalArgumentException e) {
//            System.err.println("IllegalArgumentException caught: " + e.getMessage());
        }
    }
