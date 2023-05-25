package com.play;

public class Corridor extends SchoolSpace
{
    private final short MAX_CAPACITY;
    private short currentCapacity;
    private SchoolMember[] currentMembers;


    public Corridor(short maxCapacity)
    {
        this.MAX_CAPACITY = maxCapacity;
        this.currentCapacity = 0;
        currentMembers = new SchoolMember[MAX_CAPACITY];
        System.out.println("A new Corridor with a maximum capacity of " + this.MAX_CAPACITY + " students has been created!");
    }


    @Override
    public void enter(SchoolMember schoolMember) {
        if(this.currentCapacity < MAX_CAPACITY)
        {
            System.out.println(schoolMember.getName() + "enters Corridor");
            this.currentCapacity++;
        }
    }


    @Override
    public void exit(SchoolMember schoolMember) {
       
    }    
}
