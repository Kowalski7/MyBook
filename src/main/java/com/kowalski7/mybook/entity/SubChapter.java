package com.kowalski7.mybook.entity;

import java.util.ArrayList;
import java.util.List;

public class SubChapter {
    protected String name;
    protected List<Element> elements = new ArrayList<>();

    public SubChapter(String name) {
        this.name = name;
    }

    public int createNewParagraph(String content) {
        this.elements.add(new Paragraph(content));
        return this.elements.size() - 1;
    }

    public int createNewImage(String content) {
        this.elements.add(new Image(content));
        return this.elements.size() - 1;
    }

    public int createNewTable(String content) {
        this.elements.add(new Table(content));
        return this.elements.size() - 1;
    }

    public void print() {
        System.out.printf("• %s\n", this.name);
        for (Element element : this.elements) {
            System.out.print("   ");
            element.print();
        }
    }
}
