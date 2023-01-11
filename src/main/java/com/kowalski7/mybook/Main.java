package com.kowalski7.mybook;

import com.kowalski7.mybook.Entity.ObserverToC;
import com.kowalski7.mybook.Model.*;

public class Main {
    public static void main(String[] args) {
        Book myBook = new Book("My book");
        DocumentManager.getInstance().setBook(myBook);
        Author me = new Author("Myself");
        myBook.addAuthor(me);
        Section cap1 = new Section("Chapter 1");
        Paragraph p1 = new Paragraph("Paragraph 1");
        cap1.add(p1);
        Paragraph p2 = new Paragraph("Paragraph 2");
        cap1.add(p2);
        Paragraph p3 = new Paragraph("Paragraph 3");
        cap1.add(p3);
        Paragraph p4 = new Paragraph("Paragraph 4");
        cap1.add(p4);
        myBook.add(cap1);

        ObserverToC o = new ObserverToC(myBook);
        myBook.registerObserver(o);

        Section s = new Section("Test section");
        myBook.add(s);

        o.getToc().print();
    }

    public static void Printing() {
        DocumentManager.getInstance().getBook().print();
    }
}
