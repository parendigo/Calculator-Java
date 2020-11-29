public class Result {
    public void printResult(int value, int how) {
        if (how == 1) {
            System.out.println("Result: " + value);
        }
        else if (how == 2) {
            System.out.print("Result: ");
            if (value == 0) {
                System.out.println('N');
            }
            else {
                if (value < 0) {
                    System.out.print('-');
                    value = -value;
                }
                int i = 0;
                printRecurs(value, i);
                System.out.println();
            }
        }
    }
    public void printRecurs(int value, int i) {
        ArabictoRoman number = new ArabictoRoman();
        if (value >= 10) {
            i++;
            printRecurs(value / 10, i--);
        }
        System.out.print(number.ConvertArabicToRoman(value % 10, i));
    }
}
