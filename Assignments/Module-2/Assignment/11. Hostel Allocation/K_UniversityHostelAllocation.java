class Room {
    private String roomNumber;
    private String block;
    private String type; // Single/Double

    public Room(String roomNumber, String block, String type) {
        this.roomNumber = roomNumber;
        this.block = block;
        this.type = type;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public String getBlock() {
        return block;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Room: " + roomNumber + " " + block + " " + type;
    }
}

class Student2 {
    private String name;
    private int roll;
    private String course;
    private Room room;

    public Student2(String name, int roll, String course, Room room) {
        this.name = name;
        this.roll = roll;
        this.course = course;
        this.room = room;
    }

    public String getName() {
        return name;
    }

    public int getRoll() {
        return roll;
    }

    public String getCourse() {
        return course;
    }

    public Room getRoom() {
        return room;
    }

    @Override
    public String toString() {
        return "Student: " + name + " (" + roll + ") " + course + "\n" + room.toString();
    }
}

public class K_UniversityHostelAllocation {
    public static void main(String[] args) {
        Room room1 = new Room("A101", "Block-B", "Single");

        Student2 student1 = new Student2("Ravi", 101, "CSE", room1);

        System.out.println(student1);
    }
}
