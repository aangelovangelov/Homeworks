using System;

class CirclePerimeterAndArea
{
    static void Main()
    {
        Console.Write("Enter the radius: ");
        double radius = double.Parse(Console.ReadLine());

        double perimeter = 2 * Math.PI * radius;

        double area = Math.Pow((Math.PI * radius), 2);

        Console.WriteLine("The perimeter is equal to: {0:F2}", perimeter);
        Console.WriteLine("The area is equal to: {0:F2}", area);


    }
}

