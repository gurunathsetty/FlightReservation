package main;

public class Flight {

    static int numberOfAvailableSeats;

    static int numberOfBookedSeats;

    int flightNumber;

    /**
     * method is used to add flights to the fleet
     * @param flightNumber unique number assigned to the flight
     */
    public Flight(int flightNumber){
        this.flightNumber = flightNumber;
        numberOfBookedSeats = 0;
        numberOfAvailableSeats = 70;
    }

    /**
     *
     * @param numberOfSeats number of seats to be booked
     * @return Message Based on the status
     * @throws Exception In case of invalid seat numbers
     */
    public String reserveSeats(int numberOfSeats) throws Exception {
        SeatArrangement seatArrangement = new SeatArrangement();

        if ( numberOfSeats == 0) {
            throw new Exception("Number of seats shoiuld not be lesser than one");
        }

        if (numberOfAvailableSeats - numberOfBookedSeats >= numberOfSeats){
            if(numberOfSeats==2)
                seatArrangement.seatAllocationTwoSeats(numberOfSeats);
            else
                seatArrangement.seatAllocationMoreThanTwoSeats(numberOfSeats);

            return "Successfully booked " + numberOfSeats + "Seats";
        }
        else{
            throw new Exception("Seats are not available please try next flight");
        }

    }

}
