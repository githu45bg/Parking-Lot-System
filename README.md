# Parking Lot Management System

A simple, menu-driven console application written in Java that manages the flow of cars entering and exiting a parking lot, tracks available spaces and reports the lot's status.

## Features

- Default parking lot capacity of **10** cars (can be changed from the menu)
- **Car entry:** checks that space is available before adding a car
- **Car exit:** checks that the lot is not empty before removing a car
- **Status view:** shows current occupancy, available spaces, and an `EMPTY` or `FULL` notice
- Input validation: invalid menu choices and non-numeric input are handled without crashing

## Requirements

- Java Development Kit (JDK) 8 or later

## How to Run

```bash
javac ParkingLot.java
java ParkingLot
```

Or open the project in an IDE such as IntelliJ IDEA and run the `ParkingLot` class.

## Menu Options

| Option | Action |
|--------|--------|
| 1 | Set Parking Lot Capacity |
| 2 | Car Enters |
| 3 | Car Exits |
| 4 | View Parking Lot Status |
| 5 | Exit |

## Sample Output

```
Welcome to the Parking Lot Management System!

Please select an option from the menu:
1. Set Parking Lot Capacity
2. Car Enters
3. Car Exits
4. View Parking Lot Status
5. Exit
Enter your choice: 2
Car entered the lot. Current occupancy: 1/10 cars.

Enter your choice: 3
Car exited the lot. Current occupancy: 0/10 cars.

Enter your choice: 3
Notice: The parking lot is EMPTY. No car to exit.
```

## Test Scenarios

1. Exit a car from an empty lot → an `EMPTY` notice is shown.
2. Set the capacity to 2, then enter 3 cars → the third car is rejected as `FULL`.
3. Enter a car, view the status, then exit the car.
4. Enter an invalid option (e.g. `abc` or `9`) → an error message is shown and the menu repeats.

## How It Works

The program keeps a single counter for the number of cars in the lot and compares it with the capacity. A `while` loop displays the menu until the user chooses Exit, and a `switch` statement runs the selected action.

## Author

Brian