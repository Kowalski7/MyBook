package com.kowalski7.mybook.Entity;

import com.kowalski7.mybook.Interface.AlignStrategy;

public class AlignRight implements AlignStrategy {
    public void render(Paragraph paragraph) {
        System.out.println("#\t#\t#\t#\t#\t#\t#\t#\t" + paragraph.text);
    }
}
