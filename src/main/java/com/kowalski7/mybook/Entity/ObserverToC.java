package com.kowalski7.mybook.Entity;

import com.kowalski7.mybook.Factory.TableOfContentFactory;
import com.kowalski7.mybook.Interface.Observer;
import com.kowalski7.mybook.Model.Book;
import com.kowalski7.mybook.Model.TableOfContents;

public class ObserverToC implements Observer {
    protected TableOfContentFactory tocFactory;

    public ObserverToC(Book book) {
        this.tocFactory = new TableOfContentFactory(book);
    }

    @Override
    public void update() {
        this.tocFactory.create();
    }

    public TableOfContents getToc() {
        return tocFactory.getToc();
    }
}
