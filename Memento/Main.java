package com.maucodev;

import com.maucodev.memento.Editor;
import com.maucodev.memento.History;

public class Main {

    public static void main(String[] args) {
        var editor = new Editor();
        var history = new History();

        editor.setContent("Coding");
        editor.setFontName("Times New Roman");
        editor.setFontSize(16);
        history.push(editor.createState());

        editor.setContent("Design Patterns");
        editor.setFontName("Times New Roman");
        editor.setFontSize(14);
        history.push(editor.createState());

        editor.restore(history.pop());

        System.out.println(editor.getContent());
    }
}
