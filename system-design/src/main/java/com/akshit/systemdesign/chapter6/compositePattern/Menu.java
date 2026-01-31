package com.akshit.systemdesign.chapter6.compositePattern;

import java.util.ArrayList;
import java.util.List;

public class Menu implements UIComponent{
    // Whole
    // Menu can contain multiple parts within it. We can consider parts as children

    List<UIComponent> children = new ArrayList<>();

    @Override
    public void draw() {
        for(UIComponent cmp: children){
            cmp.draw();
        }
    }

    @Override
    public void add(UIComponent component) {
            children.add(component);
    }

    @Override
    public void remove(UIComponent component) {
            children.remove(component);
    }
}
