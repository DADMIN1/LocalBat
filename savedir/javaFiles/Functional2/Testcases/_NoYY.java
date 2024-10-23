package Functional2.Testcases;
import Functional2.NoYY;
import java.util.List;
import java.util.Arrays;

public class _NoYY
{
    static String[] testcaseStrings = {
        "noYY([\"a\", \"b\", \"c\"])",
        "noYY([\"a\", \"b\", \"cy\"])",
        "noYY([\"xx\", \"ya\", \"zz\"])",
    };

    static List<?>[] expectedResults = {
        Arrays.asList("ay", "by", "cy"),
        Arrays.asList("ay", "by"),
        Arrays.asList("xxy", "yay", "zzy"),
    };

    public static void Validate(boolean printSuccess)
    {
        List<?>[] resultsArray = {
            NoYY.noYY(Arrays.asList("a", "b", "c")),
            NoYY.noYY(Arrays.asList("a", "b", "cy")),
            NoYY.noYY(Arrays.asList("xx", "ya", "zz")),
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
