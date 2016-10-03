using System;
using System.Text;

class PrintTheASCIITable
{
    static void Main()
    {
        char a = 'a';
        int b = a;
        Console.WriteLine(b);

        int c = 97;
        char f = (char)c;
        Console.WriteLine(f);

        Console.WriteLine((char)0x61);

        Console.WriteLine("\n\n");


        Console.OutputEncoding = Encoding.Unicode;

        for (int i = 0; i <= 255; i++)
        {
            Console.WriteLine("{0} --> {1}", i, (char)i);
            //char k = (char)i;
            //Console.WriteLine(k);
        }
    }
}

