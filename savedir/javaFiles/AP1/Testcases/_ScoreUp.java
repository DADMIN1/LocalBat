package AP1.Testcases;
import AP1.ScoreUp;

public class _ScoreUp
{
    static String[] testcaseStrings = {
        "scoreUp([\"a\", \"a\", \"b\", \"b\"], [\"a\", \"c\", \"b\", \"c\"])",
        "scoreUp([\"a\", \"a\", \"b\", \"b\"], [\"a\", \"a\", \"b\", \"c\"])",
        "scoreUp([\"a\", \"a\", \"b\", \"b\"], [\"a\", \"a\", \"b\", \"b\"])",
    };

    static int[] expectedResults = {
        6,
        11,
        16,
    };

    public static void Validate(boolean printSuccess)
    {
        String[] key0 = { "a", "a", "b", "b" }; String[] answers0 = { "a", "c", "b", "c" }; 
        String[] key1 = { "a", "a", "b", "b" }; String[] answers1 = { "a", "a", "b", "c" }; 
        String[] key2 = { "a", "a", "b", "b" }; String[] answers2 = { "a", "a", "b", "b" }; 

        int[] resultsArray = {
            ScoreUp.scoreUp(key0, answers0),
            ScoreUp.scoreUp(key1, answers1),
            ScoreUp.scoreUp(key2, answers2),
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
