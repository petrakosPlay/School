package com.play;

public class Staircase extends SchoolSpace
{
    
    private final short MAX_CAPACITY;
    private short currentCapacity;
    private SchoolMember[] currentMembers;

    public Staircase(short maxCapacity)
    {
        this.MAX_CAPACITY = maxCapacity;
        currentCapacity = 0;
        currentMembers = new SchoolMember[MAX_CAPACITY];
        System.out.println("A new Staircase with a maximum capacity of " + this.MAX_CAPACITY + " students has been created!");
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
