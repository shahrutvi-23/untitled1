package ex1;

import java.util.Scanner;

public class labex136 {

    public static void main(String[] args)
    {
        //Arrays
        int[] Marks_10_board = {90,30,68,89,58};
        String weekDays[] = {"Sunday","Monday","Tuesday","Wednesday"};
        char Vovel[] ={'a','e','i','o','u'};

        System.out.println("Your marks are :"+Marks_10_board[0]);
        System.out.println("Your marks are :"+Marks_10_board[1]);
        System.out.println("Your marks are :"+Marks_10_board[2]);
        System.out.println("Your marks are :"+Marks_10_board[3]);
        System.out.println("Your marks are :"+Marks_10_board[4]);
//arrays in for loop
        for (int i = 0; i < weekDays.length; i++)
        {
            System.out.println("days are"+weekDays[i]);
        }
        //lenghth of array

        int[] marks = new int[3];

        //index will be 0 to 2
        //array length is 3

        //final and constant these words are equal in java

        Scanner s= new Scanner(System.in);
        float[] m =new float[3];

        System.out.println("marks of sub 1 is " );
        m[0]= s.nextFloat();
        System.out.println("marks of sub 2 is " );
        m[1]= s.nextFloat();
        System.out.println("marks of sub 3 is " );
        m[2]= s.nextFloat();

        s.close();

    }
}
