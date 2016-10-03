using System;

class PrintDeck52Cards
{
    static void Main()
    {
        for (int row = 0; row < 13; row++)
        {
            for (int col = 5; col > 1; col--)
            {
                if (col == 2)
                {
                    col = 6;
                }

                switch (row)
                {
                    case 0:
                        Console.Write("{0}{1} ", 2, (char)col);
                        break;
                    case 1:
                        Console.Write("{0}{1} ", 3, (char)col);
                        break;
                    case 2:
                        Console.Write("{0}{1} ", 4, (char)col);
                        break;
                    case 3:
                        Console.Write("{0}{1} ", 5, (char)col);
                        break;
                    case 4:
                        Console.Write("{0}{1} ", 6, (char)col);
                        break;
                    case 5:
                        Console.Write("{0}{1} ", 7, (char)col);
                        break;
                    case 6:
                        Console.Write("{0}{1} ", 8, (char)col);
                        break;
                    case 7:
                        Console.Write("{0}{1} ", 9, (char)col);
                        break;
                    case 8:
                        Console.Write("{0}{1} ", 10, (char)col);
                        break;
                    case 9:
                        Console.Write("{0}{1} ", 'J', (char)col);
                        break;
                    case 10:
                        Console.Write("{0}{1} ", 'Q', (char)col);
                        break;
                    case 11:
                        Console.Write("{0}{1} ", 'K', (char)col);
                        break;
                    case 12:
                        Console.Write("{0}{1} ", 'A', (char)col);
                        break;
                    default:
                        Console.Write("Invalid input!");
                        break;
                }
                if (col == 6)
                {
                    break;
                }
            }
            Console.WriteLine();
        }
    }
}

