package units;

import units.Car;

import static java.lang.Math.random;

public class TrafficSim {
    public static void main(String[] args) {
        random();
        Car.time();

        Car chevy = new Car("Chevrolet Cobalt", "E246OH61", "Blue", 56);

//        chevy.model = "Chevrolet Cobalt";
//        chevy.licencePlate = "E246OH61";
//        chevy.color = "Blue";
//        chevy.avgSpeed = 56.5;
//        chevy.visualModel = "Путь к 3D модели автомобиля";

        System.out.println(chevy.start());
        System.out.println(chevy.drive(45));


        Pedestrian boy = new Pedestrian();

        boy.gender = "Male";
        boy.age = 17;
        boy.unpredictability = 6.2;
        boy.visualModel = "Путь к 3D модели пешехода";
        System.out.println(boy.walk());

        Season season = Season.WINTER;
        int temperature = season.middleTemperature;
    }
}