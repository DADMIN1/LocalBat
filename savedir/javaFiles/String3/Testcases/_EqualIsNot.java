package String3.Testcases;
import String3.EqualIsNot;

public class _EqualIsNot
{
    static String[] testcaseStrings = {
        "equalIsNot(\"This is not\")",
        "equalIsNot(\"This is notnot\")",
        "equalIsNot(\"noisxxnotyynotxisi\")",
    };

    static boolean[] expectedResults = { false, true, true, };

    public static void Validate(boolean printSuccess)
    {
        boolean[] resultsArray = {
            EqualIsNot.equalIsNot("This is not"),
            EqualIsNot.equalIsNot("This is notnot"),
            EqualIsNot.equalIsNot("noisxxnotyynotxisi"),
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
