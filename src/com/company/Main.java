package com.company;
import java.util.Scanner;//for scaning from keyboard

public class Main {

    static void Greeting(){
        String greeting = "Ahoj";
        System.out.println(greeting);
    }
    static void ClosingProgram(){
        System.out.println("Close by pressing enter");
        Scanner keyboard = new Scanner(System.in);
        if( keyboard.next() == "close" )
        System.exit(0);
    }
    public static boolean Calculation(int x, int y, int z){
        //System.out.println("Je trojuholnik rovnostranny?");
        boolean triangle_result;
        triangle_result = x + y > z && x + z > y && z + y > x;
            System.out.println(triangle_result);
            return(triangle_result);
    }
    public static void main(String[] args) {
        Greeting();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter lenght of the first side");
        int triangleFirstSideLenght = keyboard.nextInt();
        System.out.println("Enter lenght of the second side");
        int triangleSecondSideLenght = keyboard.nextInt();
        System.out.println("Enter lenght of the third side");
        int triangleThirdSideLenght = keyboard.nextInt();
        Calculation(triangleFirstSideLenght,triangleSecondSideLenght, triangleThirdSideLenght);
        ClosingProgram();
    }
}
