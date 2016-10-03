using System;

class ExtractBitFromInteger
{
    static void Main()
    {
        checked
        {
            try
            {
                Console.Write("Enter an integer number: ");
                int number = int.Parse(Console.ReadLine());

                Console.WriteLine(Convert.ToString(number, 2).PadLeft(16, '0'));

                Console.Write("Enter the position of the bit you want to see: ");
                int position = int.Parse(Console.ReadLine());

                int bitAtPosition = (number & 1 << position) >> position;

                Console.WriteLine(bitAtPosition);
            }
            catch (FormatException e)
            {
                Console.WriteLine(e.Message);
            }
        }
    }
}
