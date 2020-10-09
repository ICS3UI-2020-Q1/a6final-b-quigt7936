import java.util.Scanner;
/**
 * Compares two arrays
 * @author Thomas Quigley
 */
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // declare both arrays and the array length constant
    final int ARRAY_LENGTH = 5;
    int[] firstNumbers = new int[ARRAY_LENGTH];
    int[] secondNumbers = new int[ARRAY_LENGTH];

    // ask for the numbers in the first arrray
    System.out.println("Please enter the values for the first array:");
    for (int i = 0; i < ARRAY_LENGTH; i++) {
      firstNumbers[i] = input.nextInt();
    }

    // ask for the numbers in the second array
    System.out.println("Please enter the values for the second array:");
    for (int i = 0; i < ARRAY_LENGTH; i++) {
      secondNumbers[i] = input.nextInt();
    }

    // compares arrays, if the numbers are the same go onto the next pair of indexes, if not tell the user and end the program
    for (int i = 0; i < ARRAY_LENGTH; i++) {
      if (firstNumbers[i] != secondNumbers[i]) {
        System.out.println("These arrays are not the same");
        System.exit(0);
      }
    }

    // tell the user if the the arrays are the same    
    System.out.println("These arrays are the same");

  }
}
