package Functional2.Testcases;
import Functional2.NoYY;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public final class _NoYY
{
    static final String[] testcaseStrings = {
        "noYY([\"a\", \"b\", \"c\"])",
        "noYY([\"a\", \"b\", \"cy\"])",
        "noYY([\"xx\", \"ya\", \"zz\"])",
        "noYY([\"xx\", \"yay\", \"zz\"])",
        "noYY([\"yyx\", \"y\", \"zzz\"])",
        "noYY([\"hello\", \"there\"])",
        "noYY([\"ya\"])",
        "noYY([])",
        "noYY([\"\"])",
        "noYY([\"xx\", \"yy\", \"zz\"])",
    };

    static final List<?>[] expectedResults = {
        Arrays.asList("ay", "by", "cy"),
        Arrays.asList("ay", "by"),
        Arrays.asList("xxy", "yay", "zzy"),
        Arrays.asList("xxy", "zzy"),
        Arrays.asList("zzzy"),
        Arrays.asList("helloy", "therey"),
        Arrays.asList("yay"),
        Arrays.asList(),
        Arrays.asList("y"),
        Arrays.asList("xxy", "zzy"),
    };

    public static final void Validate(boolean printSuccess)
    {
        final List<?>[] resultsArray = {
            NoYY.noYY(new ArrayList<>(Arrays.asList("a", "b", "c"))),
            NoYY.noYY(new ArrayList<>(Arrays.asList("a", "b", "cy"))),
            NoYY.noYY(new ArrayList<>(Arrays.asList("xx", "ya", "zz"))),
            NoYY.noYY(new ArrayList<>(Arrays.asList("xx", "yay", "zz"))),
            NoYY.noYY(new ArrayList<>(Arrays.asList("yyx", "y", "zzz"))),
            NoYY.noYY(new ArrayList<>(Arrays.asList("hello", "there"))),
            NoYY.noYY(new ArrayList<>(Arrays.asList("ya"))),
            NoYY.noYY(new ArrayList<>(Arrays.asList())),
            NoYY.noYY(new ArrayList<>(Arrays.asList(""))),
            NoYY.noYY(new ArrayList<>(Arrays.asList("xx", "yy", "zz"))),
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
