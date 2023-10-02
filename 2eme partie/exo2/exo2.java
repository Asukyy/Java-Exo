import java.util.ArrayList;

public class exo2 {

    public static void main(String[] args) {

        ArrayList<String> tab = new ArrayList<>();
        tab.add("kiwi");
        tab.add("pomme");
        tab.add("poire");
        tab.add("litchi");
        tab.add("rhubarbe");

        if (args.length > 0) {
            int index = findFruit(tab, args[0]);
            if (index != -1) {
                System.out.println("Le fruit " + args[0] + " est à l'index " + index);
            } else {
                System.out.println(args[0] + " n'est pas dans le tableau");
            }
        }
    }

    private static int findFruit(ArrayList<String> tab, String str) {
        for (int i = 0; i < tab.size(); i++) {
            if (tab.get(i).equals(str)) {
                return i;
            }
        }
        return -1;
    }
}
