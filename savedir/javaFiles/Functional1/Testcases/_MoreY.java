package Functional1.Testcases;
import Functional1.MoreY;
import java.util.List;
import java.util.Arrays;

public class _MoreY
{
    static String[] testcaseStrings = {
        "moreY([\"a\", \"b\", \"c\"])",
        "moreY([\"hello\", \"there\"])",
        "moreY([\"yay\"])",
    };

    static List<?>[] expectedResults = {
        Arrays.asList("yay", "yby", "ycy"),
        Arrays.asList("yhelloy", "ytherey"),
        Arrays.asList("yyayy"),
    };

    public static void Validate(boolean printSuccess)
    {
        List<?>[] resultsArray = {
            MoreY.moreY(Arrays.asList("a", "b", "c")),
            MoreY.moreY(Arrays.asList("hello", "there")),
            MoreY.moreY(Arrays.asList("yay")),
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
