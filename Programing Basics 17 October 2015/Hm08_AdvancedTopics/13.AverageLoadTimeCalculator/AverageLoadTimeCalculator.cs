using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AverageLoadTimeCalculator
{
    class AverageLoadTimeCalculator
    {
        static void Main()
        {
            string input = Console.ReadLine();

            Dictionary<string, double> dictionary = new Dictionary<string, double>();
            Dictionary<string, int> newDictionary = new Dictionary<string, int>();

            while (input != string.Empty)
            {
                string[] inputArr = input.Split(' ');

                string adres = inputArr[2];
                double time = double.Parse(inputArr[3]);

                if (!dictionary.ContainsKey(adres))
                {
                    dictionary.Add(adres, time);
                    newDictionary.Add(adres, 1);
                }
                else
                {
                    dictionary[adres] += time;
                    newDictionary[adres] += 1;
                }
                
                input = Console.ReadLine();
            }

            List<string> stringAdresis = new List<string>();
            List<double> avarages = new List<double>();

            foreach (var item in dictionary)
            {
                stringAdresis.Add(item.Key);
            }

            for (int i = 0; i < dictionary.Count; i++)
            {
                avarages.Add(dictionary[stringAdresis[i]] / newDictionary[stringAdresis[i]]);
            }
            
            foreach (var adres in dictionary)
            {
                Console.WriteLine("{0} -> {1}", adres.Key, adres.Value);
            }

            foreach (var adres in newDictionary)
            {
                Console.WriteLine("{0} -> {1}", adres.Key, adres.Value);
            }

            for (int i = 0; i < stringAdresis.Count; i++)
            {
                Console.WriteLine("{0} -> {1}", stringAdresis[i], avarages[i]);
            }
        }
    }
}
