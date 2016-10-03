using System;

class DecimalToHexadecimal
{
    static void Main()
    {
        long number = long.Parse(Console.ReadLine());

        string hexadecimal = string.Empty;
        
        while (number / 16 != 0 || number % 16 != 0)
        {
            long remainder = number % 16;

            if (remainder < 10)
            {
                hexadecimal = remainder + hexadecimal;
            }
            else
            {
                switch (remainder)
                {
                    case 10:
                        hexadecimal = 'A' + hexadecimal;
                        break;
                    case 11:
                        hexadecimal = 'B' + hexadecimal;
                        break;
                    case 12:
                        hexadecimal = 'C' + hexadecimal;
                        break;
                    case 13:
                        hexadecimal = 'D' + hexadecimal;
                        break;
                    case 14:
                        hexadecimal = 'E' + hexadecimal;
                        break;
                    case 15:
                        hexadecimal = 'F' + hexadecimal;
                        break;
                }
            }
            number /= 16;
        }

        Console.WriteLine(hexadecimal);
    }
}

