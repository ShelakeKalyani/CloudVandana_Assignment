/*
	Developer Name  : Shelake Kalyani
	Program Name    : Enter a Roman Number as input and convert it to an integer. (Example: IX = 9)
	Developed Date  : 11-10-2023
	Technology Used : JAVA
*/


import java.util.*;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Roman Numeral: ");
        String romanInput = scanner.nextLine();

        try {
            int integerValue = romanToInt(romanInput);
            System.out.println("The integer value of " + romanInput + " is: " + integerValue);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid Roman Numeral");
        }
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int total = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = romanMap.get(s.charAt(i));
            if (currentValue >= prevValue) {
                total += currentValue;
            } else {
                total -= currentValue;
            }
            prevValue = currentValue;
        }

        return total;
    }
}
