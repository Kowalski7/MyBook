package com.kowalski7.mybook.entity;

import java.util.ArrayList;
import java.util.List;

public class Chapter {
    protected String name;
    List<SubChapter> subChapters = new ArrayList<>();

    public Chapter(String name) {
        this.name = name;
    }

    public int createSubChapter(String name) {
        subChapters.add(new SubChapter(name));
        return this.subChapters.size() - 1;
    }

    public SubChapter getSubChapter(int idx) {
        return this.subChapters.get(idx);
    }

    public void print() {
        System.out.println(this.name);
        for (SubChapter subChapter : this.subChapters)
            subChapter.print();
    }
}
