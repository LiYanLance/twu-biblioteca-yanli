package com.twu.biblioteca;

import java.util.List;

public class BibliotecaApp {

    public static void main(String[] args) {

        View view = new View();
        Controller controller = new Controller();

        System.out.println("Welcome!");
        System.out.println();

        User user;
        while(true){
            user = controller.login();
            if (user != null) {
                break;
            }
        }

        while(true) {
            view.printMenu();
            switch (InputHandler.getInputNumber()) {
                case 1:
                    view.showBookList(false);
                    break;
                case 2 :
                    view.showBookList(false);
                    System.out.println("Input the book title you want to check out:");
                    if(controller.checkoutBook(InputHandler.getInput(), user.getLibraryNumber())){
                        System.out.println("Thank you! Enjoy the book.\n");
                    } else {
                        System.out.println("That book is not available.\n");
                    }
                    break;
                case 3:
                    System.out.println("Checked out books:");
                    view.showBookList(true);
                    System.out.println("Input the book title you want to return:");
                    if(controller.returnBook(InputHandler.getInput())){
                        System.out.println("Thank you for returning the book.\n");
                    } else {
                        System.out.println("That is not a valid book to return.\n");
                    }
                    break;
                case 4:
                    view.showMovieList(false);
                    break;
                case 5 :
                    view.showMovieList(false);
                    System.out.println("Input the movie name you want to check out:");
                    if(controller.checkoutMovie(InputHandler.getInput(), user.getLibraryNumber())){
                        System.out.println("Thank you! Enjoy the movie.\n");
                    } else {
                        System.out.println("That movie is not available.\n");
                    }
                    break;
                case 6:
                    System.out.println("Checked out movies:");
                    view.showMovieList(true);
                    System.out.println("Input the movie name you want to return:");
                    if(controller.returnMovie(InputHandler.getInput())){
                        System.out.println("Thank you for returning the movie.\n");
                    } else {
                        System.out.println("That is not a valid movie to return.\n");
                    }
                    break;
                case 7:
                    System.out.println("Bye");
                    return;
                default:
                    System.out.println("Select a valid option!\n");
                    break;
            }
        }
    }
}
