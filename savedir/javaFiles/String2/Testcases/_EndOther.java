package String2.Testcases;
import String2.EndOther;

public class _EndOther
{
    static String[] testcaseStrings = {
        "endOther(\"Hiabc\", \"abc\")",
        "endOther(\"AbC\", \"HiaBc\")",
        "endOther(\"abc\", \"abXabc\")",
    };

    static boolean[] expectedResults = { true, true, true, };

    public static void Validate(boolean printSuccess)
    {
        boolean[] resultsArray = {
            EndOther.endOther("Hiabc", "abc"),
            EndOther.endOther("AbC", "HiaBc"),
            EndOther.endOther("abc", "abXabc"),
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
