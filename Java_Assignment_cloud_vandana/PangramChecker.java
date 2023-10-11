/*
	Developer Name  : Shelake Kalyani
	Program Name    : Check if the input is pangram or not. (A pangram is a sentence that contains all the alphabets from A to Z)
	Developed Date  : 11-10-2023
	Technology Used : JAVA
*/

import java.util.*;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence to check if it's a pangram: ");
        String inputSentence = scanner.nextLine();

        if (isPangram(inputSentence)) {
            System.out.println("It's a pangram!");
        } else {
            System.out.println("It's not a pangram.");
        }
    }

    public static boolean isPangram(String sentence) {
        Set<Character> alphabetSet = new HashSet<>();
        String lowerCaseSentence = sentence.toLowerCase();

        for (int i = 0; i < lowerCaseSentence.length(); i++) {
            char c = lowerCaseSentence.charAt(i);
            if (Character.isLetter(c)) {
                alphabetSet.add(c);
            }
        }

        return alphabetSet.size() == 26;
    }
}
