public class exo4 {
    public static void main(String[] args) {

        String str = "Hello World !";
        int i = 0;

        while (i < str.length()) {
            System.out.print(str.charAt(i));
            if (i < str.length()) {
                System.out.print(" ");
            }
            i++;
        }
    }

}
