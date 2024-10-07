package AP1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p139677

/* Given 2 arrays that are the same length containing strings, compare the 1st string in one array to the 1st string in the other array, the 2nd to the 2nd and so on.
Count the number of times that the 2 strings are non-empty and start with the same char.
The strings may be any length, including 0. */

class TestCases_MatchUp
{
    // matchUp(["aa", "bb", "cc"], ["aaa", "xx", "bb"]) → 1
    // matchUp(["aa", "bb", "cc"], ["aaa", "b", "bb"]) → 2
    // matchUp(["aa", "bb", "cc"], ["", "", "ccc"]) → 1

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "matchUp([\"aa\", \"bb\", \"cc\"], [\"aaa\", \"xx\", \"bb\"]) → 1");
        testcaseMap.put(1, "matchUp([\"aa\", \"bb\", \"cc\"], [\"aaa\", \"b\", \"bb\"]) → 2");
        testcaseMap.put(2, "matchUp([\"aa\", \"bb\", \"cc\"], [\"\", \"\", \"ccc\"]) → 1");
    }

    static int[] expectedResults = { 1, 2, 1, };
}

public class MatchUp
{
    public static int matchUp(String[] a, String[] b)
    {
        
    }


    public static void main(String[] args)
    {
        String[] a0 = { "aa", "bb", "cc" }; String[] b0 = { "aaa", "xx", "bb" }; 
        String[] a1 = { "aa", "bb", "cc" }; String[] b1 = { "aaa", "b", "bb" }; 
        String[] a2 = { "aa", "bb", "cc" }; String[] b2 = { "", "", "ccc" }; 

        int[] resultsArray = {
            matchUp(a0, b0),
            matchUp(a1, b1),
            matchUp(a2, b2),
        };


        TestCases_MatchUp.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_MatchUp.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_MatchUp.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_MatchUp.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
