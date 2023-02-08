package algoritma_2;

public class ReverseString {
    public static void main(String[] args) {
        String input = "jatis";

        //using built in string builder
        StringBuilder stringBuilder =  new StringBuilder(input).reverse();
        System.out.println(stringBuilder);

        //using for loop
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length - 1 - i];
            chars[chars.length - 1 - i] = temp;
        }

        System.out.println(new String(chars));
    }
}
