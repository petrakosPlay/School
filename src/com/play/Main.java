package com.play;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main
{
    public static void main(String[] args) {
        //byte i = 1;
        //for(String s : args)
        //    System.out.println("Argument " + i + ": " + s);
        if(args.length !=4)
        {
            System.out.println("Wrong number of arguments");
            return;
        }
        
        School school = new School(Short.parseShort(args[0]), Short.parseShort(args[1]), Short.parseShort(args[2]), Short.parseShort(args[3]));


        //String inputFileName = args[4];
        try {
            //File file = new File(inputFileName);
            File file = new File("C:\\Users\\petrakos\\Downloads\\MOCK_DATA.csv");
            FileReader fReader = new FileReader(file);
            BufferedReader bReader = new BufferedReader(fReader);
            String[] studentData;
            Student student;
            for (String line = bReader.readLine(); line!=null; line=bReader.readLine())
            {
                studentData = line.split(",", 0);
                student = new Student(studentData[0], Short.parseShort(studentData[1]), Short.parseShort(studentData[2]));
                student.print();
            }
            bReader.close();
            fReader.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}



