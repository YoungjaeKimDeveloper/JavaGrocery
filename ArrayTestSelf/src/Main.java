import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> groceries = new ArrayList<String>();

        while (flag) {
            text();

            switch (Integer.parseInt(scanner.nextLine())) {
                case 1 -> addItems(groceries);
                case 2 -> removeItems(groceries);
                default -> flag = false;
            }
            groceries.sort(Comparator.naturalOrder());
            System.out.print(groceries);
        }
    }


    private static void addItems(ArrayList<String> groceries) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Add your Grocery Separate by Comma ");
        String[] grocery = scanner.nextLine().split(",");
        groceries.addAll(List.of(grocery));
    }

    private static void removeItems(ArrayList<String> groceries) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Remove your Grocery Separate by Comma ");
        String[] grocery = scanner.nextLine().split(",");
        groceries.removeAll(List.of(grocery));
    }

    private static void text() {
        String textBox = """
                Available actions:

                0 - to shutdown

                1 - to add item(s) to list (comma delimited list)

                2 - to remove any items (comma delimited list)

                Enter a number for which action you want to do:""";
        System.out.print(textBox + " ");
    }
}
