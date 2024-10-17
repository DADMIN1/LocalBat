package String2.Testcases;
import String2.XyzMiddle;

public class _XyzMiddle
{
    static String[] testcaseStrings = {
        "xyzMiddle(\"AAxyzBB\")",
        "xyzMiddle(\"AxyzBB\")",
        "xyzMiddle(\"AxyzBBB\")",
    };

    static boolean[] expectedResults = { true, true, false, };

    public static void Validate(boolean printSuccess)
    {
        boolean[] resultsArray = {
            XyzMiddle.xyzMiddle("AAxyzBB"),
            XyzMiddle.xyzMiddle("AxyzBB"),
            XyzMiddle.xyzMiddle("AxyzBBB"),
        };

        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != expectedResults[i])
            {
                allTestsPassed = false;
                System.out.println("\n[-] #"+(i+1)+" failed!");
                System.out.println(testcaseStrings[i]+";");
                System.out.println("    received: "+resultsArray[i]);
                System.out.println("    expected: "+expectedResults[i]);
                System.out.println("\n");
            } else if (printSuccess) { 
                System.out.println("[✔] #"+(i+1)+" - "+testcaseStrings[i]);
            }
        }
        if (allTestsPassed) System.out.println("\n ✔✔✔  ~ All tests passed. ~  ✔✔✔");
        System.out.println();
        return;
    }
}
