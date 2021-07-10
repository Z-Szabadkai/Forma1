package utils;

import module.Driver;
import module.Team;

import java.io.*;
import java.util.ArrayList;

public class Filehandler {

    public static void readDocument() throws IOException {
       File file = new File("src/resources/driverlist");
       if (file.exists()) {
           ArrayList<Driver> drivers = new ArrayList<>();
           FileReader fileReader = new FileReader(file);
           BufferedReader bufferedReader = new BufferedReader(fileReader);
           for (String line; (line = bufferedReader.readLine()) != null;) {
               Driver driver = new Driver(Integer.parseInt(line.split(",")[2]));
               driver.setName(line.split(",")[0]);
               driver.setBrand(Team.fromString(line.split(",")[1]));
               drivers.add(driver);
           }
           Driver.setDriverList(drivers);
           System.out.println("The file has been loaded successfully");
       }

    }

    public static void main(String[] args) throws IOException {
        Filehandler.readDocument();
        Race.race();
        Race.printResult();
        Race.teamScores();

    }
}
