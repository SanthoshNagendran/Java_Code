package com.Santhosh;

import java.awt.*;
import java.lang.reflect.Array;
import java.net.SocketOption;
import java.util.Arrays;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World");
        byte age = 10;
        System.out.println(age);

        long ViewCount = 3_123_456_789L; //its just a integer with bif value
        float price = 10.99f;
        char letter = 'A';
        boolean is_Eligible = false;

        Date now = new Date(); // this is a new viable type which comes under referencing
        //now.toString();
        System.out.println(now);

        Point point1 = new Point(1,1);// this is a reference type variable where we use this for pointing other variable
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);

        String message = "Hello \"Sir\""; // Strings as usual
        System.out.println(message);
        System.out.println(message.endsWith("a"));
        System.out.println(message.replace("Sir","Lord")); // this does not change the original message "cant be mutable"

        int numbers[] = {1,2,3,4,5,7}; // this is Array
        System.out.println(numbers[2]);
        System.out.println(Array.getLength(numbers));
        System.out.println(Arrays.toString(numbers));// used to print array items as a string

        int MultiLayer[][] = {{1,2,3},{5,6,7}};
        System.out.println(Arrays.deepToString(MultiLayer));

        String x = "1";
        int y = Integer.parseInt(x) + 2;// this command is used for casting string to an integer
        System.out.println(y);

        Scanner scanner = new Scanner(System.in); // this is to get an input from the user
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.println("You are "+ name);

        int temp = 28;// this is for else if statement
        if(temp > 30) {
            System.out.println("Its a hot day");
            System.out.println("Drink Water");
        }
        else if (temp>20 && temp<= 30 )
            System.out.println("Its Beautiful day");
        else
            System.out.println("Cold day");


        String role = "admin";
        switch (role)
        {
            case "admmin":
            {
                System.out.println("you are admin");
                break;
            }
            case "moderator":
            {
                System.out.println("you are a moderator");
                break;
            }
            default:
            {
                System.out.println("you are a guest");
            }
        }


        //FizzBuzz Game
        Scanner get = new Scanner(System.in);
        System.out.print("Number: ");
        int number = get.nextInt();

        if(number % 5 == 0){
            if(number % 3 ==0)
                System.out.println("FizzBuzz");
            else
                System.out.println("Fizz");
        }
        else if(number % 3 == 0)
                System.out.println("Buzz");
        else
            System.out.println(number);


        //For loop
        for(int i=0; i<5; i++)
            System.out.println("Awesome");

        //While loop
        int i = 5;
        while(i>0)
        {
            System.out.println("Hello world" + i);
            i--;
        }
    }
}
