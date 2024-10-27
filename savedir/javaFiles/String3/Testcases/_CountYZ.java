package String3.Testcases;
import String3.CountYZ;

public final class _CountYZ
{
    static final String[] testcaseStrings = {
        "countYZ(\"fez day\")",
        "countYZ(\"day fez\")",
        "countYZ(\"day fyyyz\")",
        "countYZ(\"day yak\")",
        "countYZ(\"day:yak\")",
        "countYZ(\"!!day--yaz!!\")",
        "countYZ(\"yak zak\")",
        "countYZ(\"DAY abc XYZ\")",
        "countYZ(\"aaz yyz my\")",
        "countYZ(\"y2bz\")",
        "countYZ(\"zxyx\")",
    };

    static final int[] expectedResults = {
        2,
        2,
        2,
        1,
        1,
        2,
        0,
        2,
        3,
        2,
        0,
    };

    public static final void Validate(boolean printSuccess)
    {
        final int[] resultsArray = {
            CountYZ.countYZ("fez day"),
            CountYZ.countYZ("day fez"),
            CountYZ.countYZ("day fyyyz"),
            CountYZ.countYZ("day yak"),
            CountYZ.countYZ("day:yak"),
            CountYZ.countYZ("!!day--yaz!!"),
            CountYZ.countYZ("yak zak"),
            CountYZ.countYZ("DAY abc XYZ"),
            CountYZ.countYZ("aaz yyz my"),
            CountYZ.countYZ("y2bz"),
            CountYZ.countYZ("zxyx"),
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
