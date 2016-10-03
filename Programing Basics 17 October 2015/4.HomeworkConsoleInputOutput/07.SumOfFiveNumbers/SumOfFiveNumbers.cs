using System;

class SumOfFiveNumbers
{
    static void Main()
    {
        Console.Write("Enter 5 numbers separated by spase: ");
        string[] input = Console.ReadLine().Split(' ');

        //double num1 = double.Parse(input[0]);
        //double num2 = double.Parse(input[1]);
        //double num3 = double.Parse(input[2]);
        //double num4 = double.Parse(input[3]);
        //double num5 = double.Parse(input[4]);

        //Console.WriteLine(num1 + num2 + num3 + num4 + num5);

        double sum = 0;

        for (int i = 0; i < input.Length; i++)
        {
            sum += double.Parse(input[i]);
        }

        Console.WriteLine(sum);
    }
}

