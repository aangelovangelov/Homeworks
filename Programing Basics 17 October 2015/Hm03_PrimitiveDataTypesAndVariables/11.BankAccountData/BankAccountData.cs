using System;

class BankAccountData
{
    static void Main()
    {
        string firstName = "Pesho";
        string middleName = "Peshev";
        string lastName = "Peshev";

        decimal amountOfMoney = 21.232423454353535443m;

        string bankName = "\"ОББ\"";
        string IBAN = "BGSTS432472947293783294";

        long creditCardNumber1 = 1273777733339999;
        long creditCardNumber2 = 1111222233334444;
        long creditCardNumber3 = 4444222233335555;

        Console.WriteLine(
@"First Name:                {0}
Middle Name:               {1}
Last Name:                 {2}
Amount of money:           {3}
Bank Name:                 {4}
IBAN:                      {5}
First credit card number:  {6}
Second credit card number: {7}
Third credit card number:  {8}", firstName, middleName, lastName, amountOfMoney, bankName, IBAN, 
creditCardNumber1, creditCardNumber2, creditCardNumber3);
    }
}

