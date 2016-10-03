using System;

class BitDestroyer
{
    static void Main()
    {
        try
        {
            Console.Write("Enter an integer number: ");
            int number = int.Parse(Console.ReadLine());

            Console.Write("Enter the position of the bit you want to set to \"0\": ");
            int position = int.Parse(Console.ReadLine());

            int ñumberWithChangedBit = number & (~(1 << position));

            Console.WriteLine(ñumberWithChangedBit);
        }
        catch (Exception e)
        {
            Console.WriteLine(e.Message);
        }
    }
}

