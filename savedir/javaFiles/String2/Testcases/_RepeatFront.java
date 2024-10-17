package String2.Testcases;
import String2.RepeatFront;

public class _RepeatFront
{
    static String[] testcaseStrings = {
        "repeatFront(\"Chocolate\", 4)",
        "repeatFront(\"Chocolate\", 3)",
        "repeatFront(\"Ice Cream\", 2)",
    };

    static String[] expectedResults = { "ChocChoChC", "ChoChC", "IcI", };

    public static void Validate(boolean printSuccess)
    {
        String[] resultsArray = {
            RepeatFront.repeatFront("Chocolate", 4),
            RepeatFront.repeatFront("Chocolate", 3),
            RepeatFront.repeatFront("Ice Cream", 2),
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
