package be.pxl.ja.oefening6_1;

public class Car {

    private Engine engine;
    private static String fuel;

    public Car(String fuel) {
        this.fuel = "benzine";
        this.engine = new Engine();
    }

    public void start() {

    }

    public String getFuel() {
        return fuel;
    }

    public static class Engine {

        public void start(){
            System.out.println("motor is gestart met " + fuel );
        }

    }

    public static void main(String[] args) {
        Car car = new Car("benzine");
        car.engine.start();

    }


}
