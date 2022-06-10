public class task3 {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        for (int i = 1; i < 100; i++) {
            numbers[i] = i;
            if (numbers[i] % 3 == 0) {
                System.out.println(numbers[i]);
            }

        }
    }
}