using System;

class IsoscelesTriangle
{
    static void Main()
    {
        Console.OutputEncoding = System.Text.Encoding.Unicode;

        char copyright = '\u00A9';

        Console.WriteLine("{0}{1}", new string(' ', 3), new string(copyright, 1));

        Console.WriteLine("{0}{1}{2}{1}", new string(' ', 2), new string(copyright, 1), new string(' ', 1));

        Console.WriteLine("{0}{1}{2}{1}", new string(' ', 1), new string(copyright, 1), new string(' ', 3));

        Console.WriteLine("{0}{1}{0}{1}{0}{1}{0}", new string(copyright, 1), new string(' ', 1));

    }
}

