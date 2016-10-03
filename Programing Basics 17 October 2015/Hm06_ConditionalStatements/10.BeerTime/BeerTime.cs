using System;
using System.Globalization;

class BeerTime
{
    static void Main()
    {
        CultureInfo enUS = new CultureInfo("en-US");

        DateTime startTime = DateTime.Parse("1:00 PM");
        DateTime endTime = DateTime.Parse("3:00 AM");

        DateTime time;
        bool parsed = DateTime.TryParseExact(Console.ReadLine(), "h:mm tt", enUS, DateTimeStyles.None, out time);

        if (parsed)
        {
            if (time >= startTime || time < endTime)
            {
                Console.WriteLine("beer time");
            }
            else
            {
                Console.WriteLine("non-beer time");
            }
        }
        else
        {
            Console.WriteLine("invalid time");
        }
        
    }
}

