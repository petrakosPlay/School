package com.play;

public class Class extends SchoolSpace
{
    private byte classNumber;



    public Class(byte classNumber, short maxCapacity)
    {
        super(maxCapacity);
        this.classNumber = classNumber;
        System.out.println("A new Class number " + this.classNumber + 
                           " with a maximum capacity of " + this.MAX_CAPACITY + " students has been created!");
    }



    @Override
    public boolean enter(SchoolMember schoolMember) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'enter'");
    }


    @Override
    public SchoolMember exit() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'exit'");
    }



    @Override
    public void printCapacity() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'printCapacity'");
    }




}
