package com.maucodev.memento;

import java.util.ArrayDeque;
import java.util.Deque;

public class History {
    private Deque<EditorState> states = new ArrayDeque<>();

    public void push(EditorState state) {
        states.add(state);
    }

    public EditorState pop() {
        return states.pop();
    }
}
