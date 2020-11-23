import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i = 0;
        System.out.println("*Simple Calculator*\nFor more info: [!Info]");
        while (true) {
            char strArray[];
            Scanning pScan = new Scanning();
            if ((i = pScan.ScannInput()) == 1) {
                break;
            }
            else if (i == 2) {
                System.out.println("Input format: [1<number<10][sign][1<number<10]\n" +
                        "Signs: [-],[+],[*],[/]\nExit program: [!Exit]");
            }
            else {
                Valid pVal = new Valid();
                if (pVal.BasicValid(pScan.strArray) == 0) {
                    DigitsAndSign pDAS = new DigitsAndSign();
                    if (pDAS.makeDAS(pScan.strArray, pScan.str) == 0) {
                        Calculation calc = new Calculation();
                        calc.makeCalc(pDAS.Digits[0], pDAS.sign, pDAS.Digits[1]);
                    }
                }
            }
        }
    }
}