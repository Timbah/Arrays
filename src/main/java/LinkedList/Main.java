package LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    private static LinkedList<Town> townList = new LinkedList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        addTown("Adelaide", 1374);
        addTown("Alice Springs", 2771);
        addTown("Brisbane", 917);
        addTown("Darwin", 3972);
        addTown("Melbourne", 877);
        addTown("Perth", 3923);

        ListIterator<Town> iterator = townList.listIterator();

        boolean canContinue = true;

        while (canContinue) {
            printMenu();
            canContinue = performAction(scanner.nextLine(), iterator);
        }

    }

    private static boolean performAction(String menuAction, ListIterator<Town> iterator2) {

        Town temp;
        menuAction = menuAction.substring(0, 1);
//saving
        if (menuAction.equalsIgnoreCase("F") && iterator2.hasNext()) {
            temp = (Town) iterator2.next();
            System.out.println("Next Town is: " + temp.getName() + " ---> " + temp.getDistanceFromStart());
            return true;

        } else if (menuAction.equalsIgnoreCase("B") && iterator2.hasPrevious()) {
            temp = (Town) iterator2.previous();
            System.out.println("Previous Town is: " + temp.getName() + " ---> " + temp.getDistanceFromStart());
            return true;

        } else if (menuAction.equalsIgnoreCase("M")) {
            printMenu();
            return true;

        } else if (menuAction.equalsIgnoreCase("L")) {
            listTowns(iterator2);
            return true;

        } else {
            System.out.println("Exiting");
            return false;
        }

    }

    private static void printMenu() {

        String menu = """
                        Available actions (select word or letter):
                        (F)orward
                        (B)ackward
                        (L)list Places
                        (M)enu
                        (Q)uit
                """;
        System.out.println(menu);
        System.out.println();

    }

    private static void listTowns(ListIterator<Town> listIterator2) {

        System.out.println("Starting Town Is: Sydney");
        listIterator2 = townList.listIterator(0);

        for (int i = 1; i < townList.size(); i++) {
            System.out.println("---> " + listIterator2.next().getName());
        }

        System.out.println("Ending at ---> " + listIterator2.next().getName());
    }

    private static boolean addTown(String name, double distance) {

        if (!findTown(name)) {
            Town newTown = new Town(name, distance);
            townList.add(newTown);
            return true;
        }

        return false;
    }

    private static boolean findTown(String name) {

        for (Town t : townList) {
            if (t.getName().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }

    private static boolean findTown(Town town) {

        ListIterator<Town> iterator = townList.listIterator();

        while (iterator.hasNext()) {

            if (iterator.next().getName().equalsIgnoreCase(town.getName())) {
                return true;
            }
        }

        return false;
    }


}
