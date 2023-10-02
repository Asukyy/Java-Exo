package bonus;

public class sapin {
    // fait un sapin
    public static void main(String[] args) {
        int height = 5;
        int width = 2 * height - 1;
        int space = width / 2;
        int star = 1;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < star; j++) {
                System.out.print("*");
            }
            System.out.println();
            space--;
            star += 2;
        }
        for (int i = 0; i < height / 2; i++) {
            for (int j = 0; j < width / 2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }
}
