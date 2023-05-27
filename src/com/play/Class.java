package com.play;

public class Class extends SchoolSpace
{
    private final short MAX_CAPACITY;
    private short currentCapacity;
    private SchoolMember[] currentMembers;
    private byte classNumber;



    public Class(byte classNumber, short maxCapacity)
    {
        this.MAX_CAPACITY = maxCapacity;
        this.currentCapacity = 0;
        this.classNumber = classNumber;
        currentMembers = new SchoolMember[MAX_CAPACITY];
        System.out.println("A new Class number " + this.classNumber + 
                           " with a maximum capacity of " + this.MAX_CAPACITY + " students has been created!");
    }



    @Override
    public boolean enter(SchoolMember schoolMember) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'enter'");
    }



    @Override
    public void exit(SchoolMember schoolMember) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'exit'");
    }



    @Override
    public void showInfo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'showInfo'");
    }




}
