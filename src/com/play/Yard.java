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


    @Override
    public boolean enter(SchoolMember schoolMember)
    {
        if(this.currentCapacity < MAX_CAPACITY)
        {
            if(schoolMember instanceof Student) System.out.println("Student " + schoolMember.getName() + " enters SchoolYard");
            if(schoolMember instanceof Teacher) System.out.println("Teacher " + schoolMember.getName() + " enters SchoolYard");
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
    public void exit(SchoolMember schoolMember) {
        
    }


    @Override
    public void showInfo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'showInfo'");
    }



}
