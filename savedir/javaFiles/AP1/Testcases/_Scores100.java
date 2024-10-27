package AP1.Testcases;
import AP1.Scores100;

public final class _Scores100
{
    static final String[] testcaseStrings = {
        "scores100([1, 100, 100])",
        "scores100([1, 100, 99, 100])",
        "scores100([100, 1, 100, 100])",
        "scores100([100, 1, 100, 1])",
        "scores100([1, 2, 3, 4, 5])",
        "scores100([1, 2, 100, 4, 5])",
    };

    static final boolean[] expectedResults = {
        true,
        false,
        true,
        false,
        false,
        false,
    };

    public static final void Validate(boolean printSuccess)
    {
        final int[] scores0 = { 1, 100, 100 }; 
        final int[] scores1 = { 1, 100, 99, 100 }; 
        final int[] scores2 = { 100, 1, 100, 100 }; 
        final int[] scores3 = { 100, 1, 100, 1 }; 
        final int[] scores4 = { 1, 2, 3, 4, 5 }; 
        final int[] scores5 = { 1, 2, 100, 4, 5 }; 

        final boolean[] resultsArray = {
            Scores100.scores100(scores0),
            Scores100.scores100(scores1),
            Scores100.scores100(scores2),
            Scores100.scores100(scores3),
            Scores100.scores100(scores4),
            Scores100.scores100(scores5),
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
