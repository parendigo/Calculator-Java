import java.util.regex.*;

public class DigitsAndSign {
    int i = -1;
    int[] Digits = new int[3];
    int sign = 0;
    public int makeDAS(char[] strArray, String str) {
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
                    System.err.println("Error: 1 < number< 10");
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
        i = -1;
        while (++i < str.length()) {
            if (sign == 0 && (strArray[i] == '+' || strArray[i] == '-' || strArray[i] == '/' || strArray[i] == '*')) {
                sign = strArray[i];
            }
            else if (sign != 0 && (strArray[i] == '+' || strArray[i] == '-'
                    || strArray[i] == '/' || strArray[i] == '*')) {
                System.err.println("Sign error");
                return 1;
            }
        }
        return 0;
    }
}
