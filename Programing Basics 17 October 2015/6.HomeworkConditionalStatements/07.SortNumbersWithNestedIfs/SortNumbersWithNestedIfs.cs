using System;

class SortNumbersWithNestedIfs
{
    static void Main()
    {
        double a = double.Parse(Console.ReadLine());
        double b = double.Parse(Console.ReadLine());
        double c = double.Parse(Console.ReadLine());

        //if (a >= b && a >= c)
        //{
        //    if (b >= c)
        //    {
        //        Console.WriteLine("{0} {1} {2}", a, b, c);
        //        return;
        //    }
        //    if (c > b)
        //    {
        //        Console.WriteLine("{0} {1} {2}", a, c, b);
        //        return;
        //    }
        //}

        //if (b >= a && b >= c)
        //{
        //    if (a >= c)
        //    {
        //        Console.WriteLine("{0} {1} {2}", b, a, c);
        //        return;
        //    }
        //    if (c > a)
        //    {
        //        Console.WriteLine("{0} {1} {2}", b, c, a);
        //        return;
        //    }
        //}

        //if (c >= a && c >= b)
        //{
        //    if (a >= b)
        //    {
        //        Console.WriteLine("{0} {1} {2}", c, a, b);
        //        return;
        //    }
        //    if (b > a)
        //    {
        //        Console.WriteLine("{0} {1} {2}", c, b, a);
        //        return;
        //    }
        //}


        if (a > b)
        {
            if (b > c)
            {
                Console.WriteLine("{0} {1} {2}", a, b, c);
            }
            else
            {
                if (a > c)
                {
                    Console.WriteLine("{0} {1} {2}", a, c, b);
                }
                else
                {
                    Console.WriteLine("{0} {1} {2}", c, a, b);
                }
            }
        }
        else
        {
            if (a > c)
            {
                Console.WriteLine("{0} {1} {2}", b, a, c);
            }
            else
            {
                if (b > c)
                {
                    Console.WriteLine("{0} {1} {2}", b, c, a);
                }
                else
                {
                    Console.WriteLine("{0} {1} {2}", c, b, a);
                }
            }
        }
    }
}