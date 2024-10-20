package String1.Testcases;
import String1.WithoutX;

public class _WithoutX
{
    static String[] testcaseStrings = {
        "withoutX(\"xHix\")",
        "withoutX(\"xHi\")",
        "withoutX(\"Hxix\")",
    };

    static String[] expectedResults = { "Hi", "Hi", "Hxi", };

    public static void Validate(boolean printSuccess)
    {
        String[] resultsArray = {
            WithoutX.withoutX("xHix"),
            WithoutX.withoutX("xHi"),
            WithoutX.withoutX("Hxix"),
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
