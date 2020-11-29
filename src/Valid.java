public class Valid {
    int i = -1;
    int arabic = 0;
    int roman = 0;
    public int BasicValid(char[] strArray) {
        while (++i != strArray.length) {
            if ((strArray[i] < 48 || strArray[i] > 57) && strArray[i] != ' ' && strArray[i] != '+' &&
                        strArray[i] != '-' && strArray[i] != '/' && strArray[i] != '*' && strArray[i] != 'I' &&
                    strArray[i] != 'V' && strArray[i] != 'X') {
                    System.err.println("Error:input format");
                    return 1;
            }
            if (strArray[i] > 47 && strArray[i] < 58) {
                arabic = 1;
            }
            else if (strArray[i] == 'I' || strArray[i] == 'V' || strArray[i] == 'X') {
                roman = 1;
            }
            if (roman == 1 && arabic == 1) {
                System.err.println("Use only arabic or roman numbers");
                return 1;
            }
        }
        return 0;
    }
}