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
    public boolean enter(SchoolMember schoolMember) {
        if(this.currentCapacity < MAX_CAPACITY)
        {
            System.out.println(schoolMember.getName() + " enters SchoolYard");
            currentMembers[currentCapacity] = schoolMember;
            this.currentCapacity++;
            return true;
        }
        else
        {
            System.out.println("Yard is full");
            return false;
        }
    }


    @Override
    public void exit(SchoolMember schoolMember) {
    }


    @Override
    public void showInfo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'showInfo'");
    }



}
