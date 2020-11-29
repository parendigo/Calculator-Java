public class Sign {
    int i = -1;
    int sign;
    public int FindSign(char[] strArray, String str) {
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
