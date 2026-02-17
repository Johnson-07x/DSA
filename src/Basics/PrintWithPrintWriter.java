package Basics;

import java.io.PrintWriter;

public class PrintWithPrintWriter {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out);
        pw.println("Hello World");
        pw.close();
    }
}
