package com.play;

public class Corridor extends SchoolSpace
{
    public Corridor(short maxCapacity)
    {
        super(maxCapacity);
        System.out.println("A new Corridor with a maximum capacity of " + this.MAX_CAPACITY + " students has been created!");
    }


    @Override
    public boolean enter(SchoolMember schoolMember)
    {
        if(this.currentCapacity < MAX_CAPACITY)
        {
            if(schoolMember instanceof Student) System.out.println("Student " + schoolMember.getName() + " enters Corridor");
            currentMembers[putIdx++] = schoolMember;
            if(putIdx == MAX_CAPACITY) putIdx = 0;
            currentCapacity++;
            return true;
        }
        else
        {
            System.out.println("Corridor is full");
            return false;
        }
       
    }


    @Override
    public SchoolMember exit() {
       return null;
    }


    @Override
    public void printCapacity() {
        System.out.println("Staircase current capacity is: " + Short.toString(this.getCurrentCapacity()));
    }


}
