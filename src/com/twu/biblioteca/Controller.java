package com.twu.biblioteca;

public class Controller {

    private View view = new View();
    private ItemList itemList = new ItemList();


    public User login() {
        System.out.println("Please enter your library number:");
        String number = InputHandler.getInput();
        System.out.println("Please enter your password:");
        String password = InputHandler.getInput();
        User user = new User(number, password, "name", "name@email", "1234567");
        return user;
    }


    public void checkout(User user, Item.Type type) {
        view.showItemList(false, type);
        String ItemType = type == Item.Type.BOOK ? "book" : "movie";
        System.out.println("Input the " + ItemType + " title you want to check out:");
        if(checkoutItem(InputHandler.getInput(), user.getLibraryNumber(), type)){
            System.out.println("Thank you! Enjoy the "+ ItemType + ".\n");
        } else {
            System.out.println("That " + ItemType + " is not available.\n");
        }
    }

    public void returnBack(Item.Type type) {
        String ItemType = type == Item.Type.BOOK ? "book" : "movie";
        System.out.println("Checked out " + ItemType + "s:");
        view.showItemList(true, type);
        System.out.println("Input the " + ItemType + " title you want to return:");
        if(returnItem(InputHandler.getInput(), type)){
            System.out.println("Thank you for returning the " + ItemType + ".\n");
        } else {
            System.out.println("That is not a valid " + ItemType + " to return.\n");
        }
    }


    public boolean checkoutItem(String title, String borrowerNumber, Item.Type type) {
        for(Item item : itemList.getItemList(false, type)){
            if(item.getTitle().equals(title)){
                item.setCheckedOut(true);
                item.setBorrowerNumber(borrowerNumber);
                return true;
            }
        }
        return false;
    }

    public boolean returnItem(String title, Item.Type type) {
        for(Item item : itemList.getItemList(true, type)){
            if(item.isCheckedOut() && item.getTitle().equals(title)){
                item.setCheckedOut(false);
                item.setBorrowerNumber("");
                return true;
            }
        }
        return false;
    }

}
