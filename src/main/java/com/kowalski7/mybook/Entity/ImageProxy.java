package com.kowalski7.mybook.Entity;

import com.kowalski7.mybook.Interface.Element;
import com.kowalski7.mybook.Interface.Picture;

public class ImageProxy implements Picture, Element {
    protected Image realImage;
    protected String url;

    public ImageProxy(String url) {
        this.url = url;
    }

    public String url() {
        return this.url;
    }

    public Image loadImage() {
        if(realImage==null) {
            realImage = new Image(this.url);
        }

        return realImage;
    }

    public String content() {
        return this.realImage.content();
    }

    public void print() {
        this.loadImage().print();
    }

    @Override
    public void add(Element el) {
        // This class cannot have elements, even though it implements Element
    }

    @Override
    public void remove(Element el) {
        // This class cannot have elements, even though it implements Element
    }

    @Override
    public Element get(int idx) {
        // This class cannot have elements, even though it implements Element
        return null;
    }

}
