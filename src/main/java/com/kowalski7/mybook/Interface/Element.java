package com.kowalski7.mybook.Interface;

public interface Element {
    void print();

    void add(Element el);

    void remove(Element el);

    Element get(int idx);
}
