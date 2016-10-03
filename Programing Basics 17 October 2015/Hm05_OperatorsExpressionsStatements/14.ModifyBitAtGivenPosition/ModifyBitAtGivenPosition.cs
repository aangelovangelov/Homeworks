using System;

class ModifyBitAtGivenPosition
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

                Console.Write("Enter the index of the bit you want to change: ");
                int index = int.Parse(Console.ReadLine());

                Console.Write("Enter the value you want to change to: ");
                int value = int.Parse(Console.ReadLine());

                int numWithBit1 = number | (1 << index);

                int numWithBit0 = number & ~(1 << index);

                if (value == 0)
                {
                    Console.WriteLine(Convert.ToString(numWithBit0, 2).PadLeft(16, '0'));
                    Console.WriteLine(numWithBit0);
                }
                else if (value == 1)
                {
                    Console.WriteLine(Convert.ToString(numWithBit1, 2).PadLeft(16, '0'));
                    Console.WriteLine(numWithBit1);
                }
            }
            catch (FormatException e)
            {
                Console.WriteLine(e.Message);
            }
        }
    }
}

