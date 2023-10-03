import java.util.ArrayList;

public class exo5 {

    public static void main(String[] args) {
        ArrayList<Integer> nbArray = new ArrayList<>();
        nbArray.add(75);
        nbArray.add(80);
        nbArray.add(90);
        nbArray.add(95);
        nbArray.add(85);

        Integer averageArray = averageCalc(nbArray);
        System.out.println("La moyenne des nombres du tableau est: " + averageArray);
    }

    private static Integer averageCalc(ArrayList<Integer> numbers) {
        Integer sum = 0;
        Integer nbElement = numbers.size();

        for (Integer number : numbers) {
            sum += number;
        }

        return sum / nbElement;
    }
}


