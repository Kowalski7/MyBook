package com.kowalski7.mybook.Interface;

import com.kowalski7.mybook.Model.ImageProxy;
import com.kowalski7.mybook.Model.*;

public interface Visitor {
    void visitBook(Book book);
    void visitSection(Section section);
    void visitTableOfContents(TableOfContents tableOfContents);
    void visitParagraph(Paragraph paragraph);
    void visitImageProxy(ImageProxy imageProxy);
    void visitImage(Image image);
    void visitTable(Table table);
}
