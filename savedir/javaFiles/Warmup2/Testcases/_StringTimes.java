package Warmup2.Testcases;
import Warmup2.StringTimes;

public class _StringTimes
{
    static String[] testcaseStrings = {
        "stringTimes(\"Hi\", 2)",
        "stringTimes(\"Hi\", 3)",
        "stringTimes(\"Hi\", 1)",
        "stringTimes(\"Hi\", 0)",
        "stringTimes(\"Hi\", 5)",
        "stringTimes(\"Oh Boy!\", 2)",
        "stringTimes(\"x\", 4)",
        "stringTimes(\"\", 4)",
        "stringTimes(\"code\", 2)",
        "stringTimes(\"code\", 3)",
    };

    static String[] expectedResults = {
        "HiHi",
        "HiHiHi",
        "Hi",
        "",
        "HiHiHiHiHi",
        "Oh Boy!Oh Boy!",
        "xxxx",
        "",
        "codecode",
        "codecodecode",
    };

    public static void Validate(boolean printSuccess)
    {
        String[] resultsArray = {
            StringTimes.stringTimes("Hi", 2),
            StringTimes.stringTimes("Hi", 3),
            StringTimes.stringTimes("Hi", 1),
            StringTimes.stringTimes("Hi", 0),
            StringTimes.stringTimes("Hi", 5),
            StringTimes.stringTimes("Oh Boy!", 2),
            StringTimes.stringTimes("x", 4),
            StringTimes.stringTimes("", 4),
            StringTimes.stringTimes("code", 2),
            StringTimes.stringTimes("code", 3),
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
