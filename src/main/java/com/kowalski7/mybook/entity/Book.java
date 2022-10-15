package com.kowalski7.mybook.entity;

import java.util.ArrayList;
import java.util.List;

public class Book {
    protected String title;
    protected List<Author> authors = new ArrayList<>();
    protected List<Chapter> chapters = new ArrayList<>();

    public Book(String title) {
        this.title = title;
    }

    public int addAuthor(Author author) {
        this.authors.add(author);
        return this.authors.size() - 1;
    }

    public int createChapter(String name) {
        this.chapters.add(new Chapter(name));
        return this.chapters.size() - 1;
    }

    public Chapter getChapter(int idx) {
        return this.chapters.get(idx);
    }

    public void print() {
        System.out.printf("Title: %s\n", this.title);
        System.out.print("Authors: ");
        for (int i = 0; i<this.authors.size(); i++) {
            this.authors.get(i).print();
            System.out.print((i + 1 == this.authors.size()) ? "\n" : ", ");
        }
        for (Chapter chapter : this.chapters)
            chapter.print();
    }
}

