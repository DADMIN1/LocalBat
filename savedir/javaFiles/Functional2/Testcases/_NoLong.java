package Functional2.Testcases;
import Functional2.NoLong;
import java.util.List;
import java.util.Arrays;

public class _NoLong
{
    static String[] testcaseStrings = {
        "noLong([\"this\", \"not\", \"too\", \"long\"])",
        "noLong([\"a\", \"bbb\", \"cccc\"])",
        "noLong([\"cccc\", \"cccc\", \"cccc\"])",
    };

    static List<?>[] expectedResults = {
        Arrays.asList("not", "too"),
        Arrays.asList("a", "bbb"),
        Arrays.asList(),
    };

    public static void Validate(boolean printSuccess)
    {
        List<?>[] resultsArray = {
            NoLong.noLong(Arrays.asList("this", "not", "too", "long")),
            NoLong.noLong(Arrays.asList("a", "bbb", "cccc")),
            NoLong.noLong(Arrays.asList("cccc", "cccc", "cccc")),
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
