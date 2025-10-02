package ArrayListChallenge;

import java.util.*;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean flag = true;
        ArrayList<String> groceries = new ArrayList<>();

        while (flag) {
            printActions();

            switch (Integer.parseInt(scanner.nextLine())) {
                case 1 -> addItems(groceries);
                case 2 -> removeItems(groceries);
                default -> flag = false;
            }

            groceries.sort(Comparator.naturalOrder());
            System.out.println(groceries);
        }

    }

    private static void removeItems(ArrayList<String> groceriesInput) {

        System.out.println("Remove item(s) [Separate items by a comma]:");
        String[] items = scanner.nextLine().split(",");

        for (String i : items) {
            String trimmed = i.trim();
            groceriesInput.remove(trimmed);
        }

    }


    private static void addItems(ArrayList<String> groceriesInput) {

        System.out.println("Add item(s) [Separate items by a comma]:");
        String[] items = scanner.nextLine().split(",");

        for (String i : items) {
            String trimmed = i.trim();

            if (!groceriesInput.contains(trimmed)) {
                groceriesInput.add(trimmed);
            }
        }

    }

    private static void printActions() {

        String promptMessage = """
                0 - To Shutdown.
                1 - To Add item(s) to a list(Comma delimited list)
                2 - To Remove any item(s) from the list (Comma delimited list)
                Enter an option:""";
        System.out.println(promptMessage + " ");
    }

}
