

abstract class Vehicle {
    public abstract String getModelName();
    public abstract String getRegistrationNumber();
    public abstract String getOwnerName();
}

class Hero extends Vehicle {
    private String modelName;
    private String registrationNumber;
    private String ownerName;
    private int speed;

    public Hero(String modelName, String registrationNumber, String ownerName, int speed) {
        this.modelName = modelName;
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.speed = speed;
    }

    @Override
    public String getModelName() {
        return modelName;
    }

    @Override
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    @Override
    public String getOwnerName() {
        return ownerName;
    }

    public int getSpeed() {
        return speed;
    }

    public void radio() {
        System.out.println("Hero Radio: Radio is playing...");
    }
}

class Honda extends Vehicle {
    private String modelName;
    private String registrationNumber;
    private String ownerName;
    private int speed;

    public Honda(String modelName, String registrationNumber, String ownerName, int speed) {
        this.modelName = modelName;
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.speed = speed;
    }

    @Override
    public String getModelName() {
        return modelName;
    }

    @Override
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    @Override
    public String getOwnerName() {
        return ownerName;
    }

    public int getSpeed() {
        return speed;
    }

    public void cdplayer() {
        System.out.println("Honda CD Player: CD is playing...");
    }
}

public class question2 {
    public static void main(String[] args) {
        Hero hero = new Hero("Hero Splendor", "KA01AB1234", "Ravi", 60);
        Honda honda = new Honda("Honda Shine", "KA05CD5678", "Priya", 70);

        System.out.println("== Hero Vehicle Details ==");
        System.out.println("Model: " + hero.getModelName());
        System.out.println("Reg No: " + hero.getRegistrationNumber());
