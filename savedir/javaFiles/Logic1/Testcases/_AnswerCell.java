package Logic1.Testcases;
import Logic1.AnswerCell;

public class _AnswerCell
{
    static String[] testcaseStrings = {
        "answerCell(false, false, false)",
        "answerCell(false, false, true)",
        "answerCell(true, false, false)",
        "answerCell(true, true, false)",
        "answerCell(false, true, false)",
        "answerCell(true, true, true)",
    };

    static boolean[] expectedResults = {
        true,
        false,
        false,
        true,
        true,
        false,
    };

    public static void Validate(boolean printSuccess)
    {
        boolean[] resultsArray = {
            AnswerCell.answerCell(false, false, false),
            AnswerCell.answerCell(false, false, true),
            AnswerCell.answerCell(true, false, false),
            AnswerCell.answerCell(true, true, false),
            AnswerCell.answerCell(false, true, false),
            AnswerCell.answerCell(true, true, true),
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
