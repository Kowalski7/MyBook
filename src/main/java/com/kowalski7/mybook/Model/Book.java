package com.kowalski7.mybook.Model;

import com.kowalski7.mybook.Interface.Element;
import com.kowalski7.mybook.Interface.Observer;

import java.util.ArrayList;
import java.util.List;

public class Book extends Section {
    protected List<Author> authors;
    protected Observer observer;

    public Book(String title) {
        super(title);
        this.authors = new ArrayList<>();
    }

    public int addAuthor(Author author) {
        this.authors.add(author);
        return this.authors.size() - 1;
    }

    public void print() {
        System.out.printf("Title: %s\n", super.name);
        System.out.print("Authors: ");
        for (int i = 0; i<this.authors.size(); i++) {
            this.authors.get(i).print();
            System.out.print((i + 1 == this.authors.size()) ? "\n" : ", ");
        }
        for (Element element : this.elements)
            element.print();
    }

    public void registerObserver(Observer obs) {
        this.observer = obs;
    }

    @Override
    public void add(Element el) {
        this.elements.add(el);
        if(this.observer != null)
            this.observer.update();
    }

    @Override
    public void remove(Element el) {
        this.elements.remove(el);
        if(this.observer != null)
            this.observer.update();
    }

    @Override
    public Element get(int idx) {
        return this.elements.get(idx);
    }
}

