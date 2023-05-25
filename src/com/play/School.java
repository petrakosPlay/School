package com.play;

public class School
{
    private final static byte NUMBER_OF_FLOORS = 3;
    private Yard yard;
    private Staircase staircase;
    private Floor[] floors;

    public School(short maxClassCapacity, short maxYardCapacity, short maxStaircaseCapacity, short maxCorridorCapacity)
    {
        yard = new Yard(maxYardCapacity);
        staircase = new Staircase(maxStaircaseCapacity);
        floors = new Floor[NUMBER_OF_FLOORS];
        for (byte i=0; i < NUMBER_OF_FLOORS; ++i)
            floors[i] = new Floor(i, maxCorridorCapacity, maxClassCapacity);
        System.out.println("A new School has been created!");
    }

    public void enter(SchoolMember schoolMember) {
        System.out.println(schoolMember.getName() + "enters school");
    }

    public void exit(SchoolMember schoolMember) {
        System.out.println(schoolMember.getName() + "exits school");
    }

}
