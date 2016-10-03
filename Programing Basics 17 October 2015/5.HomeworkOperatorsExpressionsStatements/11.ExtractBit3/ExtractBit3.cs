using System;

class ExtractBit3
{
    static void Main()
    {
        try
        {
            Console.Write("Enter an integer number: ");
            uint num = uint.Parse(Console.ReadLine());

            Console.WriteLine(Convert.ToString(num, 2).PadLeft(16, '0'));

            uint bitAtPosition2 = (num & (1 << 3)) >> 3;

            Console.WriteLine(bitAtPosition2);
        }
        catch (Exception e)
        {
            Console.WriteLine(e.Message);
        }
    }
}