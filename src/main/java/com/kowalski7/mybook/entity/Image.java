package com.kowalski7.mybook.entity;

public class Image implements Element {
    protected String imageName;

    public Image(String imageName) {
        this.imageName = imageName;
    }

    public void print() {
        System.out.println(this.imageName);
    }
}
