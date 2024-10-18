package Functional2.Testcases;
import Functional2.No34;
import java.util.List;
import java.util.Arrays;

public class _No34
{
    static String[] testcaseStrings = {
        "no34([\"a\", \"bb\", \"ccc\"])",
        "no34([\"a\", \"bb\", \"ccc\", \"dddd\"])",
        "no34([\"ccc\", \"dddd\", \"apple\"])",
    };

    static List<String>[] expectedResults = { Arrays.asList("a", "bb"), Arrays.asList("a", "bb"), Arrays.asList("apple"), };

    public static void Validate(boolean printSuccess)
    {
        List<String>[] resultsArray = {
            No34.no34(["a", "bb", "ccc"]),
            No34.no34(["a", "bb", "ccc", "dddd"]),
            No34.no34(["ccc", "dddd", "apple"]),
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
