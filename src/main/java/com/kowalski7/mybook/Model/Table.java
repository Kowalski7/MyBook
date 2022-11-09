package com.kowalski7.mybook.Model;

import com.kowalski7.mybook.Interface.Element;
import com.kowalski7.mybook.Interface.Visitor;

public class Table implements Element {
    protected String title;

    public Table(String title) {
        this.title = title;
    }

    public void print() {
        System.out.println(this.title);
    }

    public void accept(Visitor v) {
        v.visitTable(this);
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
