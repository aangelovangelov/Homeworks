using System;

class SomePrimes
{
    static void Main()
    {
        int line = 1;
        bool prime;

        for (int i = 2; i < 1900; i++)
        {
            prime = true;

            if (i > 2)
            {
                if (i % 2 == 0)
                {
                    prime = false;
                }
                else
                {
                    int n = 3;

                    while (n <= Math.Sqrt(i))
                    {
                        if (i % n == 0)
                        {
                            prime = false;
                        }

                        n += 2;
                    }
                }
            }

            if (prime)
            {
                Console.WriteLine("{0} number is: " + i, line++);

                if (line == 24 || line == 101 || line == 251)
                {
                    Console.Write("----->");
                }
            }
        }
    }
}

