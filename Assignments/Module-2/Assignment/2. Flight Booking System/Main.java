import java.util.Scanner;

abstract class Flight {
    private String flightNumber;
    private String airline;
    private double fare;

    Flight(String flightNumber, String airline, double fare){
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.fare = fare;
    }

    public double getFare() { return fare; }
    public String getAirline(){ return airline; }
    public String getFlightNumber(){ return flightNumber; }
    public String toString(){ return airline + flightNumber; }

    abstract double calculateFare();
}

class DomesticFlight extends Flight {
    double tax;
    DomesticFlight(String flightNumber, String airline, double fare){
        super(flightNumber, airline, fare);   
    }

    @Override
    double calculateFare(){
        tax = getFare() * 10/100;
        return getFare() + tax;
    }
    
    @Override
    public String toString(){
        return "Flight Type : Domestic, " + "Flight Number : " + getFlightNumber() + ", Airlines : " + getAirline() + ", Fare : " + calculateFare();
    }     
}

class InternationalFlight extends Flight {
        double tax;
        InternationalFlight(String flightNumber, String airline, double fare){
            super(flightNumber, airline, fare);
        }
        
        @Override
        public double calculateFare(){
            tax = getFare() * 25/100;
            return getFare() + tax;
        }

        @Override
        public String toString(){
            return "Flight Type : International, " + "Flight Number : " + getFlightNumber() + ", Airlines : " + getAirline() + ", Fare : " + calculateFare();
        }
}

class Main {
    public static void init(){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter Flight Type : ");
        String flightType = scan.nextLine();

        System.out.print("Enter Flight Number : ");
        String flightNumber = scan.nextLine();
        
        System.out.print("Enter Airlines : ");
        String airlinesName = scan.nextLine();

        System.out.print("Enter Fare : ");
        double fare = scan.nextInt();

        scan.close();
        
        if (flightType.toLowerCase().equals("domestic")){
            DomesticFlight one = new DomesticFlight(flightNumber, airlinesName, fare);
            System.out.println(one.toString());
        } else if (flightType.toLowerCase().equals("international")){
            InternationalFlight two = new InternationalFlight(flightNumber, airlinesName, fare);
            System.out.println(two.toString());    
        }
    }
    
    public static void main(String[] args){
        init();
    }
}