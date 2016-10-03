using System;

class SequenseOfNumbers
{
    static void Main()
    {
        int negativeNumbers = -1;

        for (int i = 2; i <= 10; i += 2)
        {
            Console.Write(i + ",");

            negativeNumbers += -2;
            Console.Write(negativeNumbers + ",");
        }

        Console.WriteLine();

        int positive = 0;
        int negative = -1;

        while (positive < 10)
        {
            positive += 2;
            negative += -2;

            Console.Write("{0},{1},", positive, negative);
        }
    }
}


