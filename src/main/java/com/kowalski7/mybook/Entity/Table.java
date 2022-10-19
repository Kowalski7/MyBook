package com.kowalski7.mybook.Entity;

import com.kowalski7.mybook.Interface.Element;

public class Table implements Element {
    protected String title;

    public Table(String title) {
        this.title = title;
    }

    public void print() {
        System.out.println(this.title);
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
