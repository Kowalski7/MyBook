package com.kowalski7.mybook.Model;

import com.kowalski7.mybook.Interface.Element;
import com.kowalski7.mybook.Interface.Visitor;

public class TableOfContents implements Element {
    public TableOfContents() {}

    public void print() {}

    public void accept(Visitor v) {
        v.visitTableOfContents(this);
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
