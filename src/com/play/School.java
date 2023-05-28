package com.play;

public class School
{
    private final static byte NUMBER_OF_FLOORS = 3;
    private Yard yard;
    private Staircase staircase;
    private Floor[] floors;


    public School(short maxYardCapacity, short maxStaircaseCapacity, short maxCorridorCapacity, short maxClassCapacity)
    {
        yard = new Yard(maxYardCapacity);
        staircase = new Staircase(maxStaircaseCapacity);
        floors = new Floor[NUMBER_OF_FLOORS];
        for (byte i=0; i < NUMBER_OF_FLOORS; ++i)
            floors[i] = new Floor(i, maxCorridorCapacity, maxClassCapacity);
        System.out.println("A new School has been created!");
    }

    public Yard getYard(){return this.yard;};
    public Staircase getStaircase(){return this.staircase;};
    
    
    public boolean enterYard (SchoolMember schoolMember) {
        return yard.enter(schoolMember);
    }
    public SchoolMember exitYard() {
        return yard.exit();
    }

    
    public boolean enterStaircase(SchoolMember schoolMember) {
        return staircase.enter(schoolMember);
    }
    
    

}
