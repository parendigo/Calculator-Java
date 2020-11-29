import java.util.regex.*;

public class ArabicNumbers {
    int i = -1;
    public int makeDAS(String str, int[] Digits) {
        Pattern dig=Pattern.compile("[0-9]+[0-9]?");
        Matcher matcher1=dig.matcher(str);
        while (matcher1.find()) {
            if (i > 0) {
                System.err.println("Error: amount of numbers. Input 2 numbers.");
                return 1;
            }
            try {
                Digits[++i] = new Integer(matcher1.group());
                if (Digits[i] < 1 || Digits[i] > 10) {
                    System.err.println("Use numbers between 1 and 10");
                    return 1;
                }
            }catch (NumberFormatException e) {
                System.err.println("Value error");
                return 1;
            }
        }
        if (i != 1) {
            System.err.println("Error: amount of numbers. Input 2 numbers.");
            return 1;
        }
        return 0;
    }
}
