package org.example;
import java.util.Scanner;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //maximum no of cars,  how  many are inside, option for user to pick
        int capacity = 10, cars = 0, choice = 0;

        System.out.println("Welcome to the Parking Lot Management System!");
        //menu keeps repeating until user picks 5 which is exit
        while (choice != 5) {
            System.out.print("\nPlease select an option from the menu:\n"
                    + "1. Set Parking Lot Capacity\n2. Car Enters\n3. Car Exits\n"
                    + "4. View Parking Lot Status\n5. Exit\nEnter your choice: ");
            choice = in.hasNextInt() ? in.nextInt() : -1;
            //hasNext checks whether user typed a no
            //if they did it is store in  choice
            if (choice == -1) in.next(); // discard invalid input

            switch (choice) {
                //reads new no,rejects if it zero or negative
                case 1:
                    System.out.print("Enter new capacity: ");
                    int c = in.hasNextInt() ? in.nextInt() : -1;
                    if (c < cars || c <= 0) System.out.println("Invalid capacity (must be positive and >= current cars).");
                    else { capacity = c; System.out.println("Capacity set to " + capacity + "."); }
                    break;
                    //checks for space and adds one to the count
                case 2:
                    if (cars < capacity) System.out.println("Car entered the lot. Current occupancy: " + (++cars) + "/" + capacity + " cars.");
                    else System.out.println("Sorry, the parking lot is FULL.");
                    break;
                    //  subtracts one  if at least one is inside
                case 3:
                    if (cars > 0) System.out.println("Car exited the lot. Current occupancy: " + (--cars) + "/" + capacity + " cars.");
                    else System.out.println("Notice: The parking lot is EMPTY. No car to exit.");
                    break;
                    // it prints cars and capacity and the free space available
                case 4:
                    System.out.println("Current occupancy: " + cars + "/" + capacity + " cars. Available spaces: " + (capacity - cars));
                    if (cars == 0) System.out.println("Notice: The parking lot is EMPTY.");
                    if (cars == capacity) System.out.println("Notice: The parking lot is FULL.");
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    break;
                default:// prints an invalid choice
                    System.out.println("Invalid choice, try again.");
            }
        }
    }
}
