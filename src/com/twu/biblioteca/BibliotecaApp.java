package com.twu.biblioteca;

import java.util.List;

public class BibliotecaApp {

    public static void main(String[] args) {

        View view = new View();
        Controller controller = new Controller();

        view.welcome();

        User user = null;
        while (true) {
            user = controller.login();
            if (user != null) {
                break;
            }
        }

        while (true) {
            view.printMenu();
            switch (InputHandler.getInputNumber()) {
                case 1:
                    view.showItemList(false, Item.Type.BOOK);
                    break;
                case 2:
                    controller.checkout(user, Item.Type.BOOK);
                    break;
                case 3:
                    controller.returnBack(Item.Type.BOOK);
                    break;
                case 4:
                    view.showItemList(false, Item.Type.MOVIE);
                    break;
                case 5:
                    controller.checkout(user, Item.Type.MOVIE);
                    break;
                case 6:
                    controller.returnBack(Item.Type.MOVIE);
                    break;
                case 7:
                    view.displayUserInfomation(user);
                    break;
                case 8:
                    System.out.println("Bye");
                    return;
                default:
                    System.out.println("Select a valid option!\n");
                    break;
            }
        }
    }

}
