using System;

class FormattingNumbers
{
    static void Main()
    {
        Console.Write("Enter \"a\": ");
        int num1 = int.Parse(Console.ReadLine());

        Console.Write("Enter \"b\": ");
        double num2 = double.Parse(Console.ReadLine());

        Console.Write("Enter \"c\": ");
        double num3 = double.Parse(Console.ReadLine());

        Console.WriteLine("|{0,-10:X}|{1}|{2,10:#0.##}|{3,-10:F3}|", num1, Convert.ToString(num1, 2).PadLeft(10, '0'), num2, num3);
    }
}

