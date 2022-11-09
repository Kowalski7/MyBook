package com.kowalski7.mybook.Service;

import com.kowalski7.mybook.Model.Paragraph;
import com.kowalski7.mybook.Interface.AlignStrategy;

public class AlignCenter implements AlignStrategy {
    public void render(Paragraph paragraph) {
        System.out.println("#\t#\t#\t#\t" + paragraph.getText() + "\t#\t#\t#\t#");
    }
}
