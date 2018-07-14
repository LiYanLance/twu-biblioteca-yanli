package com.twu.biblioteca;

import java.lang.reflect.Type;

public class Item {

    private String title;
    private int year;
    private boolean isCheckedOut;
    private String borrowerNumber;
    protected Type type;

    public enum Type{
        BOOK,
        MOVIE
    }

    public Item(String title, int year, Type type) {
        this.title = title;
        this.year = year;
        this.isCheckedOut = false;
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public String getBorrowerNumber() {
        return borrowerNumber;
    }

    public void setBorrowerNumber(String borrowerNumber) {
        this.borrowerNumber = borrowerNumber;
    }
}
