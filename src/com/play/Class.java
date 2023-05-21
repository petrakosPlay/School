package com.play;

public class Class 
{
    private final static short MAX_CAPACITY = 30;


    private short studentCapacity;
    private Student[] students;
    private Teacher teacher;


    public Class()
    {
        studentCapacity = 0;
        students = new Student[MAX_CAPACITY];
        //teacher = new Teacher();
    }




}
