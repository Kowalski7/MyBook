package com.kowalski7.mybook.Interface;

public interface Element {
    void print();

    void accept(Visitor v);

    void add(Element el);

    void remove(Element el);

    Element get(int idx);
}
