package String3.Testcases;
import String3.MirrorEnds;

public class _MirrorEnds
{
    static String[] testcaseStrings = {
        "mirrorEnds(\"abXYZba\")",
        "mirrorEnds(\"abca\")",
        "mirrorEnds(\"aba\")",
        "mirrorEnds(\"abab\")",
        "mirrorEnds(\"xxx\")",
        "mirrorEnds(\"xxYxx\")",
        "mirrorEnds(\"Hi and iH\")",
        "mirrorEnds(\"x\")",
        "mirrorEnds(\"\")",
        "mirrorEnds(\"123and then 321\")",
        "mirrorEnds(\"band andab\")",
    };

    static String[] expectedResults = {
        "ab",
        "a",
        "aba",
        "",
        "xxx",
        "xxYxx",
        "Hi ",
        "x",
        "",
        "123",
        "ba",
    };

    public static void Validate(boolean printSuccess)
    {
        String[] resultsArray = {
            MirrorEnds.mirrorEnds("abXYZba"),
            MirrorEnds.mirrorEnds("abca"),
            MirrorEnds.mirrorEnds("aba"),
            MirrorEnds.mirrorEnds("abab"),
            MirrorEnds.mirrorEnds("xxx"),
            MirrorEnds.mirrorEnds("xxYxx"),
            MirrorEnds.mirrorEnds("Hi and iH"),
            MirrorEnds.mirrorEnds("x"),
            MirrorEnds.mirrorEnds(""),
            MirrorEnds.mirrorEnds("123and then 321"),
            MirrorEnds.mirrorEnds("band andab"),
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
