using System;

class ZeroSubset
{
    static void Main()
    {
        string[] arr = Console.ReadLine().Split(' ');

        int num1 = int.Parse(arr[0]);
        int num2 = int.Parse(arr[1]);
        int num3 = int.Parse(arr[2]);
        int num4 = int.Parse(arr[3]);
        int num5 = int.Parse(arr[4]);

        if (num1 + num2 == 0)
            Console.WriteLine("{0} + {1} = {2}", num1, num2, num1 + num2);
        if (num1 + num3 == 0)
            Console.WriteLine("{0} + {1} = {2}", num1, num3, num1 + num3);
        if (num1 + num4 == 0)
            Console.WriteLine("{0} + {1} = {2}", num1, num4, num1 + num4);
        if (num1 + num5 == 0)
            Console.WriteLine("{0} + {1} = {2}", num1, num5, num1 + num5);
        if (num2 + num3 == 0)
            Console.WriteLine("{0} + {1} = {2}", num2, num3, num1 + num3);
        if (num2 + num4 == 0)
            Console.WriteLine("{0} + {1} = {2}", num2, num4, num1 + num4);
        if (num2 + num5 == 0)
            Console.WriteLine("{0} + {1} = {2}", num2, num5, num1 + num5);
        if (num3 + num4 == 0)
            Console.WriteLine("{0} + {1} = {2}", num3, num4, num1 + num4);
        if (num3 + num5 == 0)
            Console.WriteLine("{0} + {1} = {2}", num3, num5, num1 + num5);
        if (num4 + num5 == 0)
            Console.WriteLine("{0} + {1} = {2}", num4, num5, num1 + num5);
        if ((num1 + num2 + num3) == 0)
            Console.WriteLine("{0} + {1} + {2} = {3}", num1, num2, num3, num1 + num2 + num3);
        if ((num1 + num3 + num4) == 0)
            Console.WriteLine("{0} + {1} + {2} = {3}", num1, num3, num4, num1 + num3 + num4);
        if ((num1 + num3 + num5) == 0)
            Console.WriteLine("{0} + {1} + {2} = {3}", num1, num3, num5, num1 + num3 + num5);
        if ((num1 + num4 + num5) == 0)
            Console.WriteLine("{0} + {1} + {2} = {3}", num1, num4, num5, num1 + num4 + num5);
        if ((num2 + num3 + num4) == 0)
            Console.WriteLine("{0} + {1} + {2} = {3}", num2, num3, num4, num2 + num3 + num4);
        if ((num2 + num4 + num5) == 0)
            Console.WriteLine("{0} + {1} + {2} = {3}", num2, num4, num5, num2 + num4 + num5);
        if ((num3 + num4 + num5) == 0)
            Console.WriteLine("{0} + {1} + {2} = {3}", num3, num4, num5, num3 + num4 + num5);
        if ((num1 + num2 + num4) == 0)
            Console.WriteLine("{0} + {1} + {2} = {3}", num1, num2, num4, num1 + num2 + num4);
        if ((num1 + num2 + num5) == 0)
            Console.WriteLine("{0} + {1} + {2} = {3}", num1, num2, num5, num1 + num2 + num5);
        if ((num2 + num3 + num5) == 0)
            Console.WriteLine("{0} + {1} + {2} = {3}", num2, num3, num5, num2 + num3 + num5);
        if ((num1 + num2 + num3 + num4) == 0)
            Console.WriteLine("{0} + {1} + {2} + {3} = {4}", num1, num2, num3, num4, num1 + num2 + num3 + num4);
        if ((num1 + num2 + num3 + num5) == 0)
            Console.WriteLine("{0} + {1} + {2} + {3} = {4}", num1, num2, num3, num5, num1 + num2 + num3 + num5);
        if ((num2 + num3 + num4 + num5) == 0)
            Console.WriteLine("{0} + {1} + {2} + {3} = {4}", num2, num3, num4, num5, num2 + num3 + num4 + num5);
        if ((num1 + num3 + num4 + num5) == 0)
            Console.WriteLine("{0} + {1} + {2} + {3} = {4}", num1, num3, num4, num5, num1 + num3 + num4 + num5);
        if ((num1 + num2 + num4 + num5) == 0)
            Console.WriteLine("{0} + {1} + {2} + {3} = {4}", num1, num2, num4, num5, num1 + num2 + num4 + num5);
        if ((num1 + num2 + num4 + num5) == 0)
            Console.WriteLine("{0} + {1} + {2} + {3} + {4} = {5}", num1, num2, num3, num4, num5, num1 + num2 + num3 + num4 + num5);
        else
            Console.WriteLine("no zero subset");
    }
}