package com.play;

public class Yard extends SchoolSpace
{
    
    private final short MAX_CAPACITY;
    private SchoolMember[] currentMembers;
    private short currentCapacity;
    private short getIdx;
    private short putIdx;

    public Yard(short maxCapacity)
    {
        this.MAX_CAPACITY = maxCapacity;
        currentCapacity = getIdx = putIdx = 0;
        currentMembers = new SchoolMember[MAX_CAPACITY];
        System.out.println("A new Yard with a maximum capacity of " + this.MAX_CAPACITY + " students has been created!");
    }

    public short getCurrentCapacity(){return this.currentCapacity;};
    public boolean isFull() {return currentCapacity == MAX_CAPACITY ? true : false;};
    public void printCapacity() {System.out.println("Yard current capacity is: " + Short.toString(this.getCurrentCapacity()));}

    @Override
    public boolean enter(SchoolMember schoolMember)
    {
        if(this.currentCapacity < MAX_CAPACITY)
        {
            if(schoolMember instanceof Student) System.out.println("Student " + schoolMember.getName() + " enters SchoolYard");
            //if(schoolMember instanceof Teacher) System.out.println("Teacher " + schoolMember.getName() + " enters SchoolYard");
            currentMembers[putIdx++] = schoolMember;
            if(putIdx == MAX_CAPACITY) putIdx = 0;
            currentCapacity++;
            return true;
        }
        else
        {
            System.out.println("Yard is full");
            return false;
        }
    }


    @Override
    public boolean exit() {
        if(currentCapacity > 0)
        {
            System.out.println("Student " + currentMembers[getIdx].getName() + " exits SchoolYard");
            currentMembers[getIdx++] = null;
            if(getIdx == MAX_CAPACITY) getIdx = 0;
            currentCapacity--;
            return true;
        }
        return false;

        
    }


    @Override
    public void showInfo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'showInfo'");
    }



}
