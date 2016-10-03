using System;

class LastDigit
{
    static void Main()
    {
        Console.Write("Enter an integer number: ");

        int number = 0;

        bool parse = int.TryParse(Console.ReadLine(), out number);

        if (parse)
        {
            int lastDigit = number % 10;

            Console.WriteLine("The last digit is: {0}", lastDigit);
        }
        else
        {
            Console.WriteLine("Enter valid number!");
        }

        //try
        //{
        //    Console.Write("Enter an integer number: ");
        //    int number = int.Parse(Console.ReadLine());

        //    int lastDigit = number % 10;

        //    Console.WriteLine("The last digit is: {0}", lastDigit);
        //}
        //catch (FormatException e)
        //{
        //    Console.WriteLine(e.Message);
        //}




    }
}

