package AP1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p139150

/* Start with two arrays of strings, A and B, each with its elements in alphabetical order and without duplicates.
Return a new array containing the first N elements from the two arrays.
The result array should be in alphabetical order and without duplicates.
A and B will both have a length which is N or more.
The best "linear" solution makes a single pass over A and B, taking advantage of the fact that they are in alphabetical order, copying elements directly to the new array. */

class TestCases_MergeTwo
{
    // mergeTwo(["a", "c", "z"], ["b", "f", "z"], 3) → ["a", "b", "c"]
    // mergeTwo(["a", "c", "z"], ["c", "f", "z"], 3) → ["a", "c", "f"]
    // mergeTwo(["f", "g", "z"], ["c", "f", "g"], 3) → ["c", "f", "g"]

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "mergeTwo([\"a\", \"c\", \"z\"], [\"b\", \"f\", \"z\"], 3) → [\"a\", \"b\", \"c\"]");
        testcaseMap.put(1, "mergeTwo([\"a\", \"c\", \"z\"], [\"c\", \"f\", \"z\"], 3) → [\"a\", \"c\", \"f\"]");
        testcaseMap.put(2, "mergeTwo([\"f\", \"g\", \"z\"], [\"c\", \"f\", \"g\"], 3) → [\"c\", \"f\", \"g\"]");
    }

    static String[][] expectedResults = { {"a", "b", "c"}, {"a", "c", "f"}, {"c", "f", "g"}, };
}

public class MergeTwo
{
    public static String[] mergeTwo(String[] a, String[] b, int n)
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
        String[] a0 = { "a", "c", "z" }; String[] b0 = { "b", "f", "z" }; 
        String[] a1 = { "a", "c", "z" }; String[] b1 = { "c", "f", "z" }; 
        String[] a2 = { "f", "g", "z" }; String[] b2 = { "c", "f", "g" }; 

        String[][] resultsArray = {
            mergeTwo(a0, b0, 3),
            mergeTwo(a1, b1, 3),
            mergeTwo(a2, b2, 3),
        };


        TestCases_MergeTwo.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_MergeTwo.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_MergeTwo.testcaseMap.get(i));
                System.out.println("    expected: "+printArray(TestCases_MergeTwo.expectedResults[i]));
                System.out.println("      result: "+printArray(resultsArray[i]));
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
