package com.play;

public class Corridor extends SchoolSpace
{
    private final short MAX_CAPACITY;
    private short currentCapacity;
    private SchoolMember[] currentMembers;
    private short getIdx;
    private short putIdx;


    public Corridor(short maxCapacity)
    {
        this.MAX_CAPACITY = maxCapacity;
        currentCapacity = getIdx = putIdx = 0;
        currentMembers = new SchoolMember[MAX_CAPACITY];
        System.out.println("A new Corridor with a maximum capacity of " + this.MAX_CAPACITY + " students has been created!");
    }

    public short getCurrentCapacity(){return this.currentCapacity;};
    public boolean isFull() {return currentCapacity == MAX_CAPACITY ? true : false;};
    public boolean isEmpty() {return currentCapacity == 0 ? true : false;};
    public void printCapacity() {System.out.println("Staircase current capacity is: " + Short.toString(this.getCurrentCapacity()));}


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
    public void showInfo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'showInfo'");
    }    
}
