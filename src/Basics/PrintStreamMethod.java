package Basics;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PrintStreamMethod {
    public static void main(String[] args) throws Exception{
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        PrintStream file = new PrintStream("output.txt");
        System.setOut(null);
        System.out.println("Hello World");
        String result = buffer.toString();
        System.err.println("Captured: " + result);
    }
}
