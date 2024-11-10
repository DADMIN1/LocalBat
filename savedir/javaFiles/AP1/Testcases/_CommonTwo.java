package AP1.Testcases;
import AP1.CommonTwo;

public final class _CommonTwo
{
    public static boolean printSuccesses = true;
    public static boolean getStacktraces = false;

    static final class TestResult {
        private int result;
        private RuntimeException caught = null;
        TestResult(String[] a, String[] b) {
            try { result = CommonTwo.commonTwo(a, b); }
            catch (RuntimeException exception) { caught = exception; }
        }
    }

    static final String[] testcaseStrings = {
        "commonTwo([\"a\", \"c\", \"x\"], [\"b\", \"c\", \"d\", \"x\"])",
        "commonTwo([\"a\", \"c\", \"x\"], [\"a\", \"b\", \"c\", \"x\", \"z\"])",
        "commonTwo([\"a\", \"b\", \"c\"], [\"a\", \"b\", \"c\"])",
        "commonTwo([\"a\", \"a\", \"b\", \"b\", \"c\"], [\"a\", \"b\", \"c\"])",
        "commonTwo([\"a\", \"a\", \"b\", \"b\", \"c\"], [\"a\", \"b\", \"b\", \"b\", \"c\"])",
        "commonTwo([\"a\", \"a\", \"b\", \"b\", \"c\"], [\"a\", \"b\", \"b\", \"c\", \"c\"])",
        "commonTwo([\"b\", \"b\", \"b\", \"b\", \"c\"], [\"a\", \"b\", \"b\", \"b\", \"c\"])",
        "commonTwo([\"a\", \"b\", \"c\", \"c\", \"d\"], [\"a\", \"b\", \"b\", \"c\", \"d\", \"d\"])",
        "commonTwo([\"a\", \"a\", \"b\", \"b\", \"c\"], [\"b\", \"b\", \"b\"])",
        "commonTwo([\"a\", \"a\", \"b\", \"b\", \"c\"], [\"c\", \"c\"])",
        "commonTwo([\"a\", \"a\", \"b\", \"b\", \"c\"], [\"b\", \"b\", \"b\", \"x\"])",
        "commonTwo([\"a\", \"a\", \"b\", \"b\", \"c\"], [\"b\", \"b\"])",
        "commonTwo([\"a\"], [\"a\", \"b\"])",
        "commonTwo([\"a\"], [\"b\"])",
        "commonTwo([\"a\", \"a\"], [\"b\", \"b\"])",
        "commonTwo([\"a\", \"b\"], [\"a\", \"b\"])",
    };

    static final int[] expectedResults = {
        2,
        3,
        3,
        3,
        3,
        3,
        2,
        4,
        1,
        1,
        1,
        1,
        1,
        0,
        0,
        2,
    };

    public static final boolean Validate()
    {
        final String[] a0 = {"a", "c", "x"}; final String[] b0 = {"b", "c", "d", "x"}; 
        final String[] a1 = {"a", "c", "x"}; final String[] b1 = {"a", "b", "c", "x", "z"}; 
        final String[] a2 = {"a", "b", "c"}; final String[] b2 = {"a", "b", "c"}; 
        final String[] a3 = {"a", "a", "b", "b", "c"}; final String[] b3 = {"a", "b", "c"}; 
        final String[] a4 = {"a", "a", "b", "b", "c"}; final String[] b4 = {"a", "b", "b", "b", "c"}; 
        final String[] a5 = {"a", "a", "b", "b", "c"}; final String[] b5 = {"a", "b", "b", "c", "c"}; 
        final String[] a6 = {"b", "b", "b", "b", "c"}; final String[] b6 = {"a", "b", "b", "b", "c"}; 
        final String[] a7 = {"a", "b", "c", "c", "d"}; final String[] b7 = {"a", "b", "b", "c", "d", "d"}; 
        final String[] a8 = {"a", "a", "b", "b", "c"}; final String[] b8 = {"b", "b", "b"}; 
        final String[] a9 = {"a", "a", "b", "b", "c"}; final String[] b9 = {"c", "c"}; 
        final String[] a10 = {"a", "a", "b", "b", "c"}; final String[] b10 = {"b", "b", "b", "x"}; 
        final String[] a11 = {"a", "a", "b", "b", "c"}; final String[] b11 = {"b", "b"}; 
        final String[] a12 = {"a"}; final String[] b12 = {"a", "b"}; 
        final String[] a13 = {"a"}; final String[] b13 = {"b"}; 
        final String[] a14 = {"a", "a"}; final String[] b14 = {"b", "b"}; 
        final String[] a15 = {"a", "b"}; final String[] b15 = {"a", "b"}; 

        final TestResult[] results = {
            new TestResult(a0, b0),
            new TestResult(a1, b1),
            new TestResult(a2, b2),
            new TestResult(a3, b3),
            new TestResult(a4, b4),
            new TestResult(a5, b5),
            new TestResult(a6, b6),
            new TestResult(a7, b7),
            new TestResult(a8, b8),
            new TestResult(a9, b9),
            new TestResult(a10, b10),
            new TestResult(a11, b11),
            new TestResult(a12, b12),
            new TestResult(a13, b13),
            new TestResult(a14, b14),
            new TestResult(a15, b15),
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
            if (results[i].result != expectedResults[i]) {
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
