using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

class Integers
{
    static void Main()
    {
        int[] array = new int[10];

        Random rnd = new Random();

        int sumRandomNumbers = 0;

        for (int i = 0; i < array.Length; i++)
        {
            int randomNumber = rnd.Next(0, 101);
            sumRandomNumbers += randomNumber;

            Console.Write("{0,5}", randomNumber);

            array[i] = sumRandomNumbers;
        }

        Console.WriteLine();

        foreach (int number in array)
        {
            Console.Write("{0,5}", number);
        }

        Console.ReadLine();
    }
}

