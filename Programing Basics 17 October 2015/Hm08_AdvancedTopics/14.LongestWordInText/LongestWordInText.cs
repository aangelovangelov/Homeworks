using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LongestWordInText
{
    class LongestWordInText
    {
        static void Main()
        {
            string[] strArr = Console.ReadLine().Split(new char[] { ' ', '.' }, StringSplitOptions.RemoveEmptyEntries);

            string longestWord = strArr[0];

            for (int i = 0; i < strArr.Length; i++)
            {
                if (strArr[i].Length > longestWord.Length)
                {
                    longestWord = strArr[i];
                }
            }
            
            Console.WriteLine(longestWord); 
        }
    }
}
