using System;

class PointInACircle
{
    static void Main()
    {
        try
        {
            Console.Write("Enter \"x\": ");
            double x = double.Parse(Console.ReadLine());
            
            Console.Write("Enter \"x\": ");
            double y = double.Parse(Console.ReadLine());

            bool isInside = Math.Sqrt(Math.Pow(x, 2) + Math.Pow(y, 2)) <= 2;

            Console.WriteLine(isInside);
        }
        catch (Exception e)
        {
            Console.WriteLine(e.Message);
        }
    }
}

