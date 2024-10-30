package String1;
import String1.Testcases._HelloName;

// https://codingbat.com/prob/p171896
// Difficulty: 103.0

public final class HelloName
{
    /* Given a string name, e.g. "Bob", 
    return a greeting of the form "Hello Bob!". */

    /*_______________________________
    |           Testcases            |
    |________________________________|
    | name       | expected (String) |
    | (String)   |                   |
    |____________|___________________|
    | "Bob"      | "Hello Bob!"      |
    | "Alice"    | "Hello Alice!"    |
    | "X"        | "Hello X!"        |
    | "Dolly"    | "Hello Dolly!"    |
    | "Alpha"    | "Hello Alpha!"    |
    | "Omega"    | "Hello Omega!"    |
    | "Goodbye"  | "Hello Goodbye!"  |
    | "ho ho ho" | "Hello ho ho ho!" |
    | "xyz!"     | "Hello xyz!!"     |
    | "Hello"    | "Hello Hello!"    |
    |____________|__________________*/

    public static final String helloName(String name)
    {
        return "";
    }

    public static final void main(String[] args) {
        _HelloName.Validate(true);  // pass 'false' to print failed tests only.
    }
}
