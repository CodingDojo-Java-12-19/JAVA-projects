import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class PuzzleJava {
    public static void main(String[] args) {
        PuzzleJava.iterateArr();
        PuzzleJava.shuffleOver5();
        // PuzzleJava.
        PuzzleJava.generateRandom();
        // PuzzleJava.
        // PuzzleJava.
        // PuzzleJava.
        // PuzzleJava.
        
}

//  Create an array with the following values: 3,5,1,2,7,9,8,13,25,32. 
// Print the sum of all numbers in the array. Also have the function return 
// an array that only includes numbers that are greater than 10 (e.g. when you pass the array above, 
// it should return an array with the values of 13,25,32)
public static void iterateArr() {
    int[] arr = {3,5,1,2,7,9,8,13,25,32};
    ArrayList<Integer> newArr = new ArrayList<Integer>();
    int sum = 0;
    for(int i=0; i<arr.length; i++) {
        sum += arr[i];
        if(arr[i] > 10) {
            newArr.add(arr[i]);
        }
    }
    System.out.println(sum);
    System.out.println(newArr);
}
// ● Create an array with the following values: Nancy, Jinichi, Fujibayashi, Momochi, Ishikawa. 
// Shuffle the array and print the name of each person. Have the method also return an array 
// with names that are longer than 5 characters.
public static void shuffleOver5() {
    ArrayList<String> names = new ArrayList<String>();
    ArrayList<String> longerThan5 = new ArrayList<String>();
    names.add("Nancy");
    names.add("Jinichi");
    names.add("Fujibayashi"); 
    names.add("Momochi");
    names.add("Ishikawa"); 
    Collections.shuffle(names);
    for(int i=0; i<names.size(); i++) {
        System.out.println(names.get(i));
        if(names.get(i).length() > 5 ) {
            longerThan5.add(names.get(i));
        }
    }
    System.out.println(longerThan5);
}

// ● Create an array that contains all 26 letters of the alphabet (this array must have 26 values). 
// Shuffle the array and, after shuffling, display the last letter from the array.
// Have it also display the first letter of the array. If the first letter in the array is a vowel,
// have it display a message.
// public static void firstAndLast() {
//     String alpha = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "a", "j", "a", "k"};

// }


// To shuffle a collection, you can use the shuffle method of the Collections class. 
// Collections Class documentation
// ● Generate and return an array with 10 random numbers between 55-100.
public static void generateRandom() {
    ArrayList<Integer> randomArr = new ArrayList<Integer>();
    int i = 0;
    Random rand = new Random();
    while (i < 10) {
        i++;
        randomArr.add(rand.nextInt(45) + 55);
    }
    System.out.println(randomArr);
}

// To get a random integer, you can use the nextInt method of the Random class. Random Class documentation
// ● Generate and return an array with 10 random numbers between 55-100 and have it be sorted 
// (showing the smallest number in the beginning). Display all the numbers in the array.
// Next, display the minimum value in the array as well as the maximum value.
// To sort a collection, you can use the sort method of the Collections class.
// ● Create a random string that is 5 characters long.

// ● Generate an array with 10 random strings that are each 5 characters long

}