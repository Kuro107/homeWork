package HW2_5;

public class Vehicle {
    String name;
    String carBodyType;
    String engineType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCarBodyType() {
        return carBodyType;
    }

    public void setCarBodyType(String carBodyType) {
        this.carBodyType = carBodyType;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
    @Override
    public String toString(){
        return "Name: " + name + "\n" +
                "Vehicle body type: " + carBodyType + "\n" +
                "Engine type: " + engineType;
    }
}

class SUV extends Vehicle{
    String driveUnit;


    public String getDriveUnit() {
        return driveUnit;
    }

    public void setDriveUnit(String driveUnit) {
        this.driveUnit = driveUnit;
    }
    @Override
    public String toString(){
        return "Name: " + name + "\n" +
                "Vehicle body type: " + carBodyType + "\n" +
                "Engine type: " + engineType + "\n" +
                "Drive unit: " + driveUnit;
    }
}

class SpecialEquipment extends Vehicle{
    boolean haveWheels;
    String occupation;

    public boolean isHaveWheels() {
        return haveWheels;
    }

    public void setHaveWheels(boolean haveWheels) {
        this.haveWheels = haveWheels;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
    @Override
    public String toString(){
        return "Name: " + name + "\n" +
                "Vehicle body type: " + carBodyType + "\n" +
                "Engine type: " + engineType + "\n" +
                "Is have wheels? : " + haveWheels + "\n" +
                "Occupation" + occupation;
    }
}
class Supercar extends Vehicle{
    int engineHP;
    int maxSpeed;

    public int getEngineHP() {
        return engineHP;
    }

    public void setEngineHP(int engineHP) {
        this.engineHP = engineHP;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    @Override
    public String toString(){
        return "Name: " + name + "\n" +
                "Vehicle body type: " + carBodyType + "\n" +
                "Engine type: " + engineType + "\n" +
                "Max speed: " + maxSpeed + "\n" +
                "Engine horse power: " + engineHP;
    }
}
