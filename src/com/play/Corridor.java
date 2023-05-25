package com.play;

public class Corridor extends SchoolSpace
{
    private final static short MAX_CAPACITY = 200;

    private short capacity;


    public Corridor()
    {
        capacity = 0;
    }


    @Override
    public void enter(SchoolMember schoolMember) {
        if(this.capacity < MAX_CAPACITY)
        {
            System.out.println(schoolMember.getName() + "enters Corridor");
            this.capacity++;
        }
    }


    @Override
    public void exit(SchoolMember schoolMember) {
       
    }    
}
