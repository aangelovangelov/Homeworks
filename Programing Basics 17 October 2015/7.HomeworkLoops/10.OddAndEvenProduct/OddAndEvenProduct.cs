using System;

class OddAndEvenProduct
{
    static void Main()
    {
        string[] array = Console.ReadLine().Split(' ');

        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < array.Length; i++)
        {
            int number = int.Parse(array[i]);


            if ((i + 1) % 2 == 0)
            {
                sumEven += number;
            }
            else
            {
                sumOdd += number;
            }
        }
        //Prowerqwa koi sa odd i koi ne!!! Ne vzima poziciite odd i even!!!
        //foreach (string numbers in array)
        //{
        //    int number = int.Parse(numbers);

        //    if (number % 2 == 0)
        //    {
        //        sumEven += number;
        //    }
        //    else
        //    {
        //        sumOdd += number;
        //    }
        //}

        if (sumOdd == sumEven)
        {
            Console.WriteLine("yes\nproduct = {0}", sumEven);
        }
        else
        {
            Console.WriteLine("no\nodd_nproduct = {0}\neven_nproduct = {1}", sumOdd, sumEven);
        }
    }
}