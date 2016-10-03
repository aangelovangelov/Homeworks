using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LongestAreaInArray
{
    class LongestAreaInArray
    {
        static void Main()
        {
            int n = int.Parse(Console.ReadLine());//sushtoto raboti i za 12 zadacha

            string[] stringArray = new string[n];

            for (int i = 0; i < stringArray.Length; i++)
            {
                stringArray[i] = Console.ReadLine();
            }
            

            List<int> sequence = new List<int>();
            List<string> str = new List<string>();

            

            for (int i = 0; i < stringArray.Length; i++)
            {
                if (i < stringArray.Length - 1)
                {
                    if (stringArray[i] == stringArray[i + 1])
                    {
                        continue;
                    }
                }

                int counter = 0;

                for (int j = 0; j < stringArray.Length; j++)
                {
                    if (stringArray[i] == stringArray[j])
                    {
                        counter++;
                    }
                }
                sequence.Add(counter);
                str.Add(stringArray[i]);
            }

            int maxSequence = sequence.Max();
            string maxString = str[sequence.IndexOf(maxSequence)];

            Console.WriteLine(maxSequence);

            for (int i = 0; i < maxSequence; i++)
            {
                Console.WriteLine(maxString);
            }
        }
    }
}
