package String1.Testcases;
import String1.ComboString;

public class _ComboString
{
    static String[] testcaseStrings = {
        "comboString(\"Hello\", \"hi\")",
        "comboString(\"hi\", \"Hello\")",
        "comboString(\"aaa\", \"b\")",
    };

    static String[] expectedResults = {
        "hiHellohi",
        "hiHellohi",
        "baaab",
    };

    public static void Validate(boolean printSuccess)
    {
        String[] resultsArray = {
            ComboString.comboString("Hello", "hi"),
            ComboString.comboString("hi", "Hello"),
            ComboString.comboString("aaa", "b"),
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
