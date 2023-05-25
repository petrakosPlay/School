package com.play;

public class Staircase extends SchoolSpace
{
    
    private final short MAX_CAPACITY;
    private short capacity;

    public Staircase(short maxCapacity)
    {
        this.MAX_CAPACITY = maxCapacity;
        capacity = 0;
    }

    @Override
    public void enter(SchoolMember schoolMember) {
        if(this.capacity < MAX_CAPACITY)
        {
            System.out.println(schoolMember.getName() + "enters Staircase");
            this.capacity++;
        }
    }

    @Override
    public void exit(SchoolMember schoolMember) {
       
    }

}
