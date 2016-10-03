using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MatrixOfPalindromes
{
    class MatrixOfPalindromes
    {
        static void Main()
        {
            string[] input = Console.ReadLine().Split(' ');
            int r = int.Parse(input[0]);
            int c = int.Parse(input[1]);
            
            for (int row = 0; row < r; row++)
            {
                for (int col = 0; col < c; col++)
                {
                    Console.Write("{0}{1}{2} ", (char)('a' + row), (char)('a' + col + row), (char)('a' + row));
                }
                Console.WriteLine();
            }
        }
    }
}
