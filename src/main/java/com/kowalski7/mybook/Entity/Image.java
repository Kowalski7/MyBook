package com.kowalski7.mybook.Entity;

import com.kowalski7.mybook.Interface.Element;
import com.kowalski7.mybook.Interface.Picture;

import java.util.concurrent.TimeUnit;

public class Image implements Element, Picture {
    protected String url;
    protected String content;

    public Image(String url) {
        this.url = url;
        try {
            TimeUnit.SECONDS.sleep(5);
            this.content = "Pretend this is an image ╰(*°▽°*)╯";
        } catch (InterruptedException e) {
            System.out.println("Image loading interrupted");
        }
    }

    public String url() {
        return this.url;
    }

    public String content() {
        return this.content;
    }

    public void print() {
        System.out.println(this.content);
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
