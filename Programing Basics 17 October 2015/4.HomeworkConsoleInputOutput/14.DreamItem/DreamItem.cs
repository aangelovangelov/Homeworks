using System;

class DreamItem
{
    static void Main()
    {
        //string[] arr = new string[5]; inicializiraneto na nov masiv prazen
        string[] input = Console.ReadLine().Split('\\');

        string monthh = input[0];
        decimal money = decimal.Parse(input[1]);
        int hours = int.Parse(input[2]);
        decimal itemPrice = decimal.Parse(input[3]);

        int workDays;

        if (monthh == "Jan" || monthh == "March" || monthh == "May" || monthh == "July" ||
            monthh == "Aug" || monthh == "Oct" || monthh == "Dec")
        {
            workDays = 31 - 10;
        }
        else if (monthh == "Apr" || monthh == "June" || monthh == "Sept" || monthh == "Nov")
        {
            workDays = 30 - 10;
        }
        else
        {
            workDays = 28 - 10;
        }



        decimal heEarn = workDays * money * hours;

        if (heEarn > 700)
        {
            heEarn = heEarn + heEarn * 0.1m;
        }

        decimal canHeBay;

        if (heEarn - itemPrice >= 0)
        {
            canHeBay = heEarn - itemPrice;
            Console.WriteLine("Money left = {0:f2} leva.", canHeBay);
        }
        else
        {
            canHeBay = Math.Abs(heEarn - itemPrice);
            Console.WriteLine("Not enough money. {0:f2} leva needed.", canHeBay);
        }
    }
}

