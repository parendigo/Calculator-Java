import java.lang.String;

public class RomanNumbers {
    int i = -1;
    int d = 0;
    int flag = 0;
    int curNumber = 0;
    int prevNumber = 0;
    public int makeRTA(char[] strArray, String str, int[] Digits) {
        while (++i < str.length()) {
            if (strArray[i] == 'I' || strArray[i] == 'V' || strArray[i] == 'X') {
                flag = 1;
                switch (strArray[i]) {
                    case 'I':
                        curNumber = 1;
                        break;
                    case 'V':
                        curNumber = 5;
                        break;
                    case 'X':
                        curNumber = 10;
                        break;
                }
                if (curNumber > prevNumber) {
                    prevNumber = curNumber - prevNumber;
                }
                else
                    prevNumber = curNumber + prevNumber;
                if (prevNumber > 10) {
                    System.err.println("Max value of each number is X(10)");
                    return 1;
                }
            }
            if (strArray[i] != 'I' && strArray[i] != 'V' && strArray[i] != 'X' && strArray[i] != ' ' && flag == 1) {
                flag = 0;
                if (d > 0) {
                    System.err.println("Too many numbers");
                    return 1;
                }
                Digits[d++] = prevNumber;
                curNumber = 0;
                prevNumber = 0;
            }
            if (prevNumber != 0 && i + 1 == str.length()) {
                Digits[d] = prevNumber;
            }
        }
        return 0;
    }
}
