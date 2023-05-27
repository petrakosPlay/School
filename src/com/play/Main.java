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
        
        
        School school = new School(Short.parseShort(args[0]), Short.parseShort(args[1]),
                                   Short.parseShort(args[2]), Short.parseShort(args[3]));

        try {
            //File file = new File(inputFileName);
            File file = new File(".\\Student_data.csv");
            FileReader fReader = new FileReader(file);
            BufferedReader bReader = new BufferedReader(fReader);
            String[] studentData;
            Student student;
            int i =0;
            for (String line = bReader.readLine(); i < 9; line=bReader.readLine())
            //for (String line = bReader.readLine(); line!=null; line=bReader.readLine())
            {
                studentData = line.split(",", 0);
                student = new Student(studentData[0], Short.parseShort(studentData[1]), Short.parseShort(studentData[2]));
                student.showInfo();
                school.enter(student);
                ++i;
            }
            bReader.close();
            fReader.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        Teacher[] teachers = new Teacher[6];
        for(short i=0; i<6; ++i)
        {
            teachers[i] = new Teacher("Teacher_" + Integer.toString(i+1), (short)(i%3), (short) (i+1));
            teachers[i].showInfo();
        }
    }

    void openFile(String inputFileName)
    {
        
    }
}



