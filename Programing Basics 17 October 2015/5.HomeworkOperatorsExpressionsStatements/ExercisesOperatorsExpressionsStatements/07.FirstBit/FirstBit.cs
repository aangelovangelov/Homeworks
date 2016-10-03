using System;

class FirstBit
{
    static void Main()
    {
        //Firts way: Premestvam edenicata pod bita koito tyrsq i sled tova premestwam poluchenoto bitovo chislo
        //vednuj na dqsno, za da vurna bita na 0 poziciq. Printiram.

        //try
        //{
        //    Console.Write("Enter an integer number: ");
        //    int inputNumber = int.Parse(Console.ReadLine());

        //    int result = (inputNumber & (1 << 1)) >> 1;

        //    Console.WriteLine(result);
        //}
        //catch (Exception e)
        //{
        //    Console.WriteLine(e.Message);
        //}

        //Second way: mestq bitowete na inputa vednuj na dqsno, za da otide turseniq bit na 0 poziciq. & 1 i printiram.
        try
        {
            Console.Write("Enter an integer number: ");
            int inputNumber = int.Parse(Console.ReadLine());

            int bitAtPosition1 = inputNumber >> 1 & 1;

            Console.WriteLine(bitAtPosition1);
        }
        catch (Exception e)
        {
            Console.WriteLine(e.Message);
        }
    }
}

