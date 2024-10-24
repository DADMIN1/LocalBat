package String2.Testcases;
import String2.EndOther;

public class _EndOther
{
    static String[] testcaseStrings = {
        "endOther(\"Hiabc\", \"abc\")",
        "endOther(\"AbC\", \"HiaBc\")",
        "endOther(\"abc\", \"abXabc\")",
        "endOther(\"Hiabc\", \"abcd\")",
        "endOther(\"Hiabc\", \"bc\")",
        "endOther(\"Hiabcx\", \"bc\")",
        "endOther(\"abc\", \"abc\")",
        "endOther(\"xyz\", \"12xyz\")",
        "endOther(\"yz\", \"12xz\")",
        "endOther(\"Z\", \"12xz\")",
        "endOther(\"12\", \"12\")",
        "endOther(\"abcXYZ\", \"abcDEF\")",
        "endOther(\"ab\", \"ab12\")",
        "endOther(\"ab\", \"12ab\")",
    };

    static boolean[] expectedResults = {
        true,
        true,
        true,
        false,
        true,
        false,
        true,
        true,
        false,
        true,
        true,
        false,
        false,
        true,
    };

    public static void Validate(boolean printSuccess)
    {
        boolean[] resultsArray = {
            EndOther.endOther("Hiabc", "abc"),
            EndOther.endOther("AbC", "HiaBc"),
            EndOther.endOther("abc", "abXabc"),
            EndOther.endOther("Hiabc", "abcd"),
            EndOther.endOther("Hiabc", "bc"),
            EndOther.endOther("Hiabcx", "bc"),
            EndOther.endOther("abc", "abc"),
            EndOther.endOther("xyz", "12xyz"),
            EndOther.endOther("yz", "12xz"),
            EndOther.endOther("Z", "12xz"),
            EndOther.endOther("12", "12"),
            EndOther.endOther("abcXYZ", "abcDEF"),
            EndOther.endOther("ab", "ab12"),
            EndOther.endOther("ab", "12ab"),
        };

        boolean allTestsPassed = true;
        for (int i = 0; i < resultsArray.length; ++i)
        {
            if (resultsArray[i] != expectedResults[i])
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
