using System;

class CheckPlayCard
{
    static void Main()
    {
        string playCard = Console.ReadLine();

        if (playCard == "2" || playCard == "3" || playCard == "4" || playCard == "5" || playCard == "6" || playCard == "7"
            || playCard == "8" || playCard == "9" || playCard == "10" || playCard == "J" || playCard == "Q" || playCard == "K" 
            || playCard == "A")
        {
            Console.WriteLine("yes");
        }
        else
        {
            Console.WriteLine("no");
        }
    }
}

