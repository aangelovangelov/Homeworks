using System;

class Program
{
    static void Main()
    {
        int max = int.Parse(Console.ReadLine());
        int min = int.Parse(Console.ReadLine());

        if (min > max)
        {
            max = min + max;
            min = min - max;
            max = min - max;
        }

        int remainder = max % min;

        if (remainder == 0)
        {
            Console.WriteLine(min);
        }
        else
        {
            while (remainder > 0)
            {
                max = min;
                min = remainder;
                
                remainder = max % min;
            }

            Console.WriteLine(min);
        }
    }
}

