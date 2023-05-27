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
    public boolean enter(SchoolMember schoolMember)
    {
        if(this.currentCapacity < MAX_CAPACITY)
        {
            if(schoolMember instanceof Student) System.out.println("Student " + schoolMember.getName() + " enters StairCase");
            if(schoolMember instanceof Teacher) System.out.println("Teacher " + schoolMember.getName() + " enters StairCase");
            currentMembers[currentCapacity++] = schoolMember;
            return true;
        }
        else
        {
            System.out.println("StairCase is full");
            return false;
        }
    }


    @Override
    public boolean exit() {
       return true;
    }

    @Override
    public void showInfo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'showInfo'");
    }

}
