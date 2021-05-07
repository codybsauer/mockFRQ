package mockFRQ;

/*
 * 2. The manager of a parking lot company needs to keep track of available parking spaces and the
cars that occupy the taken spaces in each lot.
 */

/*
 * The class ParkingLot is shown below. It uses a two-dimensional array, cars,
 * to represent the spaces in a lot. If a space is unoccupied, the element of
 * the array contains a null. If a space is occupied, the element of the array
 * contains a Car object. Each lot is a rectangular arrangement of rows and
 * columns.
 */

public class ParkingLot {
	/**
	 * cars [row][col] represents the Car in row r and column c in the parking lot.
	 * A null value means the space is empty
	 */
	private Car[][] cars;
	private int availableSpaces = 0; // how many empty spaces

	/**
	 * Creates a parking lot with the given number of rows and columns
	 * 
	 * @param rows
	 *            the number of rows of car spaces in the parking lot
	 * @param cols
	 *            the number of columns of car spaces in the parking lot
	 *
	 *            Precondition: rows > 0; cols > 0; Postcondition: - cars array is
	 *            declared, sized using rows and cols - availableSpaces is
	 *            initialized to rows * cols
	 */

	public ParkingLot(int rows, int cols) {
		/* to be implemented in part a */
		cars = new Car [rows][cols];
		
	}

	/**
	 * Find the parking space that contains the car with a given license
	 *
	 * Returns a ParkingSpace with the row and column of where the car is located. A
	 * null return value means the car is not found in the lot.
	 *
	 * @param license
	 *             the licensePlate of the Car to be located
	 * @return a ParkingSpace indicating the row and column of the Cars position in
	 *         the array or null if the car was not found
	 *
	 *         Precondition: license is not null
	 */

	public ParkingSpace findCar(String license) {
		/* to be implemented in part b */
		for(cars) {
			
		}
	}

	/**
	 * If the car is already parked in the lot do nothing (use the findCar method to
	 * perform this check).
	 *
	 * If the car is not parked in the lot, find an empty space for it (use the
	 * findEmptySpace method provided). If there is a space, place the car in the
	 * corresponding element of the cars array and update the number of spaces now
	 * available in the lot.
	 *
	 * @param car
	 *            - the Car to be parked in the parking lot
	 * @return a boolean indicating if the Car is now in the lot
	 *
	 *         Precondition: car is not null Postcondition: - cars array contains
	 *         car (return true) OR car is not in array, (return false) -
	 *         availableSpaces indicates how many empty spaces are now in the lot
	 */

	public boolean parkCar(Car car) {
		/* to be implemented in part c */
	}

	private ParkingSpace findEmptySpace() {
		
		return null;
	}
}

/*
 * A ParkingSpace holds the row and column of a space in the lot and is
 * represented by the following class:
 */

class ParkingSpace {
	private int row;
	private int col;

	public ParkingSpace(int row, int col) {
		this.row = row;
		this.col = col;
	}
	/* other methods and variables not shown */
}

// A Car is represented by the following class:
class Car {
	private String licensePlate; // identifies the car

	public String getLicensePlate() {
		return licensePlate;
	}
	/* constructors, other methods, and variables not shown */
}
