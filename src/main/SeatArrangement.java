package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class SeatArrangement {

    static int LEFT_SEATER = 20;

    static int RIGHT_SEATER = 20;

    static int MIDDLE_SEATER = 30;

    List<Integer> list = new ArrayList<Integer>();
    /*Declaring 2D ArrayList*/
    ArrayList<ArrayList<Integer>> leftTwoSeaters;
    ArrayList<ArrayList<Integer>> rightTwoSeaters;
    ArrayList<ArrayList<Integer>> middleThreeSeaters;

    /**
     * Method is used to allot two seats
     * @param numberOfSeats number of seats to be booked
     * @throws Exception throws exception with a message if unsuccessful reservation
     */
    public void seatAllocationTwoSeats(int numberOfSeats) throws Exception {
        leftTwoSeaters = new ArrayList<ArrayList<Integer>>();
        leftTwoSeaters.add(new ArrayList<Integer>());

        rightTwoSeaters = new ArrayList<ArrayList<Integer>>();
        rightTwoSeaters.add(new ArrayList<Integer>());

        middleThreeSeaters = new ArrayList<ArrayList<Integer>>();
        middleThreeSeaters.add(new ArrayList<Integer>());


        if (numberOfSeats == 2) {

            if (LEFT_SEATER >= 2) {
                for (int i = 0; i < numberOfSeats; i++) {
                    for (int j = 0; j <= i; j++) {
                        leftTwoSeaters.get(i).add(j, 1);
                        LEFT_SEATER--;
                    }
                }
            } else if (RIGHT_SEATER >= 2) {
                for (int i = 0; i < numberOfSeats; i++) {
                    for (int j = 0; j <= i; j++) {

                        rightTwoSeaters.get(i).add(j, 1);
                        RIGHT_SEATER--;
                    }
                }
            } else if (MIDDLE_SEATER >= 2) {
                for (int i = 0; i < numberOfSeats; i++) {
                    for (int j = 0; j <= i; j++) {
                        middleThreeSeaters.get(i).add(j, 1);
                        MIDDLE_SEATER--;
                    }
                }
            } else {
                throw new Exception("Seats are not available please try next flight");
            }
        }
    }

    /**
     * Method is used to allot seats greater than 2
     * @param numberOfSeats number of seats to be booked
     * @throws Exception throws exception with a message if unsuccessful reservation
     */
    public void seatAllocationMoreThanTwoSeats(int numberOfSeats) throws Exception {
        leftTwoSeaters = new ArrayList<ArrayList<Integer>>();
        leftTwoSeaters.add(new ArrayList<Integer>());

        rightTwoSeaters = new ArrayList<ArrayList<Integer>>();
        rightTwoSeaters.add(new ArrayList<Integer>());

        middleThreeSeaters = new ArrayList<ArrayList<Integer>>();
        middleThreeSeaters.add(new ArrayList<Integer>());

        if (numberOfSeats > 2){
            if (MIDDLE_SEATER >= numberOfSeats) {
                for (int i = 0; i < numberOfSeats; i++) {
                    for (int j = 0; j <= i; j++) {
                        middleThreeSeaters.get(i).add(j, 1);
                        MIDDLE_SEATER--;
                    }
                }
            }
            else if (RIGHT_SEATER >= numberOfSeats) {
                for (int i = 0; i < numberOfSeats; i++) {
                    for (int j = 0; j <= i; j++) {
                        rightTwoSeaters.get(i).add(j, 1);
                        RIGHT_SEATER--;
                    }
                }
            }
            else if (LEFT_SEATER >= 2) {
                for (int i = 0; i < numberOfSeats; i++) {
                    for (int j = 0; j <=i; j++) {
                        leftTwoSeaters.get(i).add(j, 1);
                        LEFT_SEATER--;
                    }
                }
            }
            else {
                throw new Exception("Seats are not available please try next flight");
            }
        }

    }


    public static void main(String[] args) throws Exception {
        System.out.println("Enter Number Of Seats to be booked:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numberodSeats = Integer.parseInt(reader.readLine());
        Flight flights = new Flight(1);
        flights.reserveSeats(numberodSeats);
    }
}
