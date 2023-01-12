package units;

public class Car {
    String model;
    String licencePlate;
    String color;
    String visualModel;
    double avgSpeed;
    Engine engine = new Engine();

    public Car() {

    }

    public Car(String model, String licencePlate, String color, double avgSpeed) {
        this.model = model;
        this.licencePlate = licencePlate;
        this.color = color;
        this.visualModel = "Путь к 3D модели автомобиля";
        this.avgSpeed = avgSpeed;
    }

    public String drive(double speed) {
        return "Я еду со средней скоростью " + speed;
    }

    public double drive() {
        return avgSpeed;
    }

    public String start() {
        return engine.start() + " на автомобиле " + model;
    }

    public static void time() {

    }
}
