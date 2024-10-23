package Logic1.Testcases;
import Logic1.AlarmClock;

public class _AlarmClock
{
    static String[] testcaseStrings = {
        "alarmClock(1, false)",
        "alarmClock(5, false)",
        "alarmClock(0, false)",
    };

    static String[] expectedResults = {
        "7:00",
        "7:00",
        "10:00",
    };

    public static void Validate(boolean printSuccess)
    {
        String[] resultsArray = {
            AlarmClock.alarmClock(1, false),
            AlarmClock.alarmClock(5, false),
            AlarmClock.alarmClock(0, false),
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
