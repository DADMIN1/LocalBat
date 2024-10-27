package Functional1.Testcases;
import Functional1.MoreY;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public final class _MoreY
{
    static final String[] testcaseStrings = {
        "moreY([\"a\", \"b\", \"c\"])",
        "moreY([\"hello\", \"there\"])",
        "moreY([\"yay\"])",
        "moreY([\"\", \"a\", \"xx\"])",
        "moreY([])",
        "moreY([\"xx\", \"yy\", \"zz\"])",
    };

    static final List<?>[] expectedResults = {
        Arrays.asList("yay", "yby", "ycy"),
        Arrays.asList("yhelloy", "ytherey"),
        Arrays.asList("yyayy"),
        Arrays.asList("yy", "yay", "yxxy"),
        Arrays.asList(),
        Arrays.asList("yxxy", "yyyy", "yzzy"),
    };

    public static final void Validate(boolean printSuccess)
    {
        final List<?>[] resultsArray = {
            MoreY.moreY(new ArrayList<>(Arrays.asList("a", "b", "c"))),
            MoreY.moreY(new ArrayList<>(Arrays.asList("hello", "there"))),
            MoreY.moreY(new ArrayList<>(Arrays.asList("yay"))),
            MoreY.moreY(new ArrayList<>(Arrays.asList("", "a", "xx"))),
            MoreY.moreY(new ArrayList<>(Arrays.asList())),
            MoreY.moreY(new ArrayList<>(Arrays.asList("xx", "yy", "zz"))),
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
