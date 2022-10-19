package com.kowalski7.mybook.Entity;

import com.kowalski7.mybook.Interface.Element;

public class Paragraph implements Element {
    protected String text;

    public Paragraph(String text) {
        this.text = text;
    }

    public void print() {
        System.out.println(this.text);
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
