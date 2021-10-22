package com.blp.combinedprogram;
import java.text.MessageFormat;
import java.util.Scanner;

public class CombinedProgram
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        /*
        System.out.print("Enter 1 for Factorial");
        System.out.print("Enter 2 for Fibonacci Series");
        System.out.print("Enter 3 for palindrome");
        System.out.print("Enter 1, 2 or 3");
        int which = s.nextInt();
        */

        System.out.print("Enter the number: ");
        int num = s.nextInt();

        CombinedProgram obj1 = new CombinedProgram();
        obj1.factorial(num);
        obj1.palindrome(num);
        obj1.fibonacci(num);

		/*
		switch (which)
		{

			case obj1.factorial();
			{

			}

			case obj1.palindrome();
			{
				System.out.print("Enter the number: ");
			}

		}
		*/
    }

    void factorial(int num)
    {
        int fact=1;

        for(int i=1; i<=num; i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial is: "+fact);
    }

    void palindrome(int num)
    {
        int r,sum=0,temp;
        temp = num;

        while(num>0)
        {
            r = num % 10;
            sum = (sum * 10) + r;
            num = num / 10;
        }
        if(temp==sum)
            System.out.println(MessageFormat.format("{0} is a Palindrome number", +temp));
        else
            System.out.println(MessageFormat.format("{0} is not Palindrome number", +temp));
    }

    void fibonacci(int num)
    {

        int n1=0,n2=1,n3,i;
        System.out.println("Fibonacci Series");
        System.out.print(n1+" "+n2);

        for(i=2;i<num;++i)
        {
            n3 = n1 + n2;
            System.out.print(" "+n3);
            n1 = n2;
            n2 = n3;
        }
        System.out.println();
    }
}
