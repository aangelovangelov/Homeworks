using System;

class RandomizeNumbers1ToN
{
    static void Main()
    {
        int n = int.Parse(Console.ReadLine());
        
        int[] array = new int[n];
        //inicializirane na masiwa
        for (int i = 0; i < array.Length; i++)
        {
            array[i] = i + 1;
        }

        Console.WriteLine(String.Join(" ", array));

        Random index = new Random();
        //razburkwane na masiva chrez ramenqne na stoinostite na indexite na masiwa!
        //dori rondamIndexa da mi e vinagi edin i susht, shte se poluchi 5 1 2 3 4
        for (int j = 0; j < array.Length; j++)
        {
            int randomIndex = index.Next(0, n);
            int valueHolderRandomIndex = array[randomIndex];
            array[randomIndex] = array[j];
            array[j] = valueHolderRandomIndex;
        }
        Console.WriteLine(String.Join(" ", array));
    }
}