import java.util.Scanner;

public class BubbleSort {
    private static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
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

            bubbleSort(intArray);

            System.out.print("Angka setelah diurutkan: ");
            for (int i = 0; i < intArray.length; i++) {
                System.out.print(intArray[i] + (i != intArray.length - 1 ? ", " : "\n"));
            }
        } catch (NumberFormatException e) {
            System.err.println("Format yang dimasukkan tidak sesuai!");
        }
    }
}