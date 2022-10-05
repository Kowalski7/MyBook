package com.kowalski7.mybook;

import java.util.ArrayList;
import java.util.List;

public class Book {
    protected String title;
    protected List<String> paragraphs = new ArrayList<>();
    protected List<String> images = new ArrayList<>();
    protected List<String> tables = new ArrayList<>();

    public Book(String title) {
        this.title = title;
    }

    public void createNewParagraph(String content) {
        this.paragraphs.add(content);
    }

    public void createNewImage(String content) {
        this.images.add(content);
    }

    public void createNewTable(String content) {
        this.tables.add(content);
    }

    public void print() {
        StringBuilder bookContents = new StringBuilder();
        bookContents.append("Title: ").append(this.title);
        bookContents.append("\nParagraphs:\n");
        for (String paragraph : this.paragraphs)
            bookContents.append("   ").append(paragraph).append("\n");
        bookContents.append("\nImages:\n");
        for (String image : this.images)
            bookContents.append("- ").append(image).append("\n");
        bookContents.append("\nTable:\n");
        for (String table : this.tables)
            bookContents.append(table).append("\n");

        System.out.println(bookContents);
    }
}

