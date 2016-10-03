using System;

class EmployeeData
{
    static void Main()
    {
        string firstName = "Amanda";
        string lastName = "Jonson";
        byte age = 27;
        char gender = 'f';
        long personalID = 8306112507;
        int uniqueEmployee = 27563571;

        Console.WriteLine(@"First name: {0}
Last Name: {1}
Age: {2}
Gender: {3}
Personal ID: {4}
Unique Employee number: {5}", firstName, lastName, age, gender, personalID,uniqueEmployee);
    }
}

