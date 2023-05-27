package com.play;

public class Student extends SchoolMember
{

    Student(String name, short floorNumber, short classNumber)
    {
        this.name = name;
        this.floorNumber = floorNumber;
        this.classNumber = classNumber;
    };

    public void showInfo()
    {
        System.out.println("Student " + this.name + " is studying in class " + this.classNumber + " on floor " + this.floorNumber);
    }

}
