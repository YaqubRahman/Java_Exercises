public class Car {
    String model;
    int speed;
    double miles;

    public Car(String model, int speed, double miles){
        this.model = model;
        this.speed = speed;
        this.miles = miles;
    }

    void updateSpeed(int newSpeed) {
        speed = newSpeed;
    }
    void updateMiles(double newMiles) {
        miles = newMiles;
    }

    public String toString() {
        return "Car[model=" + model + ", speed=" + speed + ", miles=" + miles + "]";
    }


}
