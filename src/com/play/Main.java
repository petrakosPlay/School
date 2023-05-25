package com.play;


public class Main
{
    public static void main(String[] args) {
        //byte i = 1;
        //for(String s : args)
        //    System.out.println("Argument " + i + ": " + s);
        if(args.length !=2)
        {
            System.out.println("Wrong number of arguments");
            return;
        }
        
        School school = new School(Short.parseShort(args[0]), Short.parseShort(args[1]));
    }
}



