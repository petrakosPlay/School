package com.play;

public class Student extends SchoolMember
{

    Student(String name, short floorNumber, short classNumber)
    {
        this.name = name;
        this.floorNumber = floorNumber;
        this.classNumber = classNumber;
    };

    void print()
    {
        System.out.println("Student " + this.name + " is in class " + this.classNumber + " on floor " + this.floorNumber);
    }
    
    

}
