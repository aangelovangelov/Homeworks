using System;

class BiggestOfThree
{
    static void Main()
    {
        int a = int.Parse(Console.ReadLine());
        int b = int.Parse(Console.ReadLine());
        int c = int.Parse(Console.ReadLine());

        //int bigestNumber = 0;

        //if (firstNumber > secondNumber && firstNumber > thirdNumber)
        //{
        //    bigestNumber = firstNumber;
        //}
        //else if (secondNumber > firstNumber && secondNumber > thirdNumber)
        //{
        //    bigestNumber = secondNumber;
        //}
        //else if (thirdNumber > firstNumber && thirdNumber > secondNumber)
        //{
        //    bigestNumber = thirdNumber;
        //}

        //Console.WriteLine("The bigest number is: {0}", bigestNumber);


        //if (a > b)
        //{
        //    if (b > c)
        //    {
        //        Console.WriteLine("The bigest number is: {0}", a);
        //    }
        //    else
        //    {
        //        if (a > c)
        //        {
        //            Console.WriteLine("The bigest number is: {0}", a);
        //        }
        //        else
        //        {
        //            Console.WriteLine("The bigest number is: {0}", c);
        //        }
        //    }
        //}
        //else
        //{
        //    if (a > c)
        //    {
        //        Console.WriteLine("The bigest number is: {0}", b);
        //    }
        //    else
        //    {
        //        if (b > c)
        //        {
        //            Console.WriteLine("The bigest number is: {0}", b);
        //        }
        //        else
        //        {
        //            Console.WriteLine("The bigest number is: {0}", c);
        //        }
        //    }

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

