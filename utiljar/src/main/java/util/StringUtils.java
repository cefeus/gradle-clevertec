package util;

import java.math.BigDecimal;
import java.util.regex.Pattern;

public class StringUtils {

    final static String Digits     = "(\\p{Digit}+)";
    final static String Exp        = "[eE][+-]?"+Digits;
    final static String fpRegex    =
            ("[\\x00-\\x20]*[+-]?(NaN|Infinity|(("+Digits+"(\\.)?("+Digits+"?)("+Exp+")?)|(\\.("+Digits+")("+Exp+")?)|[\\x00-\\x20]*))");

    public static boolean isPositiveNumber(String str) {
        if (Pattern.matches(fpRegex, str)) {
            return new BigDecimal(str).signum() != -1;
        }
        else {
            throw new IllegalArgumentException("Passed string isn't a number");
        }
    }

}
