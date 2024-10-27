package String3.Testcases;
import String3.CountTriple;

public final class _CountTriple
{
    static final String[] testcaseStrings = {
        "countTriple(\"abcXXXabc\")",
        "countTriple(\"xxxabyyyycd\")",
        "countTriple(\"a\")",
        "countTriple(\"\")",
        "countTriple(\"XXXabc\")",
        "countTriple(\"XXXXabc\")",
        "countTriple(\"XXXXXabc\")",
        "countTriple(\"222abyyycdXXX\")",
        "countTriple(\"abYYYabXXXXXab\")",
        "countTriple(\"abYYXabXXYXXab\")",
        "countTriple(\"abYYXabXXYXXab\")",
        "countTriple(\"122abhhh2\")",
    };

    static final int[] expectedResults = {
        1,
        3,
        0,
        0,
        1,
        2,
        3,
        3,
        4,
        0,
        0,
        1,
    };

    public static final void Validate(boolean printSuccess)
    {
        final int[] resultsArray = {
            CountTriple.countTriple("abcXXXabc"),
            CountTriple.countTriple("xxxabyyyycd"),
            CountTriple.countTriple("a"),
            CountTriple.countTriple(""),
            CountTriple.countTriple("XXXabc"),
            CountTriple.countTriple("XXXXabc"),
            CountTriple.countTriple("XXXXXabc"),
            CountTriple.countTriple("222abyyycdXXX"),
            CountTriple.countTriple("abYYYabXXXXXab"),
            CountTriple.countTriple("abYYXabXXYXXab"),
            CountTriple.countTriple("abYYXabXXYXXab"),
            CountTriple.countTriple("122abhhh2"),
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
