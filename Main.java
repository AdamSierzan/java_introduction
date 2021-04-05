class Main {
  public static void main(String[] args) {
    Flight new_flight = new Flight("Amsterdam", "Warsaw");

    System.out.println("Flight from " + new_flight.departure + " to " + new_flight.arrival);
  }
}

class Flight  {
  String departure;
  String arrival;

  public Flight(String departure, String arrival) {
    this.departure = departure;
    this.arrival = arrival;
  }

}
