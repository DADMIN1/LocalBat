package String2.Testcases;
import String2.PlusOut;

public class _PlusOut
{
    static String[] testcaseStrings = {
        "plusOut(\"12xy34\", \"xy\")",
        "plusOut(\"12xy34\", \"1\")",
        "plusOut(\"12xy34xyabcxy\", \"xy\")",
    };

    static String[] expectedResults = {
        "++xy++",
        "1+++++",
        "++xy++xy+++xy",
    };

    public static void Validate(boolean printSuccess)
    {
        String[] resultsArray = {
            PlusOut.plusOut("12xy34", "xy"),
            PlusOut.plusOut("12xy34", "1"),
            PlusOut.plusOut("12xy34xyabcxy", "xy"),
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
