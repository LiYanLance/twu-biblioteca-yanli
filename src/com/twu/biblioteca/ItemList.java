package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class ItemList {

    public static List<Item> items = new ArrayList<Item>();

    static{
        items.add(new Book("Book1", "Author1",2014));
        items.add(new Book("Book2", "Author2",2015));
        items.add(new Book("Book3", "Author3",2016));
        items.add(new Book("Book4", "Author4",2017));
        items.add(new Book("Book5", "Author5",2018));

        items.add(new Movie("Movie1", "Author1",2014, 1));
        items.add(new Movie("Movie2", "Author2",2015, 2));
        items.add(new Movie("Movie2", "Author2",2016, 3));
        items.add(new Movie("Movie4", "Author4",2017, 4));
        items.add(new Movie("Movie5", "Author5",2018, 5));
    }


    public List<Item> getItemList(boolean isCheckedOut, Item.Type type) {
        List<Item> result = new ArrayList<Item>();
        for (Item item : items) {
            if(item.type == type && item.isCheckedOut() == isCheckedOut){
                result.add(item);
            }
        }
        return result;
    }

}
