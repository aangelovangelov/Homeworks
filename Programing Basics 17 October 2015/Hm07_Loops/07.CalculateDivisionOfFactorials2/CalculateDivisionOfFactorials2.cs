using System;

class CalculateDivisionOfFactorials2
{
    static void Main()
    {
        double n = double.Parse(Console.ReadLine());
        double k = double.Parse(Console.ReadLine());
        double nMinusK = n - k;

        double nFactorial = 1;
        double kFactorial = 1;
        double nMinusKFactorial = 1;

        for (int i = 2; i <= n; i++)
        {
            nFactorial *= i;

            if (k == i)
            {
                kFactorial = nFactorial;
            }

            if (nMinusK == i)
            {
                nMinusKFactorial = nFactorial;
            }
        }

        double outPut = nFactorial / (kFactorial * nMinusKFactorial);

        Console.WriteLine(outPut);
    }
}

