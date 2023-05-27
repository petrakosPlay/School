package com.play;

public class School
{
    private final static byte NUMBER_OF_FLOORS = 3;
    private Yard yard;
    private Staircase stairCase;
    private Floor[] floors;


    public School(short maxYardCapacity, short maxStaircaseCapacity, short maxCorridorCapacity, short maxClassCapacity)
    {
        yard = new Yard(maxYardCapacity);
        stairCase = new Staircase(maxStaircaseCapacity);
        floors = new Floor[NUMBER_OF_FLOORS];
        for (byte i=0; i < NUMBER_OF_FLOORS; ++i)
            floors[i] = new Floor(i, maxCorridorCapacity, maxClassCapacity);
        System.out.println("A new School has been created!");
    }

    public Yard getYard(){return this.yard;};
    
    public boolean enterYard (SchoolMember schoolMember) {
        return yard.enter(schoolMember);
    }

    public boolean enterStairCase(SchoolMember schoolMember) {
        return stairCase.enter(schoolMember);
    }
    
    public boolean exitYard() {
        return yard.exit();
    }

}
