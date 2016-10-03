using System;

class PthBit
{
    static void Main()
    {
        try
        {
            Console.Write("Enter an integer number: ");
            int inputNumber = int.Parse(Console.ReadLine());
            
            Console.Write("Enter the position of the bit you want to see: ");
            int position = int.Parse(Console.ReadLine());
            
            int bit = (inputNumber & 1 << position) >> position;
            
            Console.WriteLine(bit);
        }
        catch (Exception e)
        {
            Console.WriteLine(e.Message);
        }
    }
}

