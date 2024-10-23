package Functional1.Testcases;
import Functional1.AddStar;
import java.util.List;
import java.util.Arrays;

public class _AddStar
{
    static String[] testcaseStrings = {
        "addStar([\"a\", \"bb\", \"ccc\"])",
        "addStar([\"hello\", \"there\"])",
        "addStar([\"*\"])",
    };

    static List<?>[] expectedResults = {
        Arrays.asList("a*", "bb*", "ccc*"),
        Arrays.asList("hello*", "there*"),
        Arrays.asList("**"),
    };

    public static void Validate(boolean printSuccess)
    {
        List<?>[] resultsArray = {
            AddStar.addStar(Arrays.asList("a", "bb", "ccc")),
            AddStar.addStar(Arrays.asList("hello", "there")),
            AddStar.addStar(Arrays.asList("*")),
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
