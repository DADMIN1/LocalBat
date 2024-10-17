package String2.Testcases;
import String2.MixString;

public class _MixString
{
    static String[] testcaseStrings = {
        "mixString(\"abc\", \"xyz\")",
        "mixString(\"Hi\", \"There\")",
        "mixString(\"xxxx\", \"There\")",
    };

    static String[] expectedResults = { "axbycz", "HTihere", "xTxhxexre", };

    public static void Validate(boolean printSuccess)
    {
        String[] resultsArray = {
            MixString.mixString("abc", "xyz"),
            MixString.mixString("Hi", "There"),
            MixString.mixString("xxxx", "There"),
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
