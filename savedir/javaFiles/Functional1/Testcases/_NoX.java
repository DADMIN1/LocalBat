package Functional1.Testcases;
import Functional1.NoX;
import java.util.List;
import java.util.Arrays;

public class _NoX
{
    static String[] testcaseStrings = {
        "noX([\"ax\", \"bb\", \"cx\"])",
        "noX([\"xxax\", \"xbxbx\", \"xxcx\"])",
        "noX([\"x\"])",
    };

    static List<String>[] expectedResults = {
        Arrays.asList("a", "bb", "c"),
        Arrays.asList("a", "bb", "c"),
        Arrays.asList(""),
    };

    public static void Validate(boolean printSuccess)
    {
        List<String>[] resultsArray = {
            NoX.noX(["ax", "bb", "cx"]),
            NoX.noX(["xxax", "xbxbx", "xxcx"]),
            NoX.noX(["x"]),
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
