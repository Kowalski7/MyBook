package com.kowalski7.mybook.Entity;

import com.kowalski7.mybook.Interface.Visitor;
import com.kowalski7.mybook.Model.*;

public class BookStatistics implements Visitor {
    protected int countBook;
    protected int countSection;
    protected int countTableOfContents;
    protected int countParagraph;
    protected int countImage;
    protected int countTable;

    public BookStatistics() {
        this.countBook = 0;
        this.countSection = 0;
        this.countTableOfContents = 0;
        this.countParagraph = 0;
        this.countImage = 0;
        this.countTable = 0;
    }

    @Override
    public void visitBook(Book book) {
        this.countBook++;
    }

    @Override
    public void visitSection(Section section) {
        this.countSection++;
    }

    @Override
    public void visitTableOfContents(TableOfContents tableOfContents) {
        this.countTableOfContents++;
    }

    @Override
    public void visitParagraph(Paragraph paragraph) {
        this.countParagraph++;
    }

    @Override
    public void visitImageProxy(ImageProxy imageProxy) {
        this.countImage++;
    }

    @Override
    public void visitImage(Image image) {
        this.countImage++;
    }

    @Override
    public void visitTable(Table table) {
        this.countTable++;
    }

    public void printStatistics() {
        System.out.println("Book Statistics:");
        System.out.println("*** Number of sections: " + countSection);
        System.out.println("*** Number of tables of content: " + countTableOfContents);
        System.out.println("*** Number of paragraphs: " + countParagraph);
        System.out.println("*** Number of images: " + countImage);
        System.out.println("*** Number of tables: " + countTable);
        System.out.println();
    }
}
