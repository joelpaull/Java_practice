package Project2;

class MotorBike {

    //state 
    private int speed; // member variable

    // constructor
    MotorBike(int speed) {
        this.speed = speed;
    }

    //behavior / methods
    public void setSpeed(int speed){ // local variable
        this.speed = speed;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void increaseSpeed(int speed) { 
        this.speed = this.speed += speed;
    }

    public void decreaseSpeed(int speed) { 
        if(this.speed - speed > 0) 
            this.speed = this.speed -= speed;
    }

    public void start() {
        System.out.println("Bike Started");
    }
}