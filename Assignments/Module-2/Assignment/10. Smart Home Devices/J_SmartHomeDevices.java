import java.util.Scanner;

interface Device {
    void turnOn();
    void turnOff();
}

class Fan implements Device {
    @Override
    public void turnOn() {
        System.out.println("Fan is now ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan is now OFF");
    }
}

class Light implements Device {
    @Override
    public void turnOn() {
        System.out.println("Light is now ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Light is now OFF");
    }
}

public class J_SmartHomeDevices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input1 = sc.nextLine();
        String input2 = sc.nextLine();

        Device d1, d2;

        if (input1.equalsIgnoreCase("Fan")) {
            d1 = new Fan();
        } else {
            d1 = new Light();
        }

        if (input2.equalsIgnoreCase("Fan")) {
            d2 = new Fan();
        } else {
            d2 = new Light();
        }

        d1.turnOn();
        d1.turnOff();

        d2.turnOn();
        d2.turnOff();

        sc.close();
    }
}
