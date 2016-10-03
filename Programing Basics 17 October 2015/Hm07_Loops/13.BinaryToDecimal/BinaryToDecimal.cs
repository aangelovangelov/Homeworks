using System;

class BinaryToDecimal
{
    static void Main()
    {
        string binary = Console.ReadLine();

        int position = binary.Length;

        long sum = 0;

        for (int i = 0; i < binary.Length; i++)
        {
            long bit = (long)Char.GetNumericValue(binary[position - 1 - i]);
            sum += bit * (long)Math.Pow(2, i);
        }
        
        Console.WriteLine(sum);
    }
}

