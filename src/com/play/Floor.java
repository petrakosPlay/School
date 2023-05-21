package com.play;

public class Floor {
    
    private final static short NUMBER_OF_CLASSES = 6;
    private Corridor corridor;
    private Class[] classes;


    public Floor()
    {
        corridor = new Corridor();
        classes = new Class[6];
        for(int i=0; i < NUMBER_OF_CLASSES; ++i)
            classes[i] = new Class();
    }
}
