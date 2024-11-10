package String2.Testcases;
import String2.PlusOut;

public final class _PlusOut
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private String result;
        private RuntimeException caught = null;
        TestResult(String str, String word) {
            try { result = PlusOut.plusOut(str, word); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
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

    static final String[] expectedResults = {
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

    public static final boolean Validate()
    {
        final TestResult[] results = {
            new TestResult("12xy34", "xy"),
            new TestResult("12xy34", "1"),
            new TestResult("12xy34xyabcxy", "xy"),
            new TestResult("abXYabcXYZ", "ab"),
            new TestResult("abXYabcXYZ", "abc"),
            new TestResult("abXYabcXYZ", "XY"),
            new TestResult("abXYxyzXYZ", "XYZ"),
            new TestResult("--++ab", "++"),
            new TestResult("aaxxxxbb", "xx"),
            new TestResult("123123", "3"),
        };

        boolean allTestsPassed = true;
        boolean prevTestPassed = false;
        for (int i = 0; i < results.length; ++i)
        {
            if (results[i].caught != null) {
                allTestsPassed = false;
                if(prevTestPassed) { System.out.println(); prevTestPassed = false; }
                System.out.print("[!] #"+(i+1)+" - ");
                System.out.println(testcaseStrings[i]+" - Failed! [EXCEPTION]");
                System.out.println(results[i].caught.getClass().getName());
                System.out.println(results[i].caught.getMessage());
                if(getStacktraces) results[i].caught.printStackTrace();
                System.out.println(); continue;
            }
            if (!results[i].result.equals(expectedResults[i])) {
                allTestsPassed = false;
                if(prevTestPassed) { System.out.println(); prevTestPassed = false; }
                System.out.print("[x] #"+(i+1)+" - ");
                System.out.println(testcaseStrings[i]+" - Failed!");
                System.out.println("    received: "+results[i].result);
                System.out.println("    expected: "+expectedResults[i]);
                System.out.println();
            } else if (printSuccesses) {
                prevTestPassed = true;
                System.out.println("[✓] #"+(i+1)+" - "+testcaseStrings[i]);
            }
        }
        if (allTestsPassed) System.out.println("\n ✓✓✓  ~ All tests passed. ~  ✓✓✓");
        System.out.println();
        return allTestsPassed;
    }
}
