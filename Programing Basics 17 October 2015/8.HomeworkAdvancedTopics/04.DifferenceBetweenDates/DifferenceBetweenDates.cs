using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Globalization;
using System.Threading;

namespace DifferenceBetweenDates
{
    class DifferenceBetweenDates
    {
        static double DaysBetweenDates(DateTime dateNow, DateTime dateBefore)
        {
            TimeSpan daysWithHHMMSS = dateNow - dateBefore;

            double daysOnly = daysWithHHMMSS.TotalDays;

            return daysOnly;
            //return daysOnly.ToString("%d");
        }


        static void Main()
        {
            //Console.OutputEncoding = Encoding.UTF8;
            //CultureInfo enUS = new CultureInfo("en-US");
            //Thread.CurrentThread.CurrentCulture = CultureInfo.InvariantCulture;

            DateTime before = DateTime.ParseExact(Console.ReadLine(), "d.MM.yyyy", null);
            DateTime now = DateTime.ParseExact(Console.ReadLine(), "d.MM.yyyy", null);

            double days = DaysBetweenDates(now, before);

            Console.WriteLine(days);
        }
    }
}
