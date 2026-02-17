package Basics;

import java.io.Console;

public class InputUsingConsole {
    public static void main(String[] args) throws Exception{
        Console console = System.console();
        String name = console.readLine("Enter Name: ");
        System.out.println(name);
    }
}
