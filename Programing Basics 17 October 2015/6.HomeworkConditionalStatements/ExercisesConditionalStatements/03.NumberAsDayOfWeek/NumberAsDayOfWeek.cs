using System;

class NumberAsDayOfWeek
{
    static void Main()
    {
        int numberOfWeek = 0;
        bool canBeParsed = int.TryParse(Console.ReadLine(), out numberOfWeek);

        while (!canBeParsed)
        {
            Console.WriteLine("Enter valid number: ");
            canBeParsed = int.TryParse(Console.ReadLine(), out numberOfWeek);
        }

        switch (numberOfWeek)
        {
            case 1:
                Console.WriteLine("Mondey");
                break;
            case 2:
                Console.WriteLine("Tuesday");
                break;
            case 3:
                Console.WriteLine("Wensday");
                break;
            case 4:
                Console.WriteLine("Thursday");
                break;
            case 5:
                Console.WriteLine("Friday");
                break;
            case 6:
                Console.WriteLine("Saturday");
                break;
            case 7:
                Console.WriteLine("Sunday");
                break;
            default:
                Console.WriteLine("not valid");
                break;
        }
    }
}

