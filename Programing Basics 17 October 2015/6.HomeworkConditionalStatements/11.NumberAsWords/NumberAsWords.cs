using System;

class NumberAsWords
{
    static void Main()
    {
        int number = int.Parse(Console.ReadLine());

        int units = number % 10;
        int tenths = (number / 10) % 10;
        int hundreds = (number / 100) % 10;

        if (hundreds > 0)
        {
            switch (hundreds)
            {
                case 1:
                    if (units != 0 || tenths != 0)
                    {
                        Console.Write("One Hundred and ");
                    }
                    else
                    {
                        Console.Write("One Hundred ");
                    }
                    break;
                case 2:
                    if (units != 0 || tenths != 0)
                    {
                        Console.Write("Two Hundred and ");
                    }
                    else
                    {
                        Console.Write("Two Hundred ");
                    }
                    break;
                case 3:
                    if (units != 0 || tenths != 0)
                    {
                        Console.Write("Three Hundred and ");
                    }
                    else
                    {
                        Console.Write("Three Hundred ");
                    }
                    break;
                case 4:
                    if (units != 0 || tenths != 0)
                    {
                        Console.Write("Four Hundred and ");
                    }
                    else
                    {
                        Console.Write("Four Hundred ");
                    }
                    break;
                case 5:
                    if (units != 0 || tenths != 0)
                    {
                        Console.Write("Five Hundred and ");
                    }
                    else
                    {
                        Console.Write("Five Hundred ");
                    }
                    break;
                case 6:
                    if (units != 0 || tenths != 0)
                    {
                        Console.Write("Six Hundred and ");
                    }
                    else
                    {
                        Console.Write("Six Hundred ");
                    }
                    break;
                case 7:
                    if (units != 0 || tenths != 0)
                    {
                        Console.Write("Seven Hundred and ");
                    }
                    else
                    {
                        Console.Write("Seven Hundred ");
                    }
                    break;
                case 8:
                    if (units != 0 || tenths != 0)
                    {
                        Console.Write("Eight Hundred and ");
                    }
                    else
                    {
                        Console.Write("Eight Hundred ");
                    }
                    break;
                case 9:
                    if (units != 0 || tenths != 0)
                    {
                        Console.Write("Nine Hundred and ");
                    }
                    else
                    {
                        Console.Write("Nine Hundred ");
                    }
                    break;
            }
        }

        if (tenths == 0)
        {
            switch (units)
            {
                case 0:
                    if (hundreds == 0)
                    {
                        Console.WriteLine("Zero");
                    }
                    else
                    {
                        Console.WriteLine("");
                    }
                    break;
                case 1:
                    Console.Write("One");
                    break;
                case 2:
                    Console.Write("Two");
                    break;
                case 3:
                    Console.Write("Three");
                    break;
                case 4:
                    Console.Write("Four");
                    break;
                case 5:
                    Console.Write("Five");
                    break;
                case 6:
                    Console.Write("Six");
                    break;
                case 7:
                    Console.Write("Seven");
                    break;
                case 8:
                    Console.Write("Eight");
                    break;
                case 9:
                    Console.Write("Nine");
                    break;
            }
        }

        if (tenths == 1)
        {
            switch (units)
            {
                case 0:
                    Console.WriteLine("Ten");
                    break;
                case 1:
                    Console.Write("Eleven");
                    break;
                case 2:
                    Console.Write("Twelve");
                    break;
                case 3:
                    Console.Write("Thirteen");
                    break;
                case 4:
                    Console.Write("Fourteen");
                    break;
                case 5:
                    Console.Write("Fifteen");
                    break;
                case 6:
                    Console.Write("Sixteen");
                    break;
                case 7:
                    Console.Write("Seventeen");
                    break;
                case 8:
                    Console.Write("Eighteen");
                    break;
                case 9:
                    Console.Write("Nineteen");
                    break;
            }
        }

        if (tenths > 1)
        {
            switch (tenths)
            {
                case 2:
                    Console.Write("Twenty");
                    break;
                case 3:
                    Console.Write("Thirty");
                    break;
                case 4:
                    Console.Write("Fourty");
                    break;
                case 5:
                    Console.Write("Fifty");
                    break;
                case 6:
                    Console.Write("Sixty");
                    break;
                case 7:
                    Console.Write("Seventy");
                    break;
                case 8:
                    Console.Write("Eighty");
                    break;
                case 9:
                    Console.Write("Ninety");
                    break;
            }

            if (units > 0)
            {
                switch (units)
                {
                    case 1:
                        Console.Write(" One");
                        break;
                    case 2:
                        Console.Write(" Two");
                        break;
                    case 3:
                        Console.Write(" Three");
                        break;
                    case 4:
                        Console.Write(" Four");
                        break;
                    case 5:
                        Console.Write(" Five");
                        break;
                    case 6:
                        Console.Write(" Six");
                        break;
                    case 7:
                        Console.Write(" Seven");
                        break;
                    case 8:
                        Console.Write(" Eight");
                        break;
                    case 9:
                        Console.Write(" Nine");
                        break;
                }
            }
        }

        Console.ReadLine();
    }
}

