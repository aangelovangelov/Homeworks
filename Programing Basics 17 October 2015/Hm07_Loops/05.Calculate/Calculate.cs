using System;

class Calculate
{
    static void Main()
    {
        int repeatability = int.Parse(Console.ReadLine());
        double number = double.Parse(Console.ReadLine());
        
        int factorial = 1;
        double pow = 0;
        double sum = 0;

        for (int i = 1; i <= repeatability; i++)
        {
            factorial *= i;
            pow = Math.Pow(number, i);
            sum += factorial / pow;
        }

        Console.WriteLine("{0:f5}", sum + 1);
    }
}

