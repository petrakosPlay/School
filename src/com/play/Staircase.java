package com.play;

public class Staircase extends SchoolSpace
{
    
    public Staircase(short maxCapacity)
    {
        super(maxCapacity);
        System.out.println("A new Staircase with a maximum capacity of " + this.MAX_CAPACITY + " students has been created!");
    }

    @Override
    public boolean enter(SchoolMember schoolMember)
    {
        if(this.currentCapacity < MAX_CAPACITY)
        {
            if(schoolMember instanceof Student) System.out.println("Student " + schoolMember.getName() + " enters StairCase");
            currentMembers[putIdx++] = schoolMember;
            if(putIdx == MAX_CAPACITY) putIdx = 0;
            currentCapacity++;
            return true;
        }
        else
        {
            System.out.println("StairCase is full");
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
        System.out.println("Staircase current capacity is: " + Short.toString(this.getCurrentCapacity()));
    }

}
