package AP1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p143482

/* We have data for two users, A and B, each with a String name and an int id.
The goal is to order the users such as for sorting.
Return -1 if A comes before B, 1 if A comes after B, and 0 if they are the same.
Order first by the string names, and then by the id numbers if the names are the same.
Note: with Strings str1.compareTo(str2) returns an int value which is negative/0/positive to indicate how str1 is ordered to str2 (the value is not limited to -1/0/1).
(On the AP, there would be two User objects, but here the code simply takes the two strings and two ints directly.
The code logic is the same.) */

class TestCases_UserCompare
{
    // userCompare("bb", 1, "zz", 2) → -1
    // userCompare("bb", 1, "aa", 2) → 1
    // userCompare("bb", 1, "bb", 1) → 0

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "userCompare(\"bb\", 1, \"zz\", 2) → -1");
        testcaseMap.put(1, "userCompare(\"bb\", 1, \"aa\", 2) → 1");
        testcaseMap.put(2, "userCompare(\"bb\", 1, \"bb\", 1) → 0");
    }

    static int[] expectedResults = { -1, 1, 0, };
}

public class UserCompare
{
    public static int userCompare(String aName, int aId, String bName, int bId)
    {
        
    }


    public static void main(String[] args)
    {
                        
        int[] resultsArray = {
            userCompare("bb", 1, "zz", 2),
            userCompare("bb", 1, "aa", 2),
            userCompare("bb", 1, "bb", 1),
        };


        TestCases_UserCompare.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_UserCompare.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+i+" failed!");
                System.out.println(TestCases_UserCompare.testcaseMap.get(i));
                System.out.println("    expected: "+TestCases_UserCompare.expectedResults[i]);
                System.out.println("      result: "+resultsArray[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
