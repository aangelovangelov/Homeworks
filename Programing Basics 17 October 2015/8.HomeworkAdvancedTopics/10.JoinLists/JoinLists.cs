using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace JoinLists
{
    class JoinLists
    {
        static void Main()
        {
            //string[] input1 = Console.ReadLine().Split(' ');
            //string[] input2 = Console.ReadLine().Split(' ');

            List<int> sequence1 = Console.ReadLine().Split(' ').Select(int.Parse).ToList();
            List<int> sequence2 = Console.ReadLine().Split(' ').Select(int.Parse).ToList();

            //sequence1 = sequence1.Distinct().ToList();premahva powtarqshtite se w edin list
            //sequence2 = sequence2.Distinct().ToList();

            List<int> list = sequence1.Union(sequence2).ToList();

            list.Sort();

            foreach (int number in list)
            {
                Console.Write("{0} ", number);
            }

            //int[] arr = new int[] { 5, 4, 3, 2, 1 };
            //List<int> list = new List<int>() { 5, 4, 3, 2, 1 };

            ////arr.sort
            //Array.Sort(arr);

            //list.Sort();
        }
    }
}
