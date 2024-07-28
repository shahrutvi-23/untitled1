package ex1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class labex147
{
    public static void main(String[] args)
    {
//Infosys automation interview question
        //Question : find max from array

        int [] salary= {7,25,5,78,10,3};
        int max =1;
        for(int i=0;i<salary.length;i++)
        {
            if(salary[i]>max)
            {
                max = salary[i];
            }
        }
        System.out.println(("Max salary is: "+max));

//sort array and find max using function
        //Arrays.sort(salary);
      //  System.out.println("max salary is:"+ salary[]);

    }
}
