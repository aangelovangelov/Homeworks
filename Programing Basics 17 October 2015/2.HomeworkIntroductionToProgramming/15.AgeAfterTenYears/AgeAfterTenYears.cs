using System;

class AgeAfterTenYears
{
    static void Main()
    {
        Console.Write("Enter your birthday: ");

        DateTime birthday = DateTime.Parse(Console.ReadLine());
        DateTime timeNow = DateTime.Now;

        int howOld = (int)((timeNow - birthday).TotalDays / 365.242199);
        //int Years = ((DateTime.Now.Year) - BirthDay.Year);

        Console.WriteLine("Now: " + howOld);
        Console.WriteLine("After 10 years: " + (howOld + 10));
    }
}

