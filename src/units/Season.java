package units;

public enum Season {
    SPRING(15),
    SUMMER(35),
    AUTUMN(6),
    WINTER(-10);
    int middleTemperature;
    Season(int temperature) {
        this.middleTemperature = temperature;
    }
}
