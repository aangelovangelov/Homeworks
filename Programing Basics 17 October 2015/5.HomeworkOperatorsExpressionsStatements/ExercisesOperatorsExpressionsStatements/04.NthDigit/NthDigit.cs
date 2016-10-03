using System;

class NthDigit
{
    static void Main()
    {
        try
        {
            Console.Write("Enter an integer number: ");
            int number = int.Parse(Console.ReadLine());

            Console.Write("Enter n-th digit of the number: ");
            int n = int.Parse(Console.ReadLine());

            if ((number / (int)Math.Pow(10, (n - 1))) > 0)
            {
                double nDigit = (int)(number / Math.Pow(10, (n - 1))) % 10;//Math.Pow shte mi wyrne double, no tui kato chisloto i stepenta sus sigurnost sa
                //int stoinosta shte e cqlo chislo. Problema e sled towa int/double dawa po golqmoto,t.e. double i shte imam drobna chast
                //zatowa kastwam metoda. Zakruglqneto idwa ot int. Stava s Math.Floor v double promenliwa obache!

                Console.WriteLine(nDigit);
            }
            else
            {
                Console.WriteLine("-");
            }
        }
        catch (FormatException e)
        {
            Console.WriteLine(e.Message);
        }
    }
}

