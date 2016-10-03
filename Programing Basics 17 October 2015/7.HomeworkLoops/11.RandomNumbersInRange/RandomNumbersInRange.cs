using System;

class RandomNumbersInRange
{
    static void Main()
    {
        int n = int.Parse(Console.ReadLine());
        int min = int.Parse(Console.ReadLine());
        int max = int.Parse(Console.ReadLine());

        Random randomIndex = new Random();
        int randomNumber = 0;

        for (int i = 0; i < n; i++)
        {
            randomNumber = randomIndex.Next(min, max + 1);

            Console.Write("{0} ", randomNumber);
        }
    }
}