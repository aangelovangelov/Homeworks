using System;

class IntDoubleString
{
    static void Main()
    {
        Console.WriteLine("Please choose a type: ");
        Console.WriteLine("1 --> int");
        Console.WriteLine("2 --> double");
        Console.WriteLine("3 --> string");

        int choose = int.Parse(Console.ReadLine());

        switch (choose)
        {
            case 1:
                Console.WriteLine("Please enter an integer: ");
                int input1 = int.Parse(Console.ReadLine());
                Console.WriteLine(input1 + 1);
                break;
            case 2:
                Console.WriteLine("Please enter a double: ");
                double input2 = double.Parse(Console.ReadLine());
                Console.WriteLine(input2 + 1);
                break;
            case 3:
                Console.WriteLine("Please enter a string: ");
                string input3 = Console.ReadLine();
                Console.WriteLine(input3 + '*');
                break;
            default:
                Console.WriteLine("Enter valid choose!");
                break;
        }

    }
}

