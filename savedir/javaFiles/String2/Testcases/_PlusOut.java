package String2.Testcases;
import String2.PlusOut;

public class _PlusOut
{
    static String[] testcaseStrings = {
        "plusOut(\"12xy34\", \"xy\")",
        "plusOut(\"12xy34\", \"1\")",
        "plusOut(\"12xy34xyabcxy\", \"xy\")",
        "plusOut(\"abXYabcXYZ\", \"ab\")",
        "plusOut(\"abXYabcXYZ\", \"abc\")",
        "plusOut(\"abXYabcXYZ\", \"XY\")",
        "plusOut(\"abXYxyzXYZ\", \"XYZ\")",
        "plusOut(\"--++ab\", \"++\")",
        "plusOut(\"aaxxxxbb\", \"xx\")",
        "plusOut(\"123123\", \"3\")",
    };

    static String[] expectedResults = {
        "++xy++",
        "1+++++",
        "++xy++xy+++xy",
        "ab++ab++++",
        "++++abc+++",
        "++XY+++XY+",
        "+++++++XYZ",
        "++++++",
        "++xxxx++",
        "++3++3",
    };

    public static void Validate(boolean printSuccess)
    {
        String[] resultsArray = {
            PlusOut.plusOut("12xy34", "xy"),
            PlusOut.plusOut("12xy34", "1"),
            PlusOut.plusOut("12xy34xyabcxy", "xy"),
            PlusOut.plusOut("abXYabcXYZ", "ab"),
            PlusOut.plusOut("abXYabcXYZ", "abc"),
            PlusOut.plusOut("abXYabcXYZ", "XY"),
            PlusOut.plusOut("abXYxyzXYZ", "XYZ"),
            PlusOut.plusOut("--++ab", "++"),
            PlusOut.plusOut("aaxxxxbb", "xx"),
            PlusOut.plusOut("123123", "3"),
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
