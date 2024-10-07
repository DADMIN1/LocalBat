package Array2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p178353

/* Given a number n, create and return a new string array of length n, containing the strings "0", "1" "2" ..
through n-1.
N may be 0, in which case just return a length 0 array.
Note: String.valueOf(xxx) will make the String form of most types.
The syntax to make a new string array is: new String[desired_length]  (See also: FizzBuzz Code) */

class TestCases_FizzArray2
{
    // fizzArray2(4) → ["0", "1", "2", "3"]
    // fizzArray2(10) → ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9"]
    // fizzArray2(2) → ["0", "1"]

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "fizzArray2(4) → [\"0\", \"1\", \"2\", \"3\"]");
        testcaseMap.put(1, "fizzArray2(10) → [\"0\", \"1\", \"2\", \"3\", \"4\", \"5\", \"6\", \"7\", \"8\", \"9\"]");
        testcaseMap.put(2, "fizzArray2(2) → [\"0\", \"1\"]");
    }

    static String[][] expectedResults = { ["0", "1", "2", "3"], ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9"], ["0", "1"], };
}

public class FizzArray2
{
    public static String[] fizzArray2(int n)
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
            fizzArray2(4),
            fizzArray2(10),
            fizzArray2(2),
        };


        TestCases_FizzArray2.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_FizzArray2.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_FizzArray2.testcaseMap.get(i));
                System.out.println("    expected: "+printArray(TestCases_FizzArray2.expectedResults[i]));
                System.out.println("      result: "+printArray(resultsArray[i]));
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
