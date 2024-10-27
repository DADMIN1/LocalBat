package Functional1.Testcases;
import Functional1.NoX;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public final class _NoX
{
    static final String[] testcaseStrings = {
        "noX([\"ax\", \"bb\", \"cx\"])",
        "noX([\"xxax\", \"xbxbx\", \"xxcx\"])",
        "noX([\"x\"])",
        "noX([\"\"])",
        "noX([])",
        "noX([\"the\", \"taxi\"])",
        "noX([\"the\", \"xxtxaxixxx\"])",
        "noX([\"this\", \"is\", \"the\", \"x\"])",
    };

    static final List<?>[] expectedResults = {
        Arrays.asList("a", "bb", "c"),
        Arrays.asList("a", "bb", "c"),
        Arrays.asList(""),
        Arrays.asList(""),
        Arrays.asList(),
        Arrays.asList("the", "tai"),
        Arrays.asList("the", "tai"),
        Arrays.asList("this", "is", "the", ""),
    };

    public static final void Validate(boolean printSuccess)
    {
        final List<?>[] resultsArray = {
            NoX.noX(new ArrayList<>(Arrays.asList("ax", "bb", "cx"))),
            NoX.noX(new ArrayList<>(Arrays.asList("xxax", "xbxbx", "xxcx"))),
            NoX.noX(new ArrayList<>(Arrays.asList("x"))),
            NoX.noX(new ArrayList<>(Arrays.asList(""))),
            NoX.noX(new ArrayList<>(Arrays.asList())),
            NoX.noX(new ArrayList<>(Arrays.asList("the", "taxi"))),
            NoX.noX(new ArrayList<>(Arrays.asList("the", "xxtxaxixxx"))),
            NoX.noX(new ArrayList<>(Arrays.asList("this", "is", "the", "x"))),
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
