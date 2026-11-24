/*
Question: Given an array of five positive integers,
find the minimum and maximum possible sums by adding
exactly four elements.
*/

public class MinimumMaximumSum {

    public static void findMinMaxSum(int[] numbers) {

        long totalSum = 0;
        int smallest = numbers[0];
        int largest = numbers[0];

        for (int i = 0; i < numbers.length; i++) {

            totalSum = totalSum + numbers[i];

            if (numbers[i] > largest) {
                largest = numbers[i];
            }

            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        long minimumSum = totalSum - largest;
        long maximumSum = totalSum - smallest;

        System.out.println(minimumSum + " " + maximumSum);
    }

    public static void main(String[] args) {

        int[] numbers = {7, 2, 9, 4, 6};

        findMinMaxSum(numbers);
    }
}