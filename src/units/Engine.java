package units;

public class Engine {
    String type = "V6";
    String manufacturer = "General Motors";

    public String start() {
        return "Двигатель " + type + " от " + manufacturer + " запущен";
    }
}