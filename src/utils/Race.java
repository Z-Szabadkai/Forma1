package utils;

import module.Driver;

import java.util.*;
import java.util.Collections;

public class Race {

    public static void race() {
        for (int i = 0; i < 8; i++) {
            Collections.shuffle(Driver.getDriverList());
            List<Driver> drivers = Driver.getDriverList();
            int points = 5;
            for (int j = 0; j < 6; j++) {
                drivers.get(j).setHealth(canRace());
                if (drivers.get(j).getHealth()) {
                    drivers.get(j).setScore(drivers.get(j).getScore() + points);
                    points--;
                } else {
                    System.out.println(drivers.get(j).getName() + " unable to race at " + (i+1));
                }
            }
        }
    }

    public static void printResult() {
        for (Driver d : Driver.getDriverList()) {
            System.out.println(d.getName() + ": " + d.getScore());
        }
    }

    public static void teamScores() {
        Map<String, Integer> total = new HashMap<>();
        for (Driver d : Driver.getDriverList()) {
            if (total.containsKey(d.getBrand().toString())) {
                total.put(d.getBrand().toString(), total.get(d.getBrand().toString()) + d.getScore());
            }
            total.putIfAbsent(d.getBrand().toString(), d.getScore());
        }
        System.out.println("=========================");
        total.forEach((key, value) -> {
            System.out.println("Team " + key + ": " + value + " points");
        });
    }

    public static boolean canRace() {
        double random = new Random().nextDouble();
        if (random <= 0.10) {
            return false;
        }
        return true;
    }
}

