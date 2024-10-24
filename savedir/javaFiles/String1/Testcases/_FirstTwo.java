package String1.Testcases;
import String1.FirstTwo;

public class _FirstTwo
{
    static String[] testcaseStrings = {
        "firstTwo(\"Hello\")",
        "firstTwo(\"abcdefg\")",
        "firstTwo(\"ab\")",
        "firstTwo(\"a\")",
        "firstTwo(\"\")",
        "firstTwo(\"Kitten\")",
        "firstTwo(\"hi\")",
        "firstTwo(\"hiya\")",
    };

    static String[] expectedResults = {
        "He",
        "ab",
        "ab",
        "a",
        "",
        "Ki",
        "hi",
        "hi",
    };

    public static void Validate(boolean printSuccess)
    {
        String[] resultsArray = {
            FirstTwo.firstTwo("Hello"),
            FirstTwo.firstTwo("abcdefg"),
            FirstTwo.firstTwo("ab"),
            FirstTwo.firstTwo("a"),
            FirstTwo.firstTwo(""),
            FirstTwo.firstTwo("Kitten"),
            FirstTwo.firstTwo("hi"),
            FirstTwo.firstTwo("hiya"),
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
