using System;

class SomeFibonacciPrimes
{
    static void Main()
    {
        int first = 0;
        int second = 1;
        int third = 0;
        int n = 3;

        Console.WriteLine("1." + first);
        Console.WriteLine("2." + second);
        
        for (int i = 0; i < 20; i++)
        {
            third = first + second;

            if (third == 89 || third == 547 || third == 1597)
            {
                Console.Write("----->");
            }

            Console.WriteLine("{0}." + third, n++);
           
            first = second;
            second = third;
        }
    }
}
