package Array2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p180920

/* Given a number n, create and return a new int array of length n, 
containing the numbers 0, 1, 2, ... n-1. The given n may be 0, 
in which case just return a length 0 array. 
You do not need a separate if-statement for the length-0 case; the for-loop should naturally execute 0 times in that case, 
so it just works. The syntax to make a new int array is: 
new int[desired_length]   (See also: FizzBuzz Code) */

class TestCases_FizzArray
{
    // fizzArray(4) → [0, 1, 2, 3]
    // fizzArray(1) → [0]
    // fizzArray(10) → [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "fizzArray(4)");
        testcaseMap.put(1, "fizzArray(1)");
        testcaseMap.put(2, "fizzArray(10)");
    }

    static int[][] expectedResults = { [0, 1, 2, 3], [0], [0, 1, 2, 3, 4, 5, 6, 7, 8, 9], };
}

public class FizzArray
{
    public static int[] fizzArray(int n)
    {
        
    }


    public static String printArray(int[] array)
    {
        String result = "[";
        for (int a: array) { result += a+", "; }
        if (result.length() > 2) result = result.substring(0, result.length()-2);
        return result + "]";
    }

    public static void main(String[] args)
    {
                        
        int[][] resultsArray = {
            fizzArray(4),
            fizzArray(1),
            fizzArray(10),
        };


        TestCases_FizzArray.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (!resultsArray[i].equals(TestCases_FizzArray.expectedResults[i]))
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_FizzArray.testcaseMap.get(i));
                System.out.println("    received: "+printArray(resultsArray[i]));
                System.out.println("    expected: "+printArray(TestCases_FizzArray.expectedResults[i]));
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
