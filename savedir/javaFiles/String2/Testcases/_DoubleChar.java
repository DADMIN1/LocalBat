package String2.Testcases;
import String2.DoubleChar;

public class _DoubleChar
{
    static String[] testcaseStrings = {
        "doubleChar(\"The\")",
        "doubleChar(\"AAbb\")",
        "doubleChar(\"Hi-There\")",
    };

    static String[] expectedResults = { "TThhee", "AAAAbbbb", "HHii--TThheerree", };

    public static void Validate(boolean printSuccess)
    {
        String[] resultsArray = {
            DoubleChar.doubleChar("The"),
            DoubleChar.doubleChar("AAbb"),
            DoubleChar.doubleChar("Hi-There"),
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
