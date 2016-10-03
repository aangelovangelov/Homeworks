using System;

class BitExchangeAdvanced
{
    static void Main()
    {
        uint number = uint.Parse(Console.ReadLine());
        int firstStartPosition = int.Parse(Console.ReadLine());
        int secondStartPosition = int.Parse(Console.ReadLine());
        int lenghtOfBits = int.Parse(Console.ReadLine());

        bool overLapping = Math.Abs(firstStartPosition - secondStartPosition) <= lenghtOfBits 
            && firstStartPosition >= 0 && secondStartPosition >= 0 
            && firstStartPosition <= 31 && secondStartPosition <= 31;

        bool outOfRange = (firstStartPosition + lenghtOfBits - 1 > 31) || (secondStartPosition + lenghtOfBits - 1 > 31);

        if (overLapping)
        {
            Console.WriteLine("overlapping");
        }

        if (outOfRange)
        {
            Console.WriteLine("out of range");
        }

        if (!overLapping && !outOfRange)
        {
            string mask = new string('1', lenghtOfBits);
            uint maskUint = Convert.ToUInt32(mask, 2);

            uint firstCoupleOfBits = (number & (maskUint << firstStartPosition)) >> firstStartPosition;
            uint secondCoupleOfBits = (number & (maskUint << secondStartPosition)) >> secondStartPosition;
            
            number &= ~(maskUint << firstStartPosition);
            number &= ~(maskUint << secondStartPosition);
            
            number |= firstCoupleOfBits << secondStartPosition;
            number |= secondCoupleOfBits << firstStartPosition;

            Console.WriteLine(number);
        }
    }
}

