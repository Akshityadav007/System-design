package com.akshit.systemdesign.chapter6.compositePattern;

public class Main {
    public static void main(String[] args){
        UIComponent uiComponent = new Menu();

        uiComponent.add(new Button());
        uiComponent.add(new Button());
        Button btn = new Button();
        uiComponent.add(btn);

        uiComponent.draw();    // will be called thrice (for all parts)

        uiComponent.remove((btn));

        uiComponent.draw();    // will be called twice (one part was removed)
    }
}
