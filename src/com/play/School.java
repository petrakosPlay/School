package com.play;

public class School
{
    private final static byte NUMBER_OF_FLOORS = 3; 
    private Floor[] floors;
    private Yard yard;
    private Staircase staircase;

    public School()
    {
        yard = new Yard();
        staircase = new Staircase();
        for (byte i=0; i < NUMBER_OF_FLOORS; ++i)
            floors[i] = new Floor();
    }

    public void enter(SchoolMember schoolMember) {
        System.out.println(schoolMember.getName() + "enters school");
    }

    public void exit(SchoolMember schoolMember) {
        System.out.println(schoolMember.getName() + "exits school");
    }

}
