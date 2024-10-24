package String2.Testcases;
import String2.MixString;

public class _MixString
{
    static String[] testcaseStrings = {
        "mixString(\"abc\", \"xyz\")",
        "mixString(\"Hi\", \"There\")",
        "mixString(\"xxxx\", \"There\")",
        "mixString(\"xxx\", \"X\")",
        "mixString(\"2/\", \"27 around\")",
        "mixString(\"\", \"Hello\")",
        "mixString(\"Abc\", \"\")",
        "mixString(\"\", \"\")",
        "mixString(\"a\", \"b\")",
        "mixString(\"ax\", \"b\")",
        "mixString(\"a\", \"bx\")",
        "mixString(\"So\", \"Long\")",
        "mixString(\"Long\", \"So\")",
    };

    static String[] expectedResults = {
        "axbycz",
        "HTihere",
        "xTxhxexre",
        "xXxx",
        "22/7 around",
        "Hello",
        "Abc",
        "",
        "ab",
        "abx",
        "abx",
        "SLoong",
        "LSoong",
    };

    public static void Validate(boolean printSuccess)
    {
        String[] resultsArray = {
            MixString.mixString("abc", "xyz"),
            MixString.mixString("Hi", "There"),
            MixString.mixString("xxxx", "There"),
            MixString.mixString("xxx", "X"),
            MixString.mixString("2/", "27 around"),
            MixString.mixString("", "Hello"),
            MixString.mixString("Abc", ""),
            MixString.mixString("", ""),
            MixString.mixString("a", "b"),
            MixString.mixString("ax", "b"),
            MixString.mixString("a", "bx"),
            MixString.mixString("So", "Long"),
            MixString.mixString("Long", "So"),
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
