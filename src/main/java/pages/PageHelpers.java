package pages;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PageHelpers {
    public static int extractNumber(String input) {
        Pattern pattern = Pattern.compile("^\\d+");
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            String numberString = matcher.group();
            return Integer.parseInt(numberString);
        }
        return -1;
    }
}
