using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

class Program
{
    static double Power(double number, double power)
    {
        double pow = Math.Pow(number, power);

        return pow;
    }

    static double Power(double number, double power, bool roundDown)
    {
        double pow = Math.Pow(number, power);

        if (roundDown)
        {
            pow = Math.Floor(pow);
            return pow;
        }
        else
        {
            return pow;
        }

    }

    static void Main()
    {
        double num = double.Parse(Console.ReadLine());
        double pow = double.Parse(Console.ReadLine());

        double numOfPower = Power(num, pow, true);

        Console.WriteLine(numOfPower);
    }
}

