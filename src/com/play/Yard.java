package com.play;

public class Yard extends SchoolSpace
{
    
    private final short MAX_CAPACITY;
    private short currentCapacity;
    private SchoolMember[] currentMembers;

    public Yard(short maxCapacity)
    {
        this.MAX_CAPACITY = maxCapacity;
        currentCapacity = 0;
        currentMembers = new SchoolMember[MAX_CAPACITY];
        System.out.println("A new Yard with a maximum capacity of " + this.MAX_CAPACITY + " students has been created!");
    }


    @Override
    public void enter(SchoolMember schoolMember) {
        if(this.currentCapacity < MAX_CAPACITY)
        {
            System.out.println(schoolMember.getName() + "enters SchoolYard");
            currentMembers[currentCapacity] = schoolMember;
            this.currentCapacity++;

        }
        else System.out.println("Yard is full");
    }


    @Override
    public void exit(SchoolMember schoolMember) {
    }



}
