﻿using System;

class MultiplicationSign
{
    static void Main()
    {
        double a = double.Parse(Console.ReadLine());
        double b = double.Parse(Console.ReadLine());
        double c = double.Parse(Console.ReadLine());

        //if (a > 0 && b > 0 && c > 0)
        //{
        //    Console.WriteLine('+');
        //}
        //else if ((a < 0 || b < 0 || c < 0) && ((a > 0 && b > 0) || (b > 0 && c > 0) || (a > 0 && c > 0)))
        //{
        //    Console.WriteLine('-');
        //}
        //else if ((a > 0 || b > 0 || c > 0) && ((a < 0 && b < 0) || (b < 0 && c < 0) || (a < 0 && c < 0)))
        //{
        //    Console.WriteLine('+');
        //}
        //else if (a < 0 && b < 0 && c < 0)
        //{
        //    Console.WriteLine('-');
        //}
        //else if (a == 0 || b == 0 || c == 0)
        //{
        //    Console.WriteLine('0');
        //}


        if (a > 0)
        {
            if (b > 0)
            {
                if (c > 0)
                {
                    Console.WriteLine('+');
                }
                else
                {
                    if (c == 0)
                    {
                        Console.WriteLine('0');
                    }
                    else
                    {
                        Console.WriteLine('-');
                    }
                }
            }
            else
            {
                if (b == 0)
                {
                    Console.WriteLine('0');
                }
                else
                {
                    if (c > 0)
                    {
                        Console.WriteLine('-');
                    }
                    else
                    {
                        if (c == 0)
                        {
                            Console.WriteLine('0');
                        }
                        else
                        {
                            Console.WriteLine('+');
                        }
                    }
                }
            }
        }
        else
        {
            if (a == 0)
            {
                Console.WriteLine('0');
            }
            else
            {
                if (b > 0)
                {
                    if (c > 0)
                    {
                        Console.WriteLine('-');
                    }
                    else
                    {
                        if (c == 0)
                        {
                            Console.WriteLine('0');
                        }
                        else
                        {
                            Console.WriteLine('+');
                        }
                    }
                }
                else
                {
                    if (b == 0)
                    {
                        Console.WriteLine('0');
                    }
                    else
                    {
                        if (c > 0)
                        {
                            Console.WriteLine('+');
                        }
                        else
                        {
                            if (c == 0)
                            {
                                Console.WriteLine('0');
                            }
                            else
                            {
                                Console.WriteLine('-');
                            }
                        }
                    }
                }
            }
        }
    }
}

