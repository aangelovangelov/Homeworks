using System;

class Rectangles
{
    static void Main()
    {
        try
        {
            Console.Write("Enter width: ");
            double width = double.Parse(Console.ReadLine());

            Console.Write("Enter height: ");
            double height = double.Parse(Console.ReadLine());

            double perimetur = 2 * ( width + height );

            double area = width * height;

            Console.WriteLine("Perimetur: {0}\nArea: {1}", perimetur, area);
        }
        catch (Exception e)
        {
            Console.WriteLine(e.Message);
        }
    }
}

