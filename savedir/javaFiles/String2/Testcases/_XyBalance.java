package String2.Testcases;
import String2.XyBalance;

public final class _XyBalance
{
    static final String[] testcaseStrings = {
        "xyBalance(\"aaxbby\")",
        "xyBalance(\"aaxbb\")",
        "xyBalance(\"yaaxbb\")",
        "xyBalance(\"yaaxbby\")",
        "xyBalance(\"xaxxbby\")",
        "xyBalance(\"xaxxbbyx\")",
        "xyBalance(\"xxbxy\")",
        "xyBalance(\"xxbx\")",
        "xyBalance(\"bbb\")",
        "xyBalance(\"bxbb\")",
        "xyBalance(\"bxyb\")",
        "xyBalance(\"xy\")",
        "xyBalance(\"y\")",
        "xyBalance(\"x\")",
        "xyBalance(\"\")",
        "xyBalance(\"yxyxyxyx\")",
        "xyBalance(\"yxyxyxyxy\")",
        "xyBalance(\"12xabxxydxyxyzz\")",
    };

    static final boolean[] expectedResults = {
        true,
        false,
        false,
        true,
        true,
        false,
        true,
        false,
        true,
        false,
        true,
        true,
        true,
        false,
        true,
        false,
        true,
        true,
    };

    public static final void Validate(boolean printSuccess)
    {
        final boolean[] resultsArray = {
            XyBalance.xyBalance("aaxbby"),
            XyBalance.xyBalance("aaxbb"),
            XyBalance.xyBalance("yaaxbb"),
            XyBalance.xyBalance("yaaxbby"),
            XyBalance.xyBalance("xaxxbby"),
            XyBalance.xyBalance("xaxxbbyx"),
            XyBalance.xyBalance("xxbxy"),
            XyBalance.xyBalance("xxbx"),
            XyBalance.xyBalance("bbb"),
            XyBalance.xyBalance("bxbb"),
            XyBalance.xyBalance("bxyb"),
            XyBalance.xyBalance("xy"),
            XyBalance.xyBalance("y"),
            XyBalance.xyBalance("x"),
            XyBalance.xyBalance(""),
            XyBalance.xyBalance("yxyxyxyx"),
            XyBalance.xyBalance("yxyxyxyxy"),
            XyBalance.xyBalance("12xabxxydxyxyzz"),
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
