using System;

class SignOfProduct
{
    static void Main()
    {
        double firstNum = double.Parse(Console.ReadLine());
        double secondNum = double.Parse(Console.ReadLine());
        double thirdNum = double.Parse(Console.ReadLine());

        bool isFirstNegative = firstNum < 0;
        bool isSecondNegative = secondNum < 0;
        bool isThirdNegative = thirdNum < 0;

        string product = "Negative";

        if (isFirstNegative || isSecondNegative || isThirdNegative)
        {
            if (isFirstNegative && isSecondNegative || isSecondNegative && isThirdNegative || isFirstNegative && isThirdNegative)
            {
                if (isFirstNegative && isSecondNegative && isThirdNegative)
                {
                    Console.WriteLine(product);
                }
                else
                {
                    product = "Positive";
                    Console.WriteLine(product);
                }
                
            }
            else
            {
                Console.WriteLine(product);
            }
        }
        else
        {
            product = "Positive";
            Console.WriteLine(product);
        }
    }
}

