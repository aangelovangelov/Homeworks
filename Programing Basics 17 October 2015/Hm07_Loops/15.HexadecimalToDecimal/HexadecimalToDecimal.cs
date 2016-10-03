using System;

class HexadecimalToDecimal
{
    static void Main()
    {
        string hexadecimal = Console.ReadLine().ToUpper();

        int position = hexadecimal.Length;

        long decimalRepresentation = 0;

        for (int i = 0; i < position; i++)
        {
            char charakterLastIndex = hexadecimal[position - 1 - i];

            int numbers = 0;

            if (charakterLastIndex == 'A' || charakterLastIndex == 'B' || charakterLastIndex == 'C' ||
                charakterLastIndex == 'D' || charakterLastIndex == 'E' || charakterLastIndex == 'F')
            {
                switch (charakterLastIndex)
                {
                    case 'A':
                        numbers = (charakterLastIndex - 55);
                        break;
                    case 'B':
                        numbers = (charakterLastIndex - 55);
                        break;
                    case 'C':
                        numbers = (charakterLastIndex - 55);
                        break;
                    case 'D':
                        numbers = (charakterLastIndex - 55);
                        break;
                    case 'E':
                        numbers = (charakterLastIndex - 55);
                        break;
                    case 'F':
                        numbers = (charakterLastIndex - 55);
                        break;
                }

                decimalRepresentation += numbers * (long)Math.Pow(16, i);
            }
            else
            {
                long numberLastIndex = (long)Char.GetNumericValue(charakterLastIndex);

                decimalRepresentation += numberLastIndex * (long)Math.Pow(16, i);
            }
        }

        Console.WriteLine(decimalRepresentation);
    }
}

