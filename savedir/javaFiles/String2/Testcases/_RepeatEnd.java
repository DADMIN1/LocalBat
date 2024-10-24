package String2.Testcases;
import String2.RepeatEnd;

public class _RepeatEnd
{
    static String[] testcaseStrings = {
        "repeatEnd(\"Hello\", 3)",
        "repeatEnd(\"Hello\", 2)",
        "repeatEnd(\"Hello\", 1)",
        "repeatEnd(\"Hello\", 0)",
        "repeatEnd(\"abc\", 3)",
        "repeatEnd(\"1234\", 2)",
        "repeatEnd(\"1234\", 3)",
        "repeatEnd(\"\", 0)",
    };

    static String[] expectedResults = {
        "llollollo",
        "lolo",
        "o",
        "",
        "abcabcabc",
        "3434",
        "234234234",
        "",
    };

    public static void Validate(boolean printSuccess)
    {
        String[] resultsArray = {
            RepeatEnd.repeatEnd("Hello", 3),
            RepeatEnd.repeatEnd("Hello", 2),
            RepeatEnd.repeatEnd("Hello", 1),
            RepeatEnd.repeatEnd("Hello", 0),
            RepeatEnd.repeatEnd("abc", 3),
            RepeatEnd.repeatEnd("1234", 2),
            RepeatEnd.repeatEnd("1234", 3),
            RepeatEnd.repeatEnd("", 0),
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
