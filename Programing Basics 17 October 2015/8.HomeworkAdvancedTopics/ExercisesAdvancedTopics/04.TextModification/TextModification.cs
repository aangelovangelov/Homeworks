using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

class TextModification
{
    static void Main()
    {
        string input = Console.ReadLine();

        for (int i = 0; i < input.Length; i++)
        {
            char letter = input[i];

            if (letter % 3 == 0)
            {
                input = input.Replace(letter, Char.ToUpper(letter));
            }
        }

        Console.WriteLine(input);
    }
}

