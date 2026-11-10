package Wahrenautomat;

import java.util.ArrayList;
import java.util.Scanner;

class Warenautomat {
    public static void main(String[] args) {
        System.out.println("__     _______ _   _ ____ ___ _   _  ____   __  __    _    ____ _   _ ___ _   _ _____ ");
        System.out.println("\\ \\   / / ____| \\ | |  _ \\_ _| \\ | |/ ___| |  \\/  |  / \\  / ___| | | |_ _| \\ | | ____|");
        System.out.println(" \\ \\ / /|  _| |  \\| | | | | ||  \\| | |  _  | |\\/| | / _ \\| |   | |_| || ||  \\| |  _|  ");
        System.out.println("  \\ V / | |___| |\\  | |_| | || |\\  | |_| | | |  | |/ ___ \\ |___|  _  || || |\\  | |___ ");
        System.out.println("   \\_/  |_____|_| \\_|____/___|_| \\_|\\____| |_|  |_/_/   \\_\\____|_| |_|___|_| \\_|_____|");
        System.out.println("                                                                                      ");
        System.out.println("            ____ _____  _    ____ _____ _____ ____                                    ");
        System.out.println("           / ___|_   _|/ \\  |  _ \\_   _| ____|  _ \\                                   ");
        System.out.println("           \\___ \\ | | / _ \\ | |_) || | |  _| | | | |                                  ");
        System.out.println("            ___) || |/ ___ \\|  _ < | | | |___| |_| |                                  ");
        System.out.println("           |____/ |_/_/   \\_\\_| \\_\\|_| |_____|____/                                   ");
        addMenulist();
        printMenuItems(new ArrayList<String>());
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        selectMenuItem(input);
        scanner.close();
    }
    public static void addMenulist() {
        ArrayList<String> menuItems = new ArrayList<>();
        menuItems.add("Coca Cola");
        menuItems.add("Pepsi");
        menuItems.add("Fanta");
    }
    public static void printMenuItems(ArrayList<String> menuItems) {
        System.out.println("Menu Items:");
        for (String item : menuItems) {
            System.out.println("- " + item);
        }
    }
    public static void selectMenuItem(int itemNumber) {
        ArrayList<String> menuItems = new ArrayList<>();
        menuItems.add("Coca Cola");
        menuItems.add("Pepsi");
        menuItems.add("Fanta");

        if (itemNumber >= 1 && itemNumber <= menuItems.size()) {
            String selectedItem = menuItems.get(itemNumber - 1);
            System.out.println("You selected: " + selectedItem);
        } else {
            System.out.println("Invalid selection. Please choose a valid item number.");
        }
    }

}