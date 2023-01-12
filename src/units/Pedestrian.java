package units;

public class Pedestrian {
    String gender;
    int age;
    String visualModel;
    double unpredictability;

    public Pedestrian(String gender, int age, double unpredictability) {
        this.gender = gender;
        this.age = age;
        this.unpredictability = unpredictability;

        this.visualModel = "Путь к 3D модели пешехода";
    }

    public Pedestrian(int age, double unpredictability) {
        this.age = age;
        this.unpredictability = unpredictability;

        this.gender = randomGender();
        this.visualModel = "Путь к 3D модели пешехода";
    }

    public Pedestrian() {
        this(25, 5.0);
    }

    private String randomGender() {
        double number = Math.random();
        if (number < 0.5) {
            return "Male";
        } else {
            return "Female";
        }
    }

    public String walk() {
        String speedWord;
        if (age < 18) {
            speedWord = "быстро";
        } else if (age < 60) {
            speedWord = "средненько";
        } else {
            speedWord = "медленно";
        }
        return "Я двигаюсь " + speedWord;
    }
}
