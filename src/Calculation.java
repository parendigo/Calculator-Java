public class Calculation {
    public void makeCalc(int digit1, int sign, int digit2) {
        switch (sign) {

            case 42:
                System.out.println("Result:\n" + (digit1 * digit2));
                break;
            case 43:
                System.out.println("Result:\n" + (digit1 + digit2));
                break;
            case 45:
                System.out.println("Result:\n" + (digit1 - digit2));
                break;
            case 47:
                System.out.println("Result:\n" + (digit1 / digit2));
                break;
            default:
                System.err.println("Calculation error");
        }
    }
}
