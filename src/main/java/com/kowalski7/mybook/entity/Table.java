package com.kowalski7.mybook.entity;

public class Table implements Element {
    protected String title;

    public Table(String title) {
        this.title = title;
    }

    public void print() {
        System.out.println(this.title);
    }
}
