using System;

class PointInsideCircleOutsideRectangle
{
    static void Main()
    {
        try
        {
            Console.Write("Enter \"x\": ");
            double x = double.Parse(Console.ReadLine());

            Console.Write("Enter \"x\": ");
            double y = double.Parse(Console.ReadLine());

            bool circle = Math.Sqrt(Math.Pow((x - 1), 2) + Math.Pow((y - 1), 2)) <= 1.5;

            bool rectangle = x > 5 || x < -1 || y < -1 || y > 1;

            bool inCircOutRec = circle && rectangle;

            Console.WriteLine(inCircOutRec);
        }
        catch (Exception e)
        {
            Console.WriteLine(e.Message);
        }
    }
}

