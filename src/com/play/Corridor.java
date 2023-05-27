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
    public boolean enter(SchoolMember schoolMember) {
        if(this.currentCapacity < MAX_CAPACITY)
        {
            if(schoolMember instanceof Student) System.out.println("Student " + schoolMember.getName() + " enters SchoolYard");
            if(schoolMember instanceof Teacher) System.out.println("Teacher " + schoolMember.getName() + " enters SchoolYard");
            System.out.println(schoolMember.getName() + "enters Corridor");
            this.currentCapacity++;
        }
        return true;
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
