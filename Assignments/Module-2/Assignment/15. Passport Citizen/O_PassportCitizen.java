class Passport {
    private String passportNo;
    private String issueDate;
    private String expiryDate;

    public Passport(String passportNo, String issueDate, String expiryDate) {
        this.passportNo = passportNo;
        this.issueDate = issueDate;
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return "Passport: " + passportNo + " Issue: " + issueDate + " Expiry: " + expiryDate;
    }
}

class Citizen {
    private String name;
    private String dob;
    private String address;
    private Passport passport;

    public Citizen(String name, String dob, String address, Passport passport) {
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.passport = passport;
    }

    @Override
    public String toString() {
        return "Citizen: " + name + " DOB: " + dob + " Address: " + address + "\n" + passport.toString();
    }
}

public class O_PassportCitizen {
    public static void main(String[] args) {
        Citizen citizen = new Citizen(
                "Ravi",
                "01-01-1990",
                "Delhi",
                new Passport("P123456", "01-01-2020", "01-01-2030")
        );

        System.out.println(citizen);
    }
}
