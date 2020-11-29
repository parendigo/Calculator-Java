public class Calculation {
    public int makeCalc(int digit1, int sign, int digit2) {
        switch (sign) {
            case 42:
                return(digit1 * digit2);
            case 43:
                return(digit1 + digit2);
            case 45:
                return(digit1 - digit2);
            case 47:
                if (digit2 == 0) {
                    System.err.println("You can not divide by zero");
                    System.exit(0);
                }
                return (digit1 / digit2);
        }
        return 0;
    }
}
