package com.akshit.systemdesign.chapter5.builderPattern;

import com.akshit.systemdesign.chapter5.builderPattern.Models.ICar;

public interface ICarBuilder {
    public void buildEngine();
    public void buildChassis();
    public void buildTyre();
    public void buildBodyShell();

    public ICar build();
}
