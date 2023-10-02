package exo9;

public class exo9 {

    public static void main(String[] args) {

        int[] numbers = { 21565, 3412, 180, 1556, 182, 84, 15 };

        for (int value : numbers) {
            if (value % 3 != 0) {
                System.out.print(value + " ");

            }
        }

    }

}
