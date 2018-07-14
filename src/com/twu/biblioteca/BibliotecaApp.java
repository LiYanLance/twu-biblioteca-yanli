package com.twu.biblioteca;

import java.util.List;

public class BibliotecaApp {

    public static void main(String[] args) {
        System.out.println("Welcome!");
        System.out.println();
        View view = new View();
        Controller controller = new Controller();

        while(true) {
            view.printMenu();
            switch (InputHandler.getInputNumber()) {
                case 1:
                    view.showBookList();
                    break;
                case 2 :
                    view.showBookList();
                    System.out.println("Input the book title:");
                    String inputTitle = InputHandler.getInput();
                    if(controller.checkoutBook(inputTitle)){
                        System.out.println("Thank you! Enjoy the book.\n");
                    } else {
                        System.out.println("That book is not available.\n");
                    }
                    break;
                case 3:
                    System.out.println("Bye");
                    return;
                default:
                    System.out.println("Select a valid option!\n");
                    break;
            }
        }
    }
}
