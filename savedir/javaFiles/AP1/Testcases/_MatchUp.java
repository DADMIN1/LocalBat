package AP1.Testcases;
import AP1.MatchUp;

public class _MatchUp
{
    static String[] testcaseStrings = {
        "matchUp([\"aa\", \"bb\", \"cc\"], [\"aaa\", \"xx\", \"bb\"])",
        "matchUp([\"aa\", \"bb\", \"cc\"], [\"aaa\", \"b\", \"bb\"])",
        "matchUp([\"aa\", \"bb\", \"cc\"], [\"\", \"\", \"ccc\"])",
    };

    static int[] expectedResults = {
        1,
        2,
        1,
    };

    public static void Validate(boolean printSuccess)
    {
        String[] a0 = { "aa", "bb", "cc" }; String[] b0 = { "aaa", "xx", "bb" }; 
        String[] a1 = { "aa", "bb", "cc" }; String[] b1 = { "aaa", "b", "bb" }; 
        String[] a2 = { "aa", "bb", "cc" }; String[] b2 = { "", "", "ccc" }; 

        int[] resultsArray = {
            MatchUp.matchUp(a0, b0),
            MatchUp.matchUp(a1, b1),
            MatchUp.matchUp(a2, b2),
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
