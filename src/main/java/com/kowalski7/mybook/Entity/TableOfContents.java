package com.kowalski7.mybook.Entity;

import com.kowalski7.mybook.Interface.Element;

public class TableOfContents implements Element {
    public TableOfContents() {}

    public void print() {}

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
