package com.play;

public class Floor extends SchoolSpace {
    
    private final static short NUMBER_OF_CLASSES = 6;
    private Corridor corridor;
    private Class[] classes;
    private byte floorNumber;


    public Floor(byte floorNumber)
    {
        this.floorNumber = floorNumber;
        corridor = new Corridor();
        classes = new Class[6];
        for(int i=0; i < NUMBER_OF_CLASSES; ++i)
            classes[i] = new Class();
        System.out.println("Floor number " + this.floorNumber + " has been created");
        
    }


    @Override
    public void enter(SchoolMember schoolMember) {
        System.out.println(schoolMember.getName() + "enters Floor");
        
    }


    @Override
    public void exit(SchoolMember schoolMember) {
      
    }
}
