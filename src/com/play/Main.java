package com.play;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main
{
    public static void main(String[] args)
    {
        if(args.length !=4)
        {
            System.out.println("Wrong number of arguments");
            return;
        }
        
        School school = new School(Short.parseShort(args[0]), Short.parseShort(args[1]), Short.parseShort(args[2]), Short.parseShort(args[3]));
        

        File file;
        FileReader fReader;
        BufferedReader bReader;
        Student student;

        try {
            file = new File(".\\Student_data.csv");
            fReader = new FileReader(file);
            bReader = new BufferedReader(fReader);
        }
        catch (IOException e) {
            e.printStackTrace();
            return;
        }

        student = getNextStudent(bReader);
        school.enterYard(student);
        school.enterStairCase(student);








        try {
            bReader.close();
            fReader.close();
        }
        catch (IOException e) {
            e.printStackTrace();
            return;
        }

        /* 
        Teacher[] teachers = new Teacher[6];
        for(short i=0; i<6; ++i)
        {
            teachers[i] = new Teacher("Teacher_" + Integer.toString(i+1), (short)(i%3), (short) (i+1));
            teachers[i].showInfo();
        }*/
    }


    static Student getNextStudent(BufferedReader bReader)
    {
        Student student = null;
        try {
            String[] studentData = bReader.readLine().split(",", 0);
            student = new Student(studentData[0], Short.parseShort(studentData[1]), Short.parseShort(studentData[2]));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return student;
    }
}



