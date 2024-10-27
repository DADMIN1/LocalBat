package String1.Testcases;
import String1.WithoutX2;

public final class _WithoutX2
{
    static final String[] testcaseStrings = {
        "withoutX2(\"xHi\")",
        "withoutX2(\"Hxi\")",
        "withoutX2(\"Hi\")",
        "withoutX2(\"xxHi\")",
        "withoutX2(\"Hix\")",
        "withoutX2(\"xaxb\")",
        "withoutX2(\"xx\")",
        "withoutX2(\"x\")",
        "withoutX2(\"\")",
        "withoutX2(\"Hello\")",
        "withoutX2(\"Hexllo\")",
        "withoutX2(\"xHxllo\")",
    };

    static final String[] expectedResults = {
        "Hi",
        "Hi",
        "Hi",
        "Hi",
        "Hix",
        "axb",
        "",
        "",
        "",
        "Hello",
        "Hexllo",
        "Hxllo",
    };

    public static final void Validate(boolean printSuccess)
    {
        final String[] resultsArray = {
            WithoutX2.withoutX2("xHi"),
            WithoutX2.withoutX2("Hxi"),
            WithoutX2.withoutX2("Hi"),
            WithoutX2.withoutX2("xxHi"),
            WithoutX2.withoutX2("Hix"),
            WithoutX2.withoutX2("xaxb"),
            WithoutX2.withoutX2("xx"),
            WithoutX2.withoutX2("x"),
            WithoutX2.withoutX2(""),
            WithoutX2.withoutX2("Hello"),
            WithoutX2.withoutX2("Hexllo"),
            WithoutX2.withoutX2("xHxllo"),
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
