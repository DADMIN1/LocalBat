package String1.Testcases;
import String1.EndsLy;

public class _EndsLy
{
    static String[] testcaseStrings = {
        "endsLy(\"oddly\")",
        "endsLy(\"y\")",
        "endsLy(\"oddy\")",
        "endsLy(\"oddl\")",
        "endsLy(\"olydd\")",
        "endsLy(\"ly\")",
        "endsLy(\"\")",
        "endsLy(\"falsey\")",
        "endsLy(\"evenly\")",
    };

    static boolean[] expectedResults = {
        true,
        false,
        false,
        false,
        false,
        true,
        false,
        false,
        true,
    };

    public static void Validate(boolean printSuccess)
    {
        boolean[] resultsArray = {
            EndsLy.endsLy("oddly"),
            EndsLy.endsLy("y"),
            EndsLy.endsLy("oddy"),
            EndsLy.endsLy("oddl"),
            EndsLy.endsLy("olydd"),
            EndsLy.endsLy("ly"),
            EndsLy.endsLy(""),
            EndsLy.endsLy("falsey"),
            EndsLy.endsLy("evenly"),
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
