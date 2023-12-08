package javalab;
import java.util.Scanner;
public class Quicksort {
    public static void swap(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partition(String[] arr, int first, int last) {
        String pivot = arr[first]; // Select the first element as the pivot
        int i = first;
        for (int j = first + 1; j <= last; j++) {
            if (arr[j].compareTo(pivot) < 0) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, first, i); // Swap the pivot with the element at i
        return i;
    }

    public static void quickSort(String[] arr, int first, int last) {
        if (first < last) {
            int pi = partition(arr, first, last);
            quickSort(arr, first, pi - 1);
            quickSort(arr, pi + 1, last);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int limit = sc.nextInt();
        sc.nextLine(); 

        String[] strings = new String[limit];
        System.out.println("Enter the strings to be sorted:");
        for (int i = 0; i < limit; i++) {
            strings[i] = sc.nextLine();
        }

        quickSort(strings, 0, limit - 1);

        System.out.println("Sorted strings:");
        for (int i = 0; i < limit; i++) {
            System.out.println(strings[i]);
        }
    }
}
