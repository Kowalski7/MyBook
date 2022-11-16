package com.kowalski7.mybook;

import com.kowalski7.mybook.Entity.BookStatistics;
import com.kowalski7.mybook.Factory.TableOfContentFactory;
import com.kowalski7.mybook.Model.*;

public class Main {
    public static void main(String[] args) {
        Book noapteBuna = new Book("Noapte buna, copii!");
        Author rpGheo = new Author("Radu Pavel Gheo");
        noapteBuna.addAuthor(rpGheo);

        Section cap1 = new Section("Capitolul 1");
        Section cap11 = new Section("Capitolul 1.1");
        Section cap111 = new Section("Capitolul 1.1.1");
        Section cap1111 = new Section("Subchapter 1.1.1.1");
        noapteBuna.add(new Paragraph("Multumesc celor care ..."));
        noapteBuna.add(cap1);
        cap1.add(new Paragraph("Moto capitol"));
        cap1.add(cap11);
        cap111.add(cap1111);
        noapteBuna.add(cap11);
        noapteBuna.add(cap111);
        cap11.add(new Paragraph("Text from subchapter 1.1"));
        TableOfContentFactory tocFactory = new TableOfContentFactory(noapteBuna);
        TableOfContents toc = tocFactory.create();
        toc.print();

//        BookStatistics stats = new BookStatistics();
//        book.accept(stats);
//        stats.printStatistics();
    }
}
