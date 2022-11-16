package com.kowalski7.mybook.Factory;

import com.kowalski7.mybook.Interface.Visitor;
import com.kowalski7.mybook.Model.*;

public class TableOfContentFactory implements Visitor {
    protected Section section;
    protected TableOfContents toc;

    public TableOfContentFactory(Section section) {
        this.section = section;
        this.toc = new TableOfContents();
    }

    public TableOfContents create() {
        this.section.accept(this);
        return toc;
    }

    @Override
    public void visitBook(Book book) {

    }

    @Override
    public void visitSection(Section section) {
        this.toc.addChapter(section.getName());
    }

    @Override
    public void visitTableOfContents(TableOfContents tableOfContents) {

    }

    @Override
    public void visitParagraph(Paragraph paragraph) {
        this.toc.incrementLastPage();
    }

    @Override
    public void visitImageProxy(ImageProxy imageProxy) {

    }

    @Override
    public void visitImage(Image image) {
        this.toc.incrementLastPage();
    }

    @Override
    public void visitTable(Table table) {
        this.toc.incrementLastPage();
    }
}
