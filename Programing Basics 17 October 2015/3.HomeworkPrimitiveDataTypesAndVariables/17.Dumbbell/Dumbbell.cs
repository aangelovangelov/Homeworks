using System;

class Dumbbell
{
    static void Main()
    {
        int lines = int.Parse(Console.ReadLine());

        Console.WriteLine("{0}{1}{2}{1}{0}",
            new string('.', lines / 2),
            new string('&', lines / 2 + 1),
            new string('.', lines));

        int midleLines = lines / 2 - 1;

        for (int i = 0; i < midleLines; i++)
        {
            Console.WriteLine("{0}&{1}&{2}&{1}&{0}",
                new string('.', lines / 2 - 1 - i),
                new string('*', lines / 2 + i),
                new string('.', lines));
        }

        Console.WriteLine("&{0}&{1}&{0}&",
            new string('*', lines - 2),
            new string('=', lines));

        for (int i = 0; i < midleLines; i++)
        {
            Console.WriteLine("{0}&{1}&{2}&{1}&{0}",
                new string('.', +1 + i),
                new string('*', lines - 3 - i),
                new string('.', lines));
        }

        Console.WriteLine("{0}{1}{2}{1}{0}",
            new string('.', lines / 2),
            new string('&', lines / 2 + 1),
            new string('.', lines));
    }
}

