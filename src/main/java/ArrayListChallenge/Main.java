package ArrayListChallenge;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        String promptMessage = """
                 0 - To Shutdown.
                 1 - To Add item(s) to a list(Comma delimited list)
                 2 - To Remove any item(s) from the list (Comma delimited list)          \s
                 Enter an option:
                \s""";
        System.out.println(promptMessage);
        Scanner scanner = new Scanner(System.in);

        int option = scanner.nextInt();
        scanner.nextLine();

        if (option < 0 || option > 2) {
            System.out.println("You have entered an unknown option. System will exit");
        } else {

            ArrayList<String> groceryList = new ArrayList<>();
            groceryList.addAll(List.of("Avocado,milk,sugar"));

            System.out.println("Initial list: "+ groceryList.toString());
            String input = scanner.nextLine();
            String[] items = input.split(",");

            switch (option) {
                case 1:
                    groceryList.addAll(List.of(items));
                    break;
                case 2:
                    groceryList.removeAll(List.of(items));
                    break;
                default:
                    break;
            }

            groceryList.sort(Comparator.naturalOrder());
            System.out.println(groceryList.toString());
        }


    }
}
