package com.kowalski7.mybook.Entity;

import com.kowalski7.mybook.Interface.AlignStrategy;

public class AlignLeft implements AlignStrategy {
    public void render(Paragraph paragraph) {
        System.out.println(paragraph.text + "\t#\t#\t#\t#\t#\t#\t#\t#");
    }
}
