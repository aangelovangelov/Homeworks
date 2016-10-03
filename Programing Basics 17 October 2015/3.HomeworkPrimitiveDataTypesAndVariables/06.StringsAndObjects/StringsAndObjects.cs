using System;

class StringsAndObjects
{
    static void Main()
    {
        string firstWord = "Hello";
        string secondWord = "World";
   
        object sentence = firstWord + " " + secondWord;     //Object can take all types!

        string valueObjectVariable = (string)sentence;      //All types can`t take object! Only casting is possibly!

        Console.WriteLine(sentence);
    }
}

