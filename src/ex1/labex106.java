package ex1;

import java.sql.SQLOutput;

public class labex106
{
    public static void main(String[] args)
    {
        //21-7-2024
        //f=orloop

        for (int i=10;i>=1;i--)
        {
            System.out.println("Hi" +i);
            my();  //call 1
        }
            my();  // call2

    }
    //create function
    static void my()
    {
        System.out.println("This is my function");
    }

}
