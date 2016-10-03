using System;

class GravitationOnTheMoon
{
    static void Main()
    {
        try
        {
            Console.Write("Enter your weight: ");
            double weightOnEarth = double.Parse(Console.ReadLine());

            double weightOnMoon = weightOnEarth * 0.17;

            Console.WriteLine("On the Moon your weghth will be: {0}", weightOnMoon);
        }
        catch (Exception e)
        {
            Console.WriteLine(e.Message);
        }
    }
}

