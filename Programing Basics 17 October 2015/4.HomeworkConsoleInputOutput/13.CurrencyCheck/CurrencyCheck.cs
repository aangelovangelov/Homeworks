using System;

class CurrencyCheck
{
    static void Main()
    {
        uint rubles = uint.Parse(Console.ReadLine());
        uint dollars = uint.Parse(Console.ReadLine());
        uint euro = uint.Parse(Console.ReadLine());
        uint levaOfer = uint.Parse(Console.ReadLine());
        uint levaWithoutOfet = uint.Parse(Console.ReadLine());

        double rublesInLeva = (double)rubles / 100 * 3.5;
        double dollarsInLeva = dollars * 1.5;
        double euroInLeva = euro * 1.95;
        double ofer = levaOfer / 2d;

        double[] arr = new double[5];
        arr[0] = rublesInLeva;
        arr[1] = dollarsInLeva;
        arr[2] = euroInLeva;
        arr[3] = ofer;
        arr[4] = levaWithoutOfet;
        Array.Sort(arr);
        //Array.Reverse(arr);
        Console.WriteLine("{0:f2}", arr[0]);

    }
}

