package com.kowalski7.mybook.Model;

public class Author {
    protected String name;

    public Author(String name) {
        this.name = name;
    }

    public void print() {
        System.out.print(this.name);
    }
}
