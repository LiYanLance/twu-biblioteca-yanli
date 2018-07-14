package com.twu.biblioteca;

import java.util.List;

public class View {


    public void printMenu(){
        String menu =  ">>>>>>>>>>>>>>>>>>>>\n" +
                "1. List Books \n" +
                "2. Checkout Book \n" +
                "3. Return Book\n" +
                "4. List Movies \n" +
                "5. Checkout Movie \n" +
                "6. Return Movie\n" +
                "7. User information\n" +
                "8. Quit \n" +
                "<<<<<<<<<<<<<<<<<<<<";
        System.out.println(menu);
    }


    public void showItemList(boolean isCheckedOut, Item.Type type){
        StringBuilder stringBuilder = new StringBuilder();
        ItemList itemList = new ItemList();
        List<Item> items = itemList.getItemList(isCheckedOut, type);
        if(type == Item.Type.BOOK) {
            stringBuilder.append("Title\t").append("Author\t").append("Year Published\t\n");
            for (Item item : items) {
                Book book = (Book)item;
                stringBuilder.append(book.getTitle() + "\t")
                        .append(book.getAuthor() + "\t")
                        .append(book.getYear() + "\t\n");
            }
        }else{
            stringBuilder.append("Name\t").append("Director\t").append("Year\t").append("Rating\n");
            for(Item item : items){
                Movie movie = (Movie) item;
                stringBuilder.append(movie.getTitle() + "\t")
                        .append(movie.getDirector() + "\t")
                        .append(movie.getYear() + "\t")
                        .append(movie.getRating() + "\t\n");
            }
        }
        System.out.println(stringBuilder.toString());
    }

    public void displayUserInfomation(User user) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("name:\t").append(user.getName() + "\n")
                .append("email address:\t").append(user.getEmail() + "\n")
                .append("phone number:\t").append(user.getPhoneNumber() + "\n\n");
        System.out.println(stringBuilder.toString());
    }

    public void welcome() {
        System.out.println("Welcome!\n");
    }
}
