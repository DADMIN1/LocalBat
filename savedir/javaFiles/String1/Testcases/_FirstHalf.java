package String1.Testcases;
import String1.FirstHalf;

public class _FirstHalf
{
    static String[] testcaseStrings = {
        "firstHalf(\"WooHoo\")",
        "firstHalf(\"HelloThere\")",
        "firstHalf(\"abcdef\")",
    };

    static String[] expectedResults = {
        "Woo",
        "Hello",
        "abc",
    };

    public static void Validate(boolean printSuccess)
    {
        String[] resultsArray = {
            FirstHalf.firstHalf("WooHoo"),
            FirstHalf.firstHalf("HelloThere"),
            FirstHalf.firstHalf("abcdef"),
        };

        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (!resultsArray[i].equals(expectedResults[i]))
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
