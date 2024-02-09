import java.util.Scanner;

public class StringReverse {
    public static String Reverse(String original) {
        char[] characters = original.toCharArray();
        int lengthArrayChar = characters.length;
        for(int i = 0;i < lengthArrayChar /2; i++){
            char temp = characters[i];
            characters[i] = characters[lengthArrayChar -1 -i];
            characters[lengthArrayChar - 1 - i] = temp;
        }
        return new String(characters);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("write string original");
        String original = scanner.nextLine();
        String reverse = Reverse(original);
        System.out.println("String original: " + original);
        System.out.println("String Reverse: " + reverse);
    }
}
