public class ArabictoRoman {
    public String ConvertArabicToRoman (int value, int dec) {
        if (dec == 0) {
            switch (value) {
            case 1:
                return "I";
            case 2:
                return "II";
            case 3:
                return "III";
            case 4:
                return "IV";
            case 5:
                return "V";
            case 6:
                return "VI";
            case 7:
                return "VII";
            case 8:
                return "VIII";
            case 9:
                return "IX";
            }
        }
        else if (dec == 1) {
            switch (value) {
                case 1:
                    return "X";
                case 2:
                    return "XX";
                case 3:
                    return "XXX";
                case 4:
                    return "XL";
                case 5:
                    return "L";
                case 6:
                    return "LX";
                case 7:
                    return "LXX";
                case 8:
                    return "LXXX";
                case 9:
                    return "LC";
            }
        }
        else if (dec == 2) {
            return "C";
        }
        return "";
    }
}
