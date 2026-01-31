package com.akshit.systemdesign.chapter6.compositePattern;

public class Button implements UIComponent{
    // part

    public void draw() {
        System.out.println("Button drawn");
    }

    public void add(UIComponent component){
        System.out.println("Button added");
    }

    public void remove(UIComponent component){
        System.out.println("Button removed");
    }
}
