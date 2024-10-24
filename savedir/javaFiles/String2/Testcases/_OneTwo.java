package String2.Testcases;
import String2.OneTwo;

public class _OneTwo
{
    static String[] testcaseStrings = {
        "oneTwo(\"abc\")",
        "oneTwo(\"tca\")",
        "oneTwo(\"tcagdo\")",
        "oneTwo(\"chocolate\")",
        "oneTwo(\"1234567890\")",
        "oneTwo(\"xabxabxabxabxabxabxab\")",
        "oneTwo(\"abcdefx\")",
        "oneTwo(\"abcdefxy\")",
        "oneTwo(\"abcdefxyz\")",
        "oneTwo(\"\")",
        "oneTwo(\"x\")",
        "oneTwo(\"xy\")",
        "oneTwo(\"xyz\")",
        "oneTwo(\"abcdefghijklkmnopqrstuvwxyz1234567890\")",
        "oneTwo(\"abcdefghijklkmnopqrstuvwxyz123456789\")",
        "oneTwo(\"abcdefghijklkmnopqrstuvwxyz12345678\")",
    };

    static String[] expectedResults = {
        "bca",
        "cat",
        "catdog",
        "hocolctea",
        "231564897",
        "abxabxabxabxabxabxabx",
        "bcaefd",
        "bcaefd",
        "bcaefdyzx",
        "",
        "",
        "",
        "yzx",
        "bcaefdhigkljmnkpqostrvwuyzx231564897",
        "bcaefdhigkljmnkpqostrvwuyzx231564897",
        "bcaefdhigkljmnkpqostrvwuyzx231564",
    };

    public static void Validate(boolean printSuccess)
    {
        String[] resultsArray = {
            OneTwo.oneTwo("abc"),
            OneTwo.oneTwo("tca"),
            OneTwo.oneTwo("tcagdo"),
            OneTwo.oneTwo("chocolate"),
            OneTwo.oneTwo("1234567890"),
            OneTwo.oneTwo("xabxabxabxabxabxabxab"),
            OneTwo.oneTwo("abcdefx"),
            OneTwo.oneTwo("abcdefxy"),
            OneTwo.oneTwo("abcdefxyz"),
            OneTwo.oneTwo(""),
            OneTwo.oneTwo("x"),
            OneTwo.oneTwo("xy"),
            OneTwo.oneTwo("xyz"),
            OneTwo.oneTwo("abcdefghijklkmnopqrstuvwxyz1234567890"),
            OneTwo.oneTwo("abcdefghijklkmnopqrstuvwxyz123456789"),
            OneTwo.oneTwo("abcdefghijklkmnopqrstuvwxyz12345678"),
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
