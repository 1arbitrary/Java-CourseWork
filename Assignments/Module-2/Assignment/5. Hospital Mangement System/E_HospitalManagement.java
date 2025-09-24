class Person{
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Name: " + name + "\nAge: " + age;
    }
}

class Doctor extends Person{
    String specialization;

    Doctor(String name, int age, String specialization){
        super(name,age);
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return super.toString()+ "\nSpecialization: " + specialization;
    }
}

class Surgeon extends Doctor{
    String surgeryType;
    Surgeon(String name, int age, String specialization, String surgeryType){
        super(name, age, specialization);
        this.surgeryType = surgeryType;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSurgery Type: " + surgeryType;
    }
}

public class E_HospitalManagement {
    public static void main(String[] args) {
        Surgeon s = new Surgeon("John", 40, "Cardiology", "Heart Surgery");
        System.out.println(s);
}
}
