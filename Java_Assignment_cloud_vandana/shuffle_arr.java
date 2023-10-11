/*
	Developer Name  : Shelake Kalyani
	Program Name    : Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it.
	Developed Date  : 11-10-2023
	Technology Used : JAVA
*/

import java.util.*;

public class shuffle_arr {
    public static void main(String[] args) {
        // Create an array
        Integer[] array = {1, 2, 3, 4, 5, 6, 7};

        // Convert the array to a list for shuffling
        List<Integer> list = Arrays.asList(array);

        // Shuffle the list
        Collections.shuffle(list);

        // Convert the shuffled list back to an array
        Integer[] shuffledArray = list.toArray(new Integer[0]);

        // Print the shuffled array
        System.out.println("Shuffled Array: " + Arrays.toString(shuffledArray));
    }
}
