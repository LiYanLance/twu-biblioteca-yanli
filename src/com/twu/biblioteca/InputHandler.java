package com.twu.biblioteca;

import java.util.Scanner;

public class InputHandler {

    private static Scanner scanner = new Scanner(System.in);

    public static int getInputNumber(){
        return scanner.nextInt();
    }

}
