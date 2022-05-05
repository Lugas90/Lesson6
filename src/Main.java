import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        int summa = 0;

        // Задание 1
        for (int i = 0; i < arr.length; i++) {
            summa += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + summa + " рублей");

        // Заданиие 2
        int minSum = 200_000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minSum) {
                minSum = arr[i];
            }
        }
        int maxSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxSum) {
                maxSum = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSum + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + maxSum + " рублей");

        // Задание 3
        double avgSum = 0;
        for (int i = 0; i < arr.length; i++) {
            avgSum+= arr[i];
        }
        avgSum = avgSum / 30;
        System.out.println("Средняя сумма трат за месяц составила " + avgSum + " рублей");

        // Задание 4
        char [] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length -1 ; i >= 0; i--){
            System.out.print(reverseFullName[i]);
        }

    }

    private static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}