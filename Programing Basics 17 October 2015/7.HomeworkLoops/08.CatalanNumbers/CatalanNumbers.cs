using System;

class CatalanNumbers
{
    static void Main()
    {
        double n = double.Parse(Console.ReadLine());

        double nMultiply2Factorial = 1; ;
        double nFactorial = 1;
        double nPlus1Factorial = 1; ;

        for (int i = 2; i <= 2 * n; i++)
        {
            nMultiply2Factorial *= i;

            if (i == n)
            {
                nFactorial = nMultiply2Factorial;
            }

            if (i == (n + 1))
            {
                nPlus1Factorial = nMultiply2Factorial;
            }
        }

        double catalanSequence = nMultiply2Factorial / (nPlus1Factorial * nFactorial);

        Console.WriteLine(catalanSequence);
    }
}

