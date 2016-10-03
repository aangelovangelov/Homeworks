using System;

class DecrypTheMessages
{
    static void Main()
    {
        string begining = Console.ReadLine();

        while (begining.ToLower() != "start")
        {
            begining = Console.ReadLine();
        }

        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;

        string decryptedMessage = String.Empty;

        while (Console.ReadLine().ToLower() != "end")
        {
            string message = Console.ReadLine();

            counter1++;
            if (message != String.Empty)
            {
                counter3++;

                List<string> messages = new List<string>();
                messages.Add(message);





            }
            counter2++;

            
        }

        if (counter1 == counter2)
        {
            Console.WriteLine("No message received.");
        }


    }
}


