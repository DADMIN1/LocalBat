package String1.Testcases;
import String1.WithoutX;

public final class _WithoutX
{
    static final String[] testcaseStrings = {
        "withoutX(\"xHix\")",
        "withoutX(\"xHi\")",
        "withoutX(\"Hxix\")",
        "withoutX(\"Hi\")",
        "withoutX(\"xxHi\")",
        "withoutX(\"Hix\")",
        "withoutX(\"xaxbx\")",
        "withoutX(\"xx\")",
        "withoutX(\"x\")",
        "withoutX(\"\")",
        "withoutX(\"Hello\")",
        "withoutX(\"Hexllo\")",
    };

    static final String[] expectedResults = {
        "Hi",
        "Hi",
        "Hxi",
        "Hi",
        "xHi",
        "Hi",
        "axb",
        "",
        "",
        "",
        "Hello",
        "Hexllo",
    };

    public static final void Validate(boolean printSuccess)
    {
        final String[] resultsArray = {
            WithoutX.withoutX("xHix"),
            WithoutX.withoutX("xHi"),
            WithoutX.withoutX("Hxix"),
            WithoutX.withoutX("Hi"),
            WithoutX.withoutX("xxHi"),
            WithoutX.withoutX("Hix"),
            WithoutX.withoutX("xaxbx"),
            WithoutX.withoutX("xx"),
            WithoutX.withoutX("x"),
            WithoutX.withoutX(""),
            WithoutX.withoutX("Hello"),
            WithoutX.withoutX("Hexllo"),
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
