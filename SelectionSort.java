/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructuresandalgorithms;

/**
 *
 * @author Asus
 */
public class SelectionSort {
    // Function to perform selection sort
    public static void selectionSort(int[] array) {
        // Loop over each element in the array
        for (int i = 0; i < array.length; i++) {
            // Assume the current position is the smallest
            int smallestIndex = i;
            // Check the rest of the array for a smaller element
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[smallestIndex]) {
                    smallestIndex = j;
                }
            }
            // Swap the found smallest element with the current element
            int temp = array[i];
            array[i] = array[smallestIndex];
            array[smallestIndex] = temp;
        }
    }

    public static void main(String[] args) {
        // Example usage
        int[] numbers = {64, 25, 12, 22, 11};
        selectionSort(numbers);
        // Print the sorted array
        System.out.print("Sorted array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}

