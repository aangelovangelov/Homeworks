using System;

class MagicWand
{
    static void Main()
    {
        int n = int.Parse(Console.ReadLine());

        Console.WriteLine("{0}*{0}", new string('.', n + n / 2 + 1));

        int line1 = n / 2 + 2;

        for (int i = 0; i < line1; i++)
        {
            Console.WriteLine("{0}*{1}*{0}", new string('.', n + n / 2 - i), new string('.', i + i + 1));
        }

        Console.WriteLine("{0}{1}{0}", new string('*', n), new string('.', n + 2));

        int line2 = n / 2;

        for (int i = 0; i < line2; i++)
        {
            Console.WriteLine("{0}*{1}*{0}", new string('.', i + 1), new string('.', n * 3 - 2 - i - i));
        }

        int line3 = n / 2;

        for (int i = 0; i < line3; i++)
        {
            Console.WriteLine("{0}*{1}*{2}*{3}*{2}*{1}*{0}", new string('.', n / 2 - 1 - i), new string('.', n / 2),
                new string('.', i), new string('.', n));
        }

        Console.WriteLine("{0}{1}*{2}*{1}{0}", new string('*', n / 2 + 1), new string('.', n / 2), new string('.', n));

        for (int i = 0; i < n; i++)
        {
            Console.WriteLine("{0}*{0}*{0}", new string('.', n));
        }

        Console.WriteLine("{0}{1}{0}", new string('.', n), new string('*', n + 2));
    }
}

