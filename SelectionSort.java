import java.util.Scanner;

public class SelectionSort {
    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan angka yang ingin diurutkan (pisahkan dengan koma): ");
            String input = scanner.nextLine();

            String[] numbers = input.split(",");
            int[] intArray = new int[numbers.length];
            for (int i = 0; i < numbers.length; i++) {
                intArray[i] = Integer.parseInt(numbers[i]);
            }

            selectionSort(intArray);

            System.out.print("Angka setelah diurutkan: ");
            for (int i = 0; i < intArray.length; i++) {
                System.out.print(intArray[i] + (i != intArray.length - 1 ? ", " : "\n"));
            }
        } catch (NumberFormatException e) {
            System.err.println("Format yang dimasukkan tidak sesuai!");
        }
    }
}
