using System;

class PrintCompanyInformation
{
    static void Main()
    {
        Console.Write("{0,-25}", "Company name:");
        string companyName = Console.ReadLine();

        Console.Write("{0,-25}", "Company address:");
        string companyAddress = Console.ReadLine();

        Console.Write("{0,-25}", "Phone number:");
        string phoneNumber = Console.ReadLine();

        Console.Write("{0,-25}", "Fax number:");
        string faxNumber = Console.ReadLine();

        Console.Write("{0,-25}", "Web site:");
        string webSite = Console.ReadLine();

        Console.Write("{0,-25}", "Manager first name:");
        string managerFirstName = Console.ReadLine();

        Console.Write("{0,-25}", "Manager last name:");
        string managerLastName = Console.ReadLine();

        Console.Write("{0,-25}", "Manager age:");
        string managerAge = Console.ReadLine();

        Console.Write("{0,-25}", "Manager phone:");
        string managerPhone = Console.ReadLine();
    }
}

