package Project2;

public class MotorBikeRunner {
    
    public static void main(String[] args) {
        MotorBike honda = new MotorBike(50);
        MotorBike ducati = new MotorBike(70);

        honda.start();
        ducati.start();

        honda.increaseSpeed(100);
        honda.decreaseSpeed(20);

        System.out.println(ducati.getSpeed());
        System.out.println(honda.getSpeed());
    }
}
