package com.play;

public class Teacher extends SchoolMember
{

    Teacher(String name, short floorNumber, short classNumber)
    {
        this.name = name;
        this.floorNumber = floorNumber;
        this.classNumber = classNumber;
    };

    public void showInfo()
    {
        System.out.println("Teacher " + this.name + " is teaching in class " + this.classNumber + " on floor " + this.floorNumber);
    }
   
}
