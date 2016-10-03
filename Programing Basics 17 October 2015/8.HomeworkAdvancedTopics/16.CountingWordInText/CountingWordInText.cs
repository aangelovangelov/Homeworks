using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CountingWordInText
{
    class CountingWordInText
    {
        static void Main()
        {
            string parametur = Console.ReadLine().ToLower();

            string[] input = Console.ReadLine().Split(
                new char[] { ' ', '.', ',', '/', '+', ':', '@', '!', '"', '(', ')', }, StringSplitOptions.RemoveEmptyEntries);

            int counter = 0;

            for (int i = 0; i < input.Length; i++)
            {
                bool isEqual = input[i].ToLower() == parametur;

                if (isEqual)
                {
                    counter++;
                }
            }

            Console.WriteLine(counter);
        }
    }
}
