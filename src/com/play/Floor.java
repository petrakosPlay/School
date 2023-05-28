package com.play;

public class Floor
{
    private final static short NUMBER_OF_CLASSES = 6;
    private Corridor corridor;
    private Class[] classes;
    private byte floorNumber;


    public Floor(byte floorNumber, short maxCorridorCapacity, short maxClassCapacity)
    {
        this.floorNumber = floorNumber;
        corridor = new Corridor(maxCorridorCapacity);
        classes = new Class[NUMBER_OF_CLASSES];
        for(byte i=0; i < NUMBER_OF_CLASSES; ++i)
            classes[i] = new Class( (byte) (i+1), maxClassCapacity);
        System.out.println("Floor number " + this.floorNumber + " has been created");
    }

    public Corridor getCorridor(){return this.corridor;};


    public boolean enter(SchoolMember schoolMember) {
        System.out.println(schoolMember.getName() + "enters Floor");
        return corridor.enter(schoolMember);
    }

}
