using System;

class LeastCommonMultiple
{
    public static int findLCM(int a, int b) //method for finding LCM with parameters a and b
    {
        int num1, num2;                         //taking input from user by using num1 and num2 variables
        if (a > b)
        {
            num1 = a; num2 = b;
        }
        else
        {
            num1 = b; num2 = a;
        }

        for (int i = 1; i <= num2; i++)
        {
            if ((num1 * i) % num2 == 0)
            {
                return i * num1;
            }
        }
        return num2;
    }

    static void Main()
    {
        int num1, num2;
        Console.WriteLine("Enter 2 numbers on different lines to find LCM");
        num1 = int.Parse(Console.ReadLine());
        num2 = int.Parse(Console.ReadLine());
        int LCMresult = findLCM(num1, num2); //ing user input value to method using num1 and num2 variable

        Console.WriteLine("LCM of {0} and {1} is {2}", num1, num2, LCMresult);
        Console.Read();

    }

}

