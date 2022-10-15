package com.kowalski7.mybook.entity;

public class Paragraph implements Element {
    protected String text;

    public Paragraph(String text) {
        this.text = text;
    }

    public void print() {
        System.out.println(this.text);
    }
}
