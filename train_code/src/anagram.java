import java.util.Arrays;
import java.util.Scanner;

/*
 * Write a function that takes two words (String) and returns
 * true or false (Bool) depending on whether/ or not they are anagrams.
 * - An Anagram consists of forming a word by rearranging ALL of them
 * the letters of another initial word.
 * - It is NOT necessary to check that both words exist.
 * - Two exactly the same words are not an anagram.
 */
public class anagram {
    public static boolean isAnagram(String wordOne, String wordTwo){
        String wordOneLower = wordOne.toLowerCase();
        String wordTwoLower = wordTwo.toLowerCase();

        char[] arrayWordOne = wordOneLower.toCharArray();
        char[] arrayWordTwo = wordTwoLower.toCharArray();

        Arrays.sort(arrayWordOne);
        Arrays.sort(arrayWordTwo);

        String wordOrderOne = new String(arrayWordOne);
        String wordOrderTwo = new String(arrayWordTwo);

        return wordOrderOne.equals(wordOrderTwo);
    }
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the first word: ");
        String wordOne = scanner.nextLine();
        System.out.println("Input the second word:");
        String wordTwo = scanner.nextLine();

        boolean isAnagram = isAnagram(wordOne,wordTwo);

        if (isAnagram){
            System.out.println(wordOne+" is anagram from "+ wordTwo);
        }
        else{
            System.out.println(wordOne + " is not anagram from " + wordTwo);
        }
        scanner.close();
    }
}