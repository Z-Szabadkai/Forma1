package module;

public class Car {

    private Driver driver;
    private boolean carStatus;

    public Car(Driver driver, boolean carStatus) {
        this.driver = driver;
        this.carStatus = carStatus;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public boolean getCarStatus() {
        return carStatus;
    }

    public void setCarStatus(boolean carStatus) {
        this.carStatus = carStatus;
    }
}
