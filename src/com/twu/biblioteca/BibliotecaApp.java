package com.twu.biblioteca;

import java.util.List;

public class BibliotecaApp {

    public static void main(String[] args) {
        System.out.println("Welcome!");
        System.out.println();
        View view = new View();

        view.printMenu();
        switch (InputHandler.getInputNumber()){
            case 1 : new View().showBookList(); break;
            default:
                System.out.println("Select a valid option!");
                break;
        }

    }
}
