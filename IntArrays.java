import java.util.*;

public class IntArrays {

  static Random rand = new Random();

  public static int[] fillArray(int Length, int Begin, int End) {

    int[] a = new int[Length];

    for (int i = 0; i < a.length; i++) {
      a[i] = rand.nextInt(End - Begin) + Begin;
    }

    return a;
  }

  public static void print(int arr[], int begin, int end) {

    for (int i = 0; i < end; begin++) {
      if (i < arr.length) {
        i = begin;
        System.out.print(arr[i] + " ");
      }
    }
    System.out.println();

  }

  public static boolean equals(int a[], int b[]) {

    for (int i = 0; i < a.length; i++) {
      if (a[i] != b[i])
        return false;
    }
    return true;
  }

  public static boolean isSortedA(int[] arr) {
    for (int i = 0; i < arr.length; i++) {

      if (arr[i] < arr[i] - 1) {

        return false;

      } // end of if

    } // end of for loop

    return true;
  }

  public static boolean isSortedD(int[] arr) {
    for (int i = 0; i < arr.length; i++) {

      if (arr[i] > arr[i] - 1) {

        return false;

      } // end of if

    } // end of for loop

    return true;
  }

  public static int[] copy(int[] arr1) {
    int[] copy = new int[arr1.length];

    for (int i = 0; i < arr1.length; i++) {
      copy[i] = arr1[i];
    }

    return copy;
  }

  public static int sequentialSearch(int[] arr, int key) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == key) {
        return i;
      }
    }
    return -1;
  }

  public static void swap(int[] a, int i, int j) {
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;
  }

  public static void bubbleSort(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length; j++) {
        if (arr[j] > arr[i]) {
          swap(arr, j, i);
        }
      }

    }
  }

  public static int binarySearch(int[] arr, int key) {
    if (!isSortedA(arr)) {
      bubbleSort(arr);
    }

    int min = 0;
    int max = arr.length - 1;
    int mid = 0;

    while (max >= min) {
      mid = ((max + min) / 2);

      if (arr[mid] == key) {
        return mid;
      } else if (arr[mid] < key) {
        min = mid + 1;
      } else {
        max = mid - 1;
      }
    }
    return -1;

  }
}
