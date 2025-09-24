import java.util.*;

class Guest {
    private String name;
    private int age;
    private String idProof;

    public Guest(String name, int age, String idProof) {
        this.name = name;
        this.age = age;
        this.idProof = idProof;
    }

    @Override
    public String toString() {
        return name + "," + age + "," + idProof;
    }
}

class Reservation {
    private String reservationId;
    private String roomType;
    private List<Guest> guests;

    public Reservation(String reservationId, String roomType) {
        this.reservationId = reservationId;
        this.roomType = roomType;
        this.guests = new ArrayList<>();
    }

    public void addGuest(Guest guest) {
        guests.add(guest);
    }

    public void displayReservation() {
        System.out.println("Reservation ID: " + reservationId + " Room: " + roomType);
        System.out.println("Guests:");
        for (Guest g : guests) {
            System.out.println(g);
        }
    }
}

public class M_HotelReservationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] resData = sc.nextLine().split(",");
        String reservationId = resData[0];
        String roomType = resData[1];
        int guestCount = Integer.parseInt(resData[2]);

        Reservation reservation = new Reservation(reservationId, roomType);

        for (int i = 0; i < guestCount; i++) {
            String[] guestData = sc.nextLine().split(",");
            String name = guestData[0];
            int age = Integer.parseInt(guestData[1]);
            String idProof = guestData[2];

            Guest guest = new Guest(name, age, idProof);
            reservation.addGuest(guest);
        }

        reservation.displayReservation();
        sc.close();
    }
}
