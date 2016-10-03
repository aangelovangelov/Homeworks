using System;

class TorrentPirate
{
    static void Main()
    {
        int megabytes = int.Parse(Console.ReadLine());
        int moneyWouldCost = int.Parse(Console.ReadLine());
        int moneyPerHour = int.Parse(Console.ReadLine());

        double downloadTime = (double)megabytes / 2 / 60 / 60;
        double priceForDownload = downloadTime * moneyPerHour;
        double numberOfMovies = (double)megabytes / 1500;
        double cinemaPrice = numberOfMovies * moneyWouldCost;

        if (cinemaPrice < priceForDownload)
        {
            Console.WriteLine("cinema -> {0:f2}lv", cinemaPrice);
        }
        else
        {
            Console.WriteLine("mall -> {0:f2}lv", priceForDownload);
        }

    }
}

