package com.play;

public class Yard extends SchoolSpace
{
    
    private final static short MAX_CAPACITY = 600;

    private short capacity;


    public Yard()
    {
        capacity = 0;
    }


    @Override
    public void enter(SchoolMember schoolMember) {
        System.out.println(schoolMember.getName() + "enters School");
    }


    @Override
    public void exit(SchoolMember schoolMember) {
    }



}
