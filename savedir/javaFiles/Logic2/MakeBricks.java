package Logic2;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p183562

/* We want to make a row of bricks that is goal inches long. 
We have a number of small bricks (1 inch each) and big bricks (5 inches each). 
Return true if it is possible to make the goal by choosing from the given bricks. 
This is a little harder than it looks and can be done without any loops. 
See also: Introduction to MakeBricks */

class TestCases_MakeBricks
{
    // makeBricks(3, 1, 8) → true
    // makeBricks(3, 1, 9) → false
    // makeBricks(3, 2, 10) → true

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "makeBricks(3, 1, 8)");
        testcaseMap.put(1, "makeBricks(3, 1, 9)");
        testcaseMap.put(2, "makeBricks(3, 2, 10)");
    }

    static boolean[] expectedResults = { true, false, true, };
}

public class MakeBricks
{
    public static boolean makeBricks(int small, int big, int goal)
    {
        
    }


    public static void main(String[] args)
    {
                        
        boolean[] resultsArray = {
            makeBricks(3, 1, 8),
            makeBricks(3, 1, 9),
            makeBricks(3, 2, 10),
        };


        TestCases_MakeBricks.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_MakeBricks.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_MakeBricks.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_MakeBricks.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
