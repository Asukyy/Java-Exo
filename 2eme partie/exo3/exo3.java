import java.util.ArrayList;

public class exo3 {

    public static void main(String[] args) {

        ArrayList<String> quotation = new ArrayList<>();
        quotation.add("Quand Paris s'enrhume, l'Europe a froid: ");
        quotation.add("S'il y a un diamant dans la poitrine, il brille sur le visage: ");
        quotation.add(" La joie de vivre n'est pas un but, mais un devoir: ");

                for(int i = 0; i<quotation.size(); i++){
                    System.out.println(quotation.get(i) + countVowels(quotation.get(i)));
                }
    }

    private static int countVowels(String str) {
        Integer Vowels = 0;
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' ||
             str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                Vowels++;
        }
        else if(str.charAt(i) == 'A' || str.charAt(i) == 'E' ||
             str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U'){
                Vowels++;
        }

    }

    return Vowels;



}
}
