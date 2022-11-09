package com.kowalski7.mybook.Model;

import com.kowalski7.mybook.Interface.Element;
import com.kowalski7.mybook.Interface.Picture;
import com.kowalski7.mybook.Interface.Visitor;

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

    public void accept(Visitor v) {
        v.visitImageProxy(this);
        if(this.realImage != null)
            this.realImage.accept(v);
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
