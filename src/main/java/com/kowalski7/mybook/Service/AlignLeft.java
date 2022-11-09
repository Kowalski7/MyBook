package com.kowalski7.mybook.Service;

import com.kowalski7.mybook.Model.Paragraph;
import com.kowalski7.mybook.Interface.AlignStrategy;

public class AlignLeft implements AlignStrategy {
    public void render(Paragraph paragraph) {
        System.out.println(paragraph.getText() + "\t#\t#\t#\t#\t#\t#\t#\t#");
    }
}
