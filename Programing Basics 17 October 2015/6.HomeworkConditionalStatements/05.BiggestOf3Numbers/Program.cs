using System;

    class BiggestOf3Numbers
{
    static void Main()
    {
        double a = double.Parse(Console.ReadLine());
        double b = double.Parse(Console.ReadLine());
        double c = double.Parse(Console.ReadLine());

        //if (firstNum >= secondNum && firstNum >= thirdNum)
        //{
        //    Console.WriteLine(firstNum);
        //}
        //else if (secondNum >= firstNum && secondNum >= thirdNum)
        //{
        //    Console.WriteLine(secondNum);
        //}
        //else if (thirdNum >= firstNum && thirdNum >= secondNum)
        //{
        //    Console.WriteLine(thirdNum);
        //}


        if (a > b)
        {
            if (a > c)
            {
                Console.WriteLine("The bigest number is: {0}", a);
            }
            else
            {
                Console.WriteLine("The bigest number is: {0}", c);
            }
        }
        else
        {
            if (b > c)
            {
                Console.WriteLine("The bigest number is: {0}", b);
            }
            else
            {
                Console.WriteLine("The bigest number is: {0}", c);
            }
        }
    }
}


