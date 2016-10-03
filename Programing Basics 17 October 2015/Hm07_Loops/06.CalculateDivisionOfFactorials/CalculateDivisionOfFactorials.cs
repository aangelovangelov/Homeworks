using System;

class CalculateDivisionOfFactorials
{
    static void Main()
    {
        int biggerNumber = int.Parse(Console.ReadLine());
        int smallerNumber = int.Parse(Console.ReadLine());

        double division = 0;
        double factorialBig = 1;
        double factorialSmal = 1;

        for (int i = 2; i <= biggerNumber; i++)
        {
            factorialBig *= i;

            if (i == smallerNumber)
            {
                factorialSmal = factorialBig;
            }
        }

        division = factorialBig / factorialSmal;

        Console.WriteLine(division);
    }
}

