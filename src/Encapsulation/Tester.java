package Encapsulation;

import java.util.Arrays;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        House house = new House();

        System.out.println("Number of the floor: ");
        int floorsNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Address: ");
        String address = scanner.nextLine();

        System.out.println("Name of the residents separated by commas: ");
        String residents = scanner.nextLine();
        String[] residentsNames = residents.split(",");

        house.setFloorsNumber(floorsNumber);
        house.setAddress(address);
        house.setResidentsNames(residentsNames);

        scanner.close();

        System.out.println("House detail: ");
        System.out.println("floors numbers: " + house.getFloorsNumber());
        System.out.println("address: " + house.getAddress());
        System.out.println("residents: " + Arrays.toString(house.getResidentsNames()));




    }
}
