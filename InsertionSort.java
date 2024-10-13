import java.util.Scanner;

public class InsertionSort {
    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
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

            insertionSort(intArray);

            System.out.print("Angka setelah diurutkan: ");
            for (int i = 0; i < intArray.length; i++) {
                System.out.print(intArray[i] + (i != intArray.length - 1 ? ", " : "\n"));
            }
        } catch (NumberFormatException e) {
            System.err.println("Format yang dimasukkan tidak sesuai!");
        }
    }
}
