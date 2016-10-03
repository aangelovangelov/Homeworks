using System;

class CheckBitAtGivenPosition
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

                Console.Write("Enter the index of the bit you want to see: ");
                int index = int.Parse(Console.ReadLine());

                bool isOne = ((number & (1 << index)) >> index) == 1;

                Console.WriteLine(isOne);
            }
            catch (FormatException e)
            {
                Console.WriteLine(e.Message);
            }
        }
    }
}

