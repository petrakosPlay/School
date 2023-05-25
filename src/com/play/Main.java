package com.play;


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
    }
}



