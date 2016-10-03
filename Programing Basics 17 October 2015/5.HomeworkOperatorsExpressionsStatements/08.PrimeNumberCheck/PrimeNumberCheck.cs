using System;

class PrimeNumberCheck
{
    static void Main()
    {
        try
        {
            Console.Write("Enter a positive integer number: ");
            int number = int.Parse(Console.ReadLine());

            bool isPrime = true;

            if (number <= 1)
            {
                isPrime = false;
            }

            for (int i = 2; i <= Math.Sqrt(number); i++)
            {
                if (number % i == 0)
                {
                    isPrime = false;
                }
            }

            Console.WriteLine(isPrime);
        }
        catch (Exception e)
        {
            Console.WriteLine(e.Message);
        }
    }
}

