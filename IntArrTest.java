import java.util.*;

public class IntArrTest extends IntArrays {

  public static void main(String[] args) {

    // int[] test = fillArray(10, 50, 100);
    // print(test, 5, test.length - 1);

    // // int[] b = { 1, 2, 3 };
    // // System.out.println(equals(a, b));

    // int[] c = { 1, 2, 3 };
    // int[] b = copy(c);
    // print(b, 0, b.length - 1);

    // int[] f = { 1, 2, 3 };
    // swap(f, 2, 1);
    // System.out.println(f[2]);
    // System.out.println("-----------------------------------");

    // int[] bubbleTest = { 5, 2, 7, 3, 7 };
    // bubbleSort(bubbleTest);
    // print(bubbleTest, 0, bubbleTest.length - 1);
    // System.out.println("-------------");
    // System.out.println(binarySearch(bubbleTest, 504));
    // System.out.println("Done");
    // // int[] testing = { 1, 2 };
    // // System.out.println(binarySearch(testing, 3));

    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter the size of your first array!");
    int arrayASize = scanner.nextInt();
    System.out.println("Please enter the lowest number in your first array!");
    int alowest = scanner.nextInt();
    System.out.println("Please enter the highest number in your first array!");
    int ahighest = scanner.nextInt();
    int[] arrayA = fillArray(arrayASize, alowest, ahighest);
    print(arrayA, 0, arrayA.length - 1);

    int[] arrayB = copy(arrayA);
    print(arrayB, 0, arrayB.length - 1);

    int[] arrayC = (copy(arrayA));
    System.out.println(arrayC == arrayB);
    System.out.println(equals(arrayC, arrayB));

    bubbleSort(arrayA);
    System.out.println("---------------------");
    print(arrayA, 0, arrayA.length - 1);

    System.out.println("Enter a number that is not in array A!");
    System.out.println(sequentialSearch(arrayA, scanner.nextInt()));

    System.out.println("Enter a number that is in array A!");
    System.out.println(sequentialSearch(arrayA, scanner.nextInt()));

    System.out.println("Enter a number that is not in array A! This will be found with a binary search");
    System.out.println(sequentialSearch(arrayA, scanner.nextInt()));

    System.out.println("Enter a number that is in array A! This will be found with a binary search");
    System.out.println(sequentialSearch(arrayA, scanner.nextInt()));

  }

}
