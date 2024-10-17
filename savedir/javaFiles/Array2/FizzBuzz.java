package Array2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p153059

/* This is slightly more difficult version of the famous FizzBuzz problem which is sometimes given as a first problem for job interviews. 
(See also: FizzBuzz Code.) Consider the series of numbers beginning at start and running up to but not including end, 
so for example start=1 and end=5 gives the series 1, 2, 
3, 4. Return a new String[] array containing the string form of these numbers, 
except for multiples of 3, use "Fizz" instead of the number, 
for multiples of 5 use "Buzz", and for multiples of both 3 and 5 use "FizzBuzz". 
In Java, String.valueOf(xxx) will make the String form of an int or other type. 
This version is a little more complicated than the usual version since you have to allocate and index into an array instead of just printing, 
and we vary the start/end instead of just always doing 1..100. */

class TestCases_FizzBuzz
{
    // fizzBuzz(1, 6) → ["1", "2", "Fizz", "4", "Buzz"]
    // fizzBuzz(1, 8) → ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7"]
    // fizzBuzz(1, 11) → ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"]

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "fizzBuzz(1, 6)");
        testcaseMap.put(1, "fizzBuzz(1, 8)");
        testcaseMap.put(2, "fizzBuzz(1, 11)");
    }

    static String[][] expectedResults = { ["1", "2", "Fizz", "4", "Buzz"], ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7"], ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"], };
}

public class FizzBuzz
{
    public static String[] fizzBuzz(int start, int end)
    {
        
    }


    public static String printArray(String[] array)
    {
        String result = "[";
        for (String a: array) { result += a+", "; }
        if (result.length() > 2) result = result.substring(0, result.length()-2);
        return result + "]";
    }

    public static void main(String[] args)
    {
                        
        String[][] resultsArray = {
            fizzBuzz(1, 6),
            fizzBuzz(1, 8),
            fizzBuzz(1, 11),
        };


        TestCases_FizzBuzz.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (!resultsArray[i].equals(TestCases_FizzBuzz.expectedResults[i]))
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_FizzBuzz.testcaseMap.get(i));
                System.out.println("    received: "+printArray(resultsArray[i]));
                System.out.println("    expected: "+printArray(TestCases_FizzBuzz.expectedResults[i]));
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
