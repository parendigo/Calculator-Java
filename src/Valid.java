import java.util.Scanner;

public class Valid {
    int i = -1;
    public int BasicValid(char[] strArray) {
        while (++i != strArray.length) {
            if ((strArray[i] < 48 || strArray[i] > 57) && strArray[i] != ' ' && strArray[i] != '+' &&
                        strArray[i] != '-' && strArray[i] != '/' && strArray[i] != '*') {
                    System.err.println("Error:input format");
                    return 1;
            }
        }
        return 0;
    }
}
