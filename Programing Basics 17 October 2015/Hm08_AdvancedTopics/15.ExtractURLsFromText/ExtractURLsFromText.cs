using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ExtractURLsFromText
{
    class ExtractURLsFromText
    {
        static void Main()
        {
            string[] input = Console.ReadLine().Split(' ');

            List<string> results = new List<string>();

            for (int i = 0; i < input.Length; i++)
            {
                string word = input[i];

                bool isUrlAdres = word.IndexOf("http://") != -1 || word.IndexOf("www.") != -1;

                if (isUrlAdres)
                {
                    results.Add(word);
                    //results[i] = word;
                }
            }

            foreach (var item in results)
            {
                Console.WriteLine(item);
            }
        }
    }
}
