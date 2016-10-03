using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CountLetters
{
    class CountLetters
    {
        static void Main()
        {
            string[] arr = Console.ReadLine().Split(' ');

            Array.Sort(arr);

            
            for (int i = 0; i < arr.Length; i++)
            {
                int counter = 0;

                if (i < arr.Length - 1)
                {
                    if (arr[i] == arr[i + 1])
                    {
                        continue;
                    }
                }

                for (int j = 0; j < arr.Length; j++)
                {
                    if (arr[i] == arr[j])
                    {
                        counter++;
                    }
                }
                Console.WriteLine("{0} -> {1}", arr[i], counter);
            }
        }
    }
}
