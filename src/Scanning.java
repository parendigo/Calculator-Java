import java.util.Scanner;

public class Scanning {
    String str;
    char[] strArray;
    public int ScannInput(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your expression:\n");
        str = in.nextLine();
        if (str.equalsIgnoreCase("!exit")) {
            return 1;
        }
        else if (str.equalsIgnoreCase("!info")) {
            return 2;
        }
        strArray = str.toCharArray();
        return 0;
    }
}
