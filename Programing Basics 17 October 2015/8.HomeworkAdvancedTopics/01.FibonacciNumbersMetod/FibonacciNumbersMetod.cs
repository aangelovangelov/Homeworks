using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FibonacciNumbersMetod
{
    class FibonacciNumbersMetod
    {
        static int Fib(int position)
        {
            //https://en.wikipedia.org/wiki/Fibonacci_number

            int sumAndFirstNumber = 0;
            int secondNumber = 1;

            for (int i = 0; i < position; i++)
            {
                if (i == 0)
                {
                    continue;
                }
                sumAndFirstNumber += secondNumber;
                secondNumber = sumAndFirstNumber - secondNumber;
            }
            return sumAndFirstNumber;
        }

        static void Main()
        {
            int fibonacciSequencePosition = int.Parse(Console.ReadLine());

            Console.WriteLine(Fib(fibonacciSequencePosition));
        }
    }
}
