package algoritma_3;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConvertCountString {
    public static void main(String[] args) {
        String input = "dani Maulana";
        input = input.replaceAll(" ", "");

        StringBuilder stringBuilder = new StringBuilder();
        List<String> uniqueChar = Arrays.stream(input.split("")).distinct().toList();

        for (String character : uniqueChar) {
            Pattern pattern = Pattern.compile(character);
            Matcher matcher = pattern.matcher(input);
            long count = matcher.results().count();
            if (count > 1) {
                stringBuilder.append(count).append(character.toLowerCase());
            } else {
                stringBuilder.append(character.toLowerCase());
            }
        }

        System.out.println(stringBuilder);
    }
}
