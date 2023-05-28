package com.play;

public class Yard extends SchoolSpace
{
    public Yard(short maxCapacity)
    {
        super(maxCapacity);
        System.out.println("A new Yard with a maximum capacity of " + this.MAX_CAPACITY + " students has been created!");
    }

    @Override
    public boolean enter(SchoolMember schoolMember)
    {
        if(this.currentCapacity < MAX_CAPACITY)
        {
            if(schoolMember instanceof Student) System.out.println("Student " + schoolMember.getName() + " enters SchoolYard");
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
    public SchoolMember exit()
    {
        SchoolMember schoolMember = null;
        if(currentCapacity > 0)
        {
            System.out.println("Student " + currentMembers[getIdx].getName() + " exits SchoolYard");
            schoolMember = currentMembers[getIdx];
            currentMembers[getIdx++] = null;
            if(getIdx == MAX_CAPACITY) getIdx = 0;
            currentCapacity--;
        }
        return schoolMember;        
    }


    @Override
    public void printCapacity() {
        System.out.println("Yard current capacity is: " + Short.toString(this.getCurrentCapacity()));
    }



}
