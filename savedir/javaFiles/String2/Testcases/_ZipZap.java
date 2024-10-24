package String2.Testcases;
import String2.ZipZap;

public class _ZipZap
{
    static String[] testcaseStrings = {
        "zipZap(\"zipXzap\")",
        "zipZap(\"zopzop\")",
        "zipZap(\"zzzopzop\")",
        "zipZap(\"zibzap\")",
        "zipZap(\"zip\")",
        "zipZap(\"zi\")",
        "zipZap(\"z\")",
        "zipZap(\"\")",
        "zipZap(\"zzp\")",
        "zipZap(\"abcppp\")",
        "zipZap(\"azbcppp\")",
        "zipZap(\"azbcpzpp\")",
    };

    static String[] expectedResults = {
        "zpXzp",
        "zpzp",
        "zzzpzp",
        "zibzp",
        "zp",
        "zi",
        "z",
        "",
        "zp",
        "abcppp",
        "azbcppp",
        "azbcpzp",
    };

    public static void Validate(boolean printSuccess)
    {
        String[] resultsArray = {
            ZipZap.zipZap("zipXzap"),
            ZipZap.zipZap("zopzop"),
            ZipZap.zipZap("zzzopzop"),
            ZipZap.zipZap("zibzap"),
            ZipZap.zipZap("zip"),
            ZipZap.zipZap("zi"),
            ZipZap.zipZap("z"),
            ZipZap.zipZap(""),
            ZipZap.zipZap("zzp"),
            ZipZap.zipZap("abcppp"),
            ZipZap.zipZap("azbcppp"),
            ZipZap.zipZap("azbcpzpp"),
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
