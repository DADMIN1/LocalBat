package String1.Testcases;
import String1.Right2;

public class _Right2
{
    static String[] testcaseStrings = {
        "right2(\"Hello\")",
        "right2(\"java\")",
        "right2(\"Hi\")",
        "right2(\"code\")",
        "right2(\"cat\")",
        "right2(\"12345\")",
    };

    static String[] expectedResults = {
        "loHel",
        "vaja",
        "Hi",
        "deco",
        "atc",
        "45123",
    };

    public static void Validate(boolean printSuccess)
    {
        String[] resultsArray = {
            Right2.right2("Hello"),
            Right2.right2("java"),
            Right2.right2("Hi"),
            Right2.right2("code"),
            Right2.right2("cat"),
            Right2.right2("12345"),
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
