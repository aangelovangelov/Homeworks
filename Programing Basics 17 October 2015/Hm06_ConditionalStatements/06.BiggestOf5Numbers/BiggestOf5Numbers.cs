using System;

class BiggestOf5Numbers
{
    static void Main()
    {
        double a = double.Parse(Console.ReadLine());
        double b = double.Parse(Console.ReadLine());
        double c = double.Parse(Console.ReadLine());
        double d = double.Parse(Console.ReadLine());
        double e = double.Parse(Console.ReadLine());

        //if (first >= second && first >= third && first >= fourth && first >= fifth)
        //{
        //    Console.WriteLine(first);
        //}
        //else if (second >= first && second >= third && second >= fourth && second >= fifth)
        //{
        //    Console.WriteLine(second);
        //}
        //else if (third >= first && third >= second && third >= fourth && third >= fifth)
        //{
        //    Console.WriteLine(third);
        //}
        //else if (fourth >= first && fourth >= second && fourth >= third && fourth >= fifth)
        //{
        //    Console.WriteLine(fourth);
        //}
        //else if (fifth >= first && fifth >= second && fifth >= third && fifth >= fourth)
        //{
        //    Console.WriteLine(fifth);
        //}

        if (a > b)
        {
            if (a > c)
            {
                if (a > d)
                {
                    if (a > e)
                    {
                        Console.WriteLine(a);
                    }
                    else
                    {
                        Console.WriteLine(e);
                    }
                }
                else
                {
                    if (d > e)
                    {
                        Console.WriteLine(d);
                    }
                    else
                    {
                        Console.WriteLine(e);
                    }
                }
            }
            else
            {
                if (c > d)
                {
                    if (c > e)
                    {
                        Console.WriteLine(c);
                    }
                    else
                    {
                        Console.WriteLine(e);
                    }
                }
                else
                {
                    if (d > e)
                    {
                        Console.WriteLine(d);
                    }
                    else
                    {
                        Console.WriteLine(e);
                    }
                }
            }
        }
        else
        {
            if (b > c)
            {
                if (b > d)
                {
                    if (b > e)
                    {
                        Console.WriteLine(b);
                    }
                    else
                    {
                        Console.WriteLine(e);
                    }
                }
                else
                {
                    if (d > e)
                    {
                        Console.WriteLine(d);
                    }
                    else
                    {
                        Console.WriteLine(e);
                    }
                }
            }
            else
            {
                if (c > d)
                {
                    if (c > e)
                    {
                        Console.WriteLine(c);
                    }
                    else
                    {
                        Console.WriteLine(e);
                    }
                }
                else
                {
                    if (d > e)
                    {
                        Console.WriteLine(d);
                    }
                    else
                    {
                        Console.WriteLine(e);
                    }
                }
            }
        }
    }
}

