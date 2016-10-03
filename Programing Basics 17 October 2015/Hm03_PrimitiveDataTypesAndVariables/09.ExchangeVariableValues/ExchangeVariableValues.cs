using System;

class ExchangeVariableValues
{
    static void Main()
    {
        int a = 5;
        int b = 10;
        Console.WriteLine("Before:\na = {0}\nb = {1}", a, b);
        
        //First way is by using third variable.
        //int c = a;
        //a = b;
        //b = c;
        //Console.WriteLine("After:\na = {0}\nb = {1}", a, b);


        //Second way is without third variable.
        a = a + b;
        b = a - b;
        a = a - b;
        Console.WriteLine("After:\na = {0}\nb = {1}", a, b);


    }
}

