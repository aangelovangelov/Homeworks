using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PrimeChecker
{
    class PrimeChecker
    {
        static bool IsPrime(long integerNumber)
        {
            bool prime = true;

            for (int i = 2; i <= Math.Sqrt(integerNumber); i++)
            {
                if (integerNumber % i == 0)
                {
                    prime = false;
                    break;
                }
            }

            if (integerNumber <= 1)
            {
                prime = false;
            }

            return prime;
        }

        static void Main()
        {
            long number = long.Parse(Console.ReadLine());

            Console.WriteLine(IsPrime(number));
        }
    }
}
