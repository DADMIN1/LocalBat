package String1.Testcases;
import String1.TwoChar;

public final class _TwoChar
{
    static final String[] testcaseStrings = {
        "twoChar(\"java\", 0)",
        "twoChar(\"java\", 2)",
        "twoChar(\"java\", 3)",
        "twoChar(\"java\", 4)",
        "twoChar(\"java\", -1)",
        "twoChar(\"Hello\", 0)",
        "twoChar(\"Hello\", 1)",
        "twoChar(\"Hello\", 99)",
        "twoChar(\"Hello\", 3)",
        "twoChar(\"Hello\", 4)",
        "twoChar(\"Hello\", 5)",
        "twoChar(\"Hello\", -7)",
        "twoChar(\"Hello\", 6)",
        "twoChar(\"Hello\", -1)",
        "twoChar(\"yay\", 0)",
    };

    static final String[] expectedResults = {
        "ja",
        "va",
        "ja",
        "ja",
        "ja",
        "He",
        "el",
        "He",
        "lo",
        "He",
        "He",
        "He",
        "He",
        "He",
        "ya",
    };

    public static final void Validate(boolean printSuccess)
    {
        final String[] resultsArray = {
            TwoChar.twoChar("java", 0),
            TwoChar.twoChar("java", 2),
            TwoChar.twoChar("java", 3),
            TwoChar.twoChar("java", 4),
            TwoChar.twoChar("java", -1),
            TwoChar.twoChar("Hello", 0),
            TwoChar.twoChar("Hello", 1),
            TwoChar.twoChar("Hello", 99),
            TwoChar.twoChar("Hello", 3),
            TwoChar.twoChar("Hello", 4),
            TwoChar.twoChar("Hello", 5),
            TwoChar.twoChar("Hello", -7),
            TwoChar.twoChar("Hello", 6),
            TwoChar.twoChar("Hello", -1),
            TwoChar.twoChar("yay", 0),
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
