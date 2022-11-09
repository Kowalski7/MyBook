package com.kowalski7.mybook.Model;

import com.kowalski7.mybook.Interface.Element;
import com.kowalski7.mybook.Interface.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Section implements Element{
    protected String name;
    protected List<Element> elements = new ArrayList<>();

    public Section(String name) {
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

    public void accept(Visitor v) {
        v.visitSection(this);
        for(Element element : this.elements)
            element.accept(v);
    }

    @Override
    public void add(Element el) {
        this.elements.add(el);
    }

    @Override
    public void remove(Element el) {
        this.elements.remove(el);
    }

    @Override
    public Element get(int idx) {
        return this.elements.get(idx);
    }
}
