using System;

class BitsExchange
{
    static void Main()
    {
        checked
        {
            try
            {
                Console.Write("Enter an unsigned integer number: ");
                uint number = uint.Parse(Console.ReadLine());

                Console.WriteLine(Convert.ToString(number, 2).PadLeft(32, '0'));

                uint bit3 = (number & 1 << 3) >> 3;
                uint bit4 = (number & 1 << 4) >> 4;
                uint bit5 = (number & 1 << 5) >> 5;

                uint bit24 = (number & 1 << 24) >> 24;
                uint bit25 = (number & 1 << 25) >> 25;
                uint bit26 = (number & 1 << 26) >> 26;

                long change24To3 = 0;
                long change25To4 = 0;
                long change26To5 = 0;
                long change3To24 = 0;
                long change4To25 = 0;
                long change5To26 = 0;

                if (bit3 == 0)
                {
                    change24To3 = number & ~(1L << 24);
                }
                else if (bit3 == 1)
                {
                    change24To3 = number | bit3 << 24;
                }

                if (bit4 == 0)
                {
                    change25To4 = change24To3 & ~(1L << 25);
                }
                else if (bit4 == 1)
                {
                    change25To4 = change24To3 | bit4 << 25;
                }

                if (bit5 == 0)
                {
                    change26To5 = change25To4 & ~(1L << 26);
                }
                else if (bit5 == 1)
                {
                    change26To5 = change25To4 | bit5 << 26;
                }

                if (bit24 == 0)
                {
                    change3To24 = change26To5 & ~(1L << 3);
                }
                else if (bit24 == 1)
                {
                    change3To24 = change26To5 | bit24 << 3;
                }

                if (bit25 == 0)
                {
                    change4To25 = change3To24 & ~(1L << 4);
                }
                else if (bit25 == 1)
                {
                    change4To25 = change3To24 | bit25 << 4;
                }

                if (bit26 == 0)
                {
                    change5To26 = change4To25 & ~(1L << 5);
                }
                else if (bit26 == 1)
                {
                    change5To26 = change4To25 | bit26 << 5;
                }

                Console.WriteLine(Convert.ToString(change5To26, 2).PadLeft(32, '0'));
                Console.WriteLine(change5To26);
            }
            catch (FormatException e)
            {
                Console.WriteLine(e.Message);
            }
        }
    }
}

