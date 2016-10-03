using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PrimesGivenRange
{
    class PrimesGivenRange
    {
        static List<long> FindPrimesInRange(long startNUm, long endNum)
        {
            List<long> primeNumbers = new List<long>();

            for (long number = startNUm; number <= endNum; number++)
            {
                bool isPrime = true;

                for (int i = 2; i <= Math.Sqrt(number); i++)
                {
                    if (number % i == 0)
                    {
                        isPrime = false;
                        break;
                    }
                }

                if (number <= 1)
                {
                    isPrime = false;
                }

                if (isPrime)
                {
                    primeNumbers.Add(number);
                }
            }

            return primeNumbers;
        }

        static void PrintIntegerList(List<long> numbers)
        {
            string str = string.Join(", ", numbers);

            Console.WriteLine(str);
        }

        static void Main()
        {
            long start = long.Parse(Console.ReadLine());
            long end = long.Parse(Console.ReadLine());

            //List<long> listIntegers = FindPrimesInRange(start, end);

            PrintIntegerList(FindPrimesInRange(start, end));
        }
    }
}
