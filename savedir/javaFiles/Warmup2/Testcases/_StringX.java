package Warmup2.Testcases;
import Warmup2.StringX;

public class _StringX
{
    static String[] testcaseStrings = {
        "stringX(\"xxHxix\")",
        "stringX(\"abxxxcd\")",
        "stringX(\"xabxxxcdx\")",
        "stringX(\"xKittenx\")",
        "stringX(\"Hello\")",
        "stringX(\"xx\")",
        "stringX(\"x\")",
        "stringX(\"\")",
    };

    static String[] expectedResults = {
        "xHix",
        "abcd",
        "xabcdx",
        "xKittenx",
        "Hello",
        "xx",
        "x",
        "",
    };

    public static void Validate(boolean printSuccess)
    {
        String[] resultsArray = {
            StringX.stringX("xxHxix"),
            StringX.stringX("abxxxcd"),
            StringX.stringX("xabxxxcdx"),
            StringX.stringX("xKittenx"),
            StringX.stringX("Hello"),
            StringX.stringX("xx"),
            StringX.stringX("x"),
            StringX.stringX(""),
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
