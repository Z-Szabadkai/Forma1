package module;

import java.util.*;

public class Driver extends Member{

    private String name;
    private int id;
    private int score;
    private static List<Driver> driverList;

    public Driver(int id) {
        this.id = id;
    }

    public Driver(String name, boolean health, Team brand, int id) {
        super(health, brand);
        this.name = name;
        this.id = id;
        this.score = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public static List<Driver> getDriverList() {
        return driverList;
    }

    public static void setDriverList(List<Driver> driverList) {
        Driver.driverList = driverList;
    }
}
