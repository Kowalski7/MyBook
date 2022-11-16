package com.kowalski7.mybook.Model;

import com.kowalski7.mybook.Interface.Element;
import com.kowalski7.mybook.Interface.Visitor;

import java.util.LinkedHashMap;
import java.util.Map;

public class TableOfContents implements Element {
    protected LinkedHashMap<String, Integer> toc;
    protected int lastPageNr;

    public TableOfContents() {
        this.toc = new LinkedHashMap<>();
        this.lastPageNr = 1;
    }

    public void addChapter(String name) {
        toc.put(name, this.lastPageNr);
        lastPageNr++;
    }

    public void incrementLastPage() {
        this.lastPageNr++;
    }

    public void print() {
        for(Map.Entry<String, Integer> entry : toc.entrySet()) {
            System.out.println(entry.getKey() + " .............. " + entry.getValue());
        }
    }

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
