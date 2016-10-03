using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace RemoveNames
{
    class RemoveNames
    {
        static List<string> RemoveRepeatableInLists(List<string> returnedList, List<string> comparingList)
        {
            for (int i = 0; i < returnedList.Count; i++)
            {
                for (int j = 0; j < comparingList.Count; j++)
                {
                    if (returnedList[i] == comparingList[j])
                    {
                        returnedList.RemoveAt(i);

                        if (i > 0)
                        {
                            i--;
                        }
                        j = 0;
                    }
                }
            }

            return returnedList;
        }

        static void Main()
        {
            //string[] input1 = Console.ReadLine().Split(' ');
            //string[] input2 = Console.ReadLine().Split(' ');

            List<string> names1 = new List<string>(Console.ReadLine().Split(' '));
            List<string> names2 = new List<string>(Console.ReadLine().Split(' '));

            RemoveRepeatableInLists(names1, names2);

            foreach (string name in names1)
            {
                Console.Write("{0} ", name);
            }
            Console.WriteLine();
        }
    }
}
