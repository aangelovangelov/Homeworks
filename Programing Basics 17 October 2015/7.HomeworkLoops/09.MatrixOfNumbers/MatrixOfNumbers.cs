using System;

class MatrixOfNumbers
{
    static void Main()
    {
        int n = int.Parse(Console.ReadLine());

        for (int row = 0; row < n; row++)
        {
            for (int col = 1; col <= n; col++)
            {
                Console.Write("{0} ", col + row);
            }
            Console.WriteLine();
        }
    }
}

