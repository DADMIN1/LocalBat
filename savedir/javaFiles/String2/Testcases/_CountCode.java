package String2.Testcases;
import String2.CountCode;

public final class _CountCode
{
    static final String[] testcaseStrings = {
        "countCode(\"aaacodebbb\")",
        "countCode(\"codexxcode\")",
        "countCode(\"cozexxcope\")",
        "countCode(\"cozfxxcope\")",
        "countCode(\"xxcozeyycop\")",
        "countCode(\"cozcop\")",
        "countCode(\"abcxyz\")",
        "countCode(\"code\")",
        "countCode(\"ode\")",
        "countCode(\"c\")",
        "countCode(\"\")",
        "countCode(\"AAcodeBBcoleCCccoreDD\")",
        "countCode(\"AAcodeBBcoleCCccorfDD\")",
        "countCode(\"coAcodeBcoleccoreDD\")",
    };

    static final int[] expectedResults = {
        1,
        2,
        2,
        1,
        1,
        0,
        0,
        1,
        0,
        0,
        0,
        3,
        2,
        3,
    };

    public static final void Validate(boolean printSuccess)
    {
        final int[] resultsArray = {
            CountCode.countCode("aaacodebbb"),
            CountCode.countCode("codexxcode"),
            CountCode.countCode("cozexxcope"),
            CountCode.countCode("cozfxxcope"),
            CountCode.countCode("xxcozeyycop"),
            CountCode.countCode("cozcop"),
            CountCode.countCode("abcxyz"),
            CountCode.countCode("code"),
            CountCode.countCode("ode"),
            CountCode.countCode("c"),
            CountCode.countCode(""),
            CountCode.countCode("AAcodeBBcoleCCccoreDD"),
            CountCode.countCode("AAcodeBBcoleCCccorfDD"),
            CountCode.countCode("coAcodeBcoleccoreDD"),
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
