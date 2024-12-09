package ua.edu.chmnu.advanced_java.files;

import java.util.List;

public class ObjectFileManagerApp {

    public static void main(String[] args) {
        String file = "cars.dat";

        ObjectFileManager<Car> carManager = new ObjectFileManager<>(file);

        List<Car> cars = List.of(
                Car.builder()
                        .id(1)
                        .price(4000)
                        .model("Daewoo Lanos")
                        .year(2009)
                        .build(),
                Car.builder()
                        .id(-4)
                        .price(8000)
                        .model("Hyundai Elantra")
                        .year(2012)
                        .build(),
                Car.builder()
                        .id(-8)
                        .price(20000)
                        .model("Mercedes C600")
                        .year(2004)
                        .build()
        );

        carManager.writeAll(cars);

        List<Car> carRecords = carManager.readAll();

        carRecords.forEach(System.out::println);

//        for (var car: cars) {
//            carManager.write(car);
//        }

    }

}
