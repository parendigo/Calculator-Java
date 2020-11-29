public class Main {
    public static void main(String[] args) {
        int i;
        int[] Digits = new int[3];
        System.out.println("*Simple Calculator*\nFor more info: [!Info]");
        while (true) {
            Scanning pScan = new Scanning();
            if ((i = pScan.ScannInput()) == 1) {
                break;
            }
            else if (i == 2) {
                System.out.println("Input format: [1(I) < number < 10(X)][sign][1(I)< number < 10(X)]\nSigns: [-],[+],[*],[/]\nExit program: [!Exit]");
            }
            else {
                Valid pVal = new Valid();
                ArabicNumbers pDAS = new ArabicNumbers();
                RomanNumbers pRTA = new RomanNumbers();
                Result res = new Result();
                Calculation calc = new Calculation();
                Sign sign = new Sign();
                if (pVal.BasicValid(pScan.strArray) == 0) {
                    if (sign.FindSign(pScan.strArray, pScan.str) == 0) {
                        if (pScan.str.indexOf('I') != -1 || pScan.str.indexOf('V') != -1 || pScan.str.indexOf('X') != -1) {
                            if (pRTA.makeRTA(pScan.strArray, pScan.str, Digits) == 0) {
                                res.printResult(calc.makeCalc(Digits[0], sign.sign, Digits[1]), 2);
                            }
                        }
                        else if (pDAS.makeDAS(pScan.str, Digits) == 0) {
                            res.printResult(calc.makeCalc(Digits[0], sign.sign, Digits[1]), 1);
                        }
                    }
                }
            }
        }
    }
}