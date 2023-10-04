import java.util.Random;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Random rand = new Random();
        int r = rand.nextInt(2,10);


        System.out.println(r);

        Scanner scan = new Scanner(System.in);
        for(int i = 0; i<r;i++){
            String s = scan.nextLine();
            System.out.println("Lecture : "+s);
        }



        scan.close();
    }
}