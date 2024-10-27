package Warmup2.Testcases;
import Warmup2.StringBits;

public final class _StringBits
{
    static final String[] testcaseStrings = {
        "stringBits(\"Hello\")",
        "stringBits(\"Hi\")",
        "stringBits(\"Heeololeo\")",
        "stringBits(\"HiHiHi\")",
        "stringBits(\"\")",
        "stringBits(\"Greetings\")",
        "stringBits(\"Chocoate\")",
        "stringBits(\"pi\")",
        "stringBits(\"Hello Kitten\")",
        "stringBits(\"hxaxpxpxy\")",
    };

    static final String[] expectedResults = {
        "Hlo",
        "H",
        "Hello",
        "HHH",
        "",
        "Getns",
        "Coot",
        "p",
        "HloKte",
        "happy",
    };

    public static final void Validate(boolean printSuccess)
    {
        final String[] resultsArray = {
            StringBits.stringBits("Hello"),
            StringBits.stringBits("Hi"),
            StringBits.stringBits("Heeololeo"),
            StringBits.stringBits("HiHiHi"),
            StringBits.stringBits(""),
            StringBits.stringBits("Greetings"),
            StringBits.stringBits("Chocoate"),
            StringBits.stringBits("pi"),
            StringBits.stringBits("Hello Kitten"),
            StringBits.stringBits("hxaxpxpxy"),
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
