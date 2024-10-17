package Logic1;

import java.util.Map;
import java.util.HashMap;

// https://codingbat.com/prob/p159531

/* When squirrels get together for a party, they like to have cigars. 
A squirrel party is successful when the number of cigars is between 40 and 60, 
inclusive. Unless it is the weekend, in which case there is no upper bound on the number of cigars. 
Return true if the party with the given values is successful, 
or false otherwise. */

class TestCases_CigarParty
{
    // cigarParty(30, false) → false
    // cigarParty(50, false) → true
    // cigarParty(70, true) → true

    static Map<Integer, String> testcaseMap = new HashMap<>();
    static void initTestcaseMap()
    {
        testcaseMap.put(0, "cigarParty(30, false)");
        testcaseMap.put(1, "cigarParty(50, false)");
        testcaseMap.put(2, "cigarParty(70, true)");
    }

    static boolean[] expectedResults = { false, true, true, };
}

public class CigarParty
{
    public static boolean cigarParty(int cigars, boolean isWeekend)
    {
        
    }


    public static void main(String[] args)
    {
                        
        boolean[] resultsArray = {
            cigarParty(30, false),
            cigarParty(50, false),
            cigarParty(70, true),
        };


        TestCases_CigarParty.initTestcaseMap();
        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != TestCases_CigarParty.expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("Test#"+(i+1)+" failed!");
                System.out.println(TestCases_CigarParty.testcaseMap.get(i));
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+TestCases_CigarParty.expectedResults[i]);
                System.out.println("\n");
            }
        }
        if (allTestsPassed) System.out.println("All tests passed. :^) ");
        System.out.println();
    }
}
