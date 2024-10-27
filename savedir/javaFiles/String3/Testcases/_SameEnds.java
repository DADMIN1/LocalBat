package String3.Testcases;
import String3.SameEnds;

public final class _SameEnds
{
    static final String[] testcaseStrings = {
        "sameEnds(\"abXYab\")",
        "sameEnds(\"xx\")",
        "sameEnds(\"xxx\")",
        "sameEnds(\"xxxx\")",
        "sameEnds(\"javaXYZjava\")",
        "sameEnds(\"javajava\")",
        "sameEnds(\"xavaXYZjava\")",
        "sameEnds(\"Hello! and Hello!\")",
        "sameEnds(\"x\")",
        "sameEnds(\"\")",
        "sameEnds(\"abcb\")",
        "sameEnds(\"mymmy\")",
    };

    static final String[] expectedResults = {
        "ab",
        "x",
        "x",
        "xx",
        "java",
        "java",
        "",
        "Hello!",
        "",
        "",
        "",
        "my",
    };

    public static final void Validate(boolean printSuccess)
    {
        final String[] resultsArray = {
            SameEnds.sameEnds("abXYab"),
            SameEnds.sameEnds("xx"),
            SameEnds.sameEnds("xxx"),
            SameEnds.sameEnds("xxxx"),
            SameEnds.sameEnds("javaXYZjava"),
            SameEnds.sameEnds("javajava"),
            SameEnds.sameEnds("xavaXYZjava"),
            SameEnds.sameEnds("Hello! and Hello!"),
            SameEnds.sameEnds("x"),
            SameEnds.sameEnds(""),
            SameEnds.sameEnds("abcb"),
            SameEnds.sameEnds("mymmy"),
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
