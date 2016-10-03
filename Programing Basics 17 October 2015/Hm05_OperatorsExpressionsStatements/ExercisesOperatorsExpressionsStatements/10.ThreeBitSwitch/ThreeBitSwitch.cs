using System;

class ThreeBitSwitch
{
    static void Main()
    {
        try
        {
            Console.Write("Enter an integer number: ");
            long number = long.Parse(Console.ReadLine());

            Console.Write("You will change the bit and next two. Enter position: ");
            int position = int.Parse(Console.ReadLine());

            long changedNumber = number ^ 7L << position;
            //7 trqbva da e long zashoto pri 59 pozicii imam 60 bitovo chislo, koeto ako vkaram v int gubq danni

            Console.WriteLine(changedNumber);
        }
        catch (Exception e)
        {
            Console.WriteLine(e.Message);
        }
    }
}

