using System;

class MinMaxSumAverageOfNNumbers
{
    static void Main()
    {
        //int nLines = int.Parse(Console.ReadLine());

        //int max = 1;
        //int min = 1;
        //int sum = 0;
        //double avarage = 1;

        //for (int i = 0; i < nLines; i++)
        //{
        //    int number = int.Parse(Console.ReadLine());

        //    if (number > max)
        //    {
        //        max = number;
        //    }

        //    if (number < min)
        //    {
        //        min = number;
        //    }

        //    sum += number;
        //}

        //avarage = (double)sum / nLines;

        //Console.WriteLine("min = {0}", min);

        //Console.WriteLine("max = {0}", max);

        //Console.WriteLine("sum = {0}", sum);

        //Console.WriteLine("avg = {0:f2}", avarage);

        //nz kolko chisla shte ni vuvedat!!!
        int max = 1;
        int min = 1;
        int sum = 0;
        double avarage = 1;
        int counter = 0;

        string loop = Console.ReadLine();
        while (loop != string.Empty)
        {
            int number = int.Parse(loop);

            if (number > max)
            {
                max = number;
            }

            if (number < min)
            {
                min = number;
            }

            sum += number;

            counter++;

            loop = Console.ReadLine();
        }

        avarage = (double)sum / counter;

        Console.WriteLine("min = {0}", min);
        Console.WriteLine("max = {0}", max);
        Console.WriteLine("sum = {0}", sum);
        Console.WriteLine("avg = {0:f2}", avarage);
    }
}
