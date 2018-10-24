package Strategy.Zadanie1;

public class Car {

    public Car(Mode mode) {
        this.mode = mode;
    }

    public Car() {
    }

    Mode mode = new NormalMode(); // domyslnie jest normal mode

    double speed;
    double engineWear;
    double breaksWear;
    double gasReleased;



    public void increaseSpeed(){
        speed+= mode.howMuchIncreaseSpeed();
        engineWear+= mode.howMuchShouldEngineBeWear();
        breaksWear+= mode.howMuchBreaksShouldBeGear();
        gasReleased+= mode.howManyGasShouldBeReleased();
    }
    public void decreaseSpeed(){
        speed+= mode.howMuchDecreaseSpeed();
        breaksWear+= mode.howMuchBreaksShouldBeGear();

    }


    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getEngineWear() {
        return engineWear;
    }

    public void setEngineWear(double engineWear) {
        this.engineWear = engineWear;
    }

    public double getBreaksWear() {
        return breaksWear;
    }

    public void setBreaksWear(double breaksWear) {
        this.breaksWear = breaksWear;
    }

    public double getGasReleased() {
        return gasReleased;
    }

    public void setGasReleased(double gasReleased) {
        this.gasReleased = gasReleased;
    }

    public Mode getMode() {
        return mode;
    }

    public void setMode(Mode mode) {
        this.mode = mode;
    }
}
