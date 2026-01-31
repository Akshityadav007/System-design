package com.akshit.systemdesign.chapter6.compositePattern;

public interface UIComponent {

    void draw();

    void add(UIComponent component);

    void remove(UIComponent component);
}
