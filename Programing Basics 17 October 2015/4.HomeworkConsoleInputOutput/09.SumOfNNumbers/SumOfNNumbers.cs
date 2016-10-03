using System;

class SumOfNNumbers
{
    static void Main()
    {
        Console.WriteLine("Enter how many you want numbers: ");

        string line = null;

        double number = 0;
        double sum = 0;

        while ((line = Console.ReadLine()) != null)
        {
            if (double.TryParse(line, out number))
            {
                sum += number;
            }
            else
            {
                Console.WriteLine("The sum of the numbers is: {0}", sum);
                break;
            }
            
        }
    }
}

