
public class exo4 {

    public static void main(String[] args) {
        int count = 0;
        int start = 1;
        int end = 10;

        for (int i = start; i <= end; i++) {
                count += (i * i);
        }

        System.out.println("La somme des carrés des nombres entre " + start + " et " + end + " est : " + count);
    }
}

